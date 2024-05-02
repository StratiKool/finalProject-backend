package edu.iu.habahram.coffeeorder.controllers;

import edu.iu.habahram.coffeeorder.model.*;
import edu.iu.habahram.coffeeorder.repository.FlowerRepository;
import edu.iu.habahram.coffeeorder.repository.OrderFileRepository;
import edu.iu.habahram.coffeeorder.repository.OrderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
@CrossOrigin
public class OrderController {
    private OrderRepository orderRepository;
    private OrderFileRepository orderFileRepository;
    private FlowerRepository flowerRepository;

    public OrderController(OrderRepository orderRepository,
                           OrderFileRepository orderFileRepository,
                           FlowerRepository flowerRepository){
        this.orderRepository = orderRepository;
        this.orderFileRepository = orderFileRepository;
        this.flowerRepository = flowerRepository;
    }

    @PostMapping("/orders")
    public OrderReceipt add(@RequestBody OrderData order){
        try{
            Flowers flower = null;
            switch(order.name().toLowerCase()){
                case "candy crush":
                    flower = new CandyCrush();
                    break;
                case "cupcake":
                    flower = new Cupcake();
                    break;
                case "exuberance":
                    flower = new Exuberance();
                    break;
                case "lotta love":
                    flower = new LottaLove();
                    break;
                case "sprinkles":
                    flower = new Sprinkles();
                    break;
                case "sugar rush":
                    flower = new SugarRush();
                    break;
            }
            if(flower == null){
                throw new Exception("Flower type '%s' is not valid!".formatted(order.name()));
            }
            Random random = new Random();
            int id = random.nextInt(1000)+1;
            OrderReceipt receipt = new OrderReceipt(id, flower.name(), flower.cost());
            return orderRepository.save(receipt);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/orders/{customerId}")
    public ResponseEntity<OrderReceipt> find(@PathVariable int id) {
        try {
            Optional<OrderReceipt> order = orderRepository.findById(id);
            if (!order.isEmpty()) {
                return ResponseEntity.status(HttpStatus.FOUND)
                        .body(order.get());
            } else {
                return ResponseEntity
                        .status(HttpStatus.NOT_FOUND)
                        .body(null);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/addFlowers")
    public Iterable<RealFlowers> addALl() {
        try {
            List<RealFlowers> flowers = new ArrayList<>();
            RealFlowers f = new RealFlowers();
            f.setName("Candy Crush");
            f.setCost(54.00F);
            flowers.add(f);
            RealFlowers f2 = new RealFlowers();
            f2.setName("Cupcake");
            f2.setCost(54.00F);
            flowers.add(f2);
            RealFlowers f3 = new RealFlowers();
            f3.setName("Exuberance");
            f3.setCost(58.00F);
            flowers.add(f3);
            RealFlowers f4 = new RealFlowers();
            f4.setName("Lotta Love");
            f4.setCost(58.00F);
            flowers.add(f4);
            RealFlowers f5 = new RealFlowers();
            f5.setName("Sprinkles");
            f5.setCost(62.00F);
            flowers.add(f5);
            RealFlowers f6 = new RealFlowers();
            f6.setName("Sugar Rush");
            f6.setCost(62.00F);
            flowers.add(f6);
            return flowerRepository.saveAll(flowers);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/flowers")
    public Iterable<RealFlowers> getAll() {
        try {
            return flowerRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/{id}/image")
    public ResponseEntity<?> getImage(@PathVariable int id){
        try{
            byte[] image = orderFileRepository.getImage(id);
            return ResponseEntity.status(HttpStatus.FOUND).contentType(MediaType.IMAGE_JPEG).body(image);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}

