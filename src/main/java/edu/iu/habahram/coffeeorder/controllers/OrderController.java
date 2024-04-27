package edu.iu.habahram.coffeeorder.controllers;

import edu.iu.habahram.coffeeorder.model.*;
import edu.iu.habahram.coffeeorder.repository.OrderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.Random;

@RestController
@CrossOrigin
@RequestMapping("/orders")
public class OrderController {
    private OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PostMapping
    public Receipt add(@RequestBody OrderData order) {
        try{
            Beverage beverage = null;
            switch (order.beverage().toLowerCase()) {
                case "dark roast":
                    beverage = new DarkRoast();
                    break;
                case "house blend":
                    beverage = new HouseBlend();
                    break;
                case "espresso":
                    beverage = new Espresso();
                    break;
                case "decaf":
                    beverage = new Decaf();
                    break;
            }
            if (beverage == null) {
                throw new Exception("Beverage type '%s' is not valid!".formatted(order.beverage()));
            }
            for (String condiment : order.condiments()) {
                switch (condiment.toLowerCase()) {
                    case "milk":
                        beverage = new Milk(beverage);
                        break;
                    case "mocha":
                        beverage = new Mocha(beverage);
                        break;
                    case "whip":
                        beverage = new Whip(beverage);
                        break;
                    case "soy":
                        beverage = new Soy(beverage);
                        break;
                    default:
                        throw new Exception("Condiment type '%s' is not valid".formatted(condiment));
                }
            }
            Random random = new Random();
            int id = random.nextInt(99) + 1;
            Receipt receipt = new Receipt(id,beverage.getDescription(),beverage.cost());
            System.out.printf(receipt.toString());
            return orderRepository.save(receipt);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
