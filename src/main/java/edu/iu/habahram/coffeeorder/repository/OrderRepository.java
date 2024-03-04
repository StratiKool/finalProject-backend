package edu.iu.habahram.coffeeorder.repository;

import edu.iu.habahram.coffeeorder.model.*;
import org.springframework.stereotype.Repository;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class OrderRepository {
    private ArrayList<Integer> uniqueIds = new ArrayList<>();
    private static final String DATABASE_NAME = "db.txt";

    public Receipt add(OrderData order) throws Exception {
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
        uniqueIds.add(id);
        for (int i = 0; i < uniqueIds.size() - 1; i++) {
            if (uniqueIds.get(i) == id) {
                id = random.nextInt(99) + 1;
                uniqueIds.remove(i);
                uniqueIds.add(id);
            }
        }
        Path path = Paths.get(DATABASE_NAME);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile(), true))) {
            writer.write(id + ", " + beverage.cost() + ", " + beverage.getDescription() + System.lineSeparator());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Receipt receipt = new Receipt(beverage.getDescription(), beverage.cost(), id);
        return receipt;
    }

    public Receipt getLatest() throws IOException {
        ArrayList<Receipt> receipts = new ArrayList<>();
        float cost = 0.0F;
        int id = 0;
        String description;
        Path path = Paths.get(DATABASE_NAME);
        List<String> data = Files.readAllLines(path);
        for(String line : data) {
            String[] words = line.split(", ");
            id = Integer.parseInt(words[0]);
            cost = Float.parseFloat(words[1]);
            description = words[2];
            Receipt r = new Receipt(description, cost, id);
            receipts.add(r);
        }
        if(receipts.isEmpty()){
            return null;
        }
        return receipts.get(receipts.size()-1);
    }

}
