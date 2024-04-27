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


public class OrderFileRepository {
    private static final String DATABASE_NAME = "db.txt";

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
            Receipt r = new Receipt(id, description, cost);
            receipts.add(r);
        }
        System.out.println("Size of receipts in getLatest: ");
        System.out.println(receipts.size());
        if(receipts.isEmpty()){
            return null;
        }
        return receipts.get(receipts.size()-1);
    }

}
