package edu.iu.habahram.coffeeorder.repository;

import edu.iu.habahram.coffeeorder.model.OrderData;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepositoryTest {
    private static final String DATABASE_NAME = "db.txt";

    void add1() throws Exception {
        OrderFileRepository orderRepository = new OrderFileRepository();

        OrderData orderData = new OrderData("Espresso", Arrays.asList("Soy"));


        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Espresso"));
        assertTrue(fileContent.contains("Soy"));
    }


    void add2() throws Exception {
        OrderFileRepository orderRepository = new OrderFileRepository();

        OrderData orderData = new OrderData("Espresso", Arrays.asList("Whip"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Espresso"));
        assertTrue(fileContent.contains("Whip"));
    }


    void add3() throws Exception {
        OrderFileRepository orderRepository = new OrderFileRepository();

        OrderData orderData = new OrderData("Espresso", Arrays.asList("Milk"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Espresso"));
        assertTrue(fileContent.contains("Milk"));
    }


    void add4() throws Exception {
        OrderFileRepository orderRepository = new OrderFileRepository();

        OrderData orderData = new OrderData("Espresso", Arrays.asList("Mocha"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Espresso"));
        assertTrue(fileContent.contains("Mocha"));
    }


    void add5() throws Exception {
        OrderFileRepository orderRepository = new OrderFileRepository();

        OrderData orderData = new OrderData("Dark Roast", Arrays.asList("Soy"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Dark roast"));
        assertTrue(fileContent.contains("Soy"));
    }


    void add6() throws Exception {
        OrderFileRepository orderRepository = new OrderFileRepository();

        OrderData orderData = new OrderData("Dark Roast", Arrays.asList("Whip"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Dark roast"));
        assertTrue(fileContent.contains("Whip"));
    }


    void add7() throws Exception {
        OrderFileRepository orderRepository = new OrderFileRepository();

        OrderData orderData = new OrderData("Dark roast", Arrays.asList("Milk"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Dark roast"));
        assertTrue(fileContent.contains("Milk"));
    }


    void add8() throws Exception {
        OrderFileRepository orderRepository = new OrderFileRepository();

        OrderData orderData = new OrderData("Dark Roast", Arrays.asList("Mocha"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Dark roast"));
        assertTrue(fileContent.contains("Mocha"));
    }


    void add9() throws Exception {
        OrderFileRepository orderRepository = new OrderFileRepository();

        OrderData orderData = new OrderData("House Blend", Arrays.asList("Soy"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("House Blend"));
        assertTrue(fileContent.contains("Soy"));
    }


    void add10() throws Exception {
        OrderFileRepository orderRepository = new OrderFileRepository();

        OrderData orderData = new OrderData("House Blend", Arrays.asList("Whip"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("House Blend"));
        assertTrue(fileContent.contains("Whip"));
    }


    void add11() throws Exception {
        OrderFileRepository orderRepository = new OrderFileRepository();

        OrderData orderData = new OrderData("House Blend", Arrays.asList("Milk"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("House Blend"));
        assertTrue(fileContent.contains("Milk"));
    }


    void add12() throws Exception {
        OrderFileRepository orderRepository = new OrderFileRepository();

        OrderData orderData = new OrderData("House Blend", Arrays.asList("Mocha"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("House Blend"));
        assertTrue(fileContent.contains("Mocha"));
    }


    void add13() throws Exception {
        OrderFileRepository orderRepository = new OrderFileRepository();

        OrderData orderData = new OrderData("Decaf", Arrays.asList("Soy"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Decaf"));
        assertTrue(fileContent.contains("Soy"));
    }


    void add14() throws Exception {
        OrderFileRepository orderRepository = new OrderFileRepository();

        OrderData orderData = new OrderData("Decaf", Arrays.asList("Whip"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Decaf"));
        assertTrue(fileContent.contains("Whip"));
    }


    void add15() throws Exception {
        OrderFileRepository orderRepository = new OrderFileRepository();

        OrderData orderData = new OrderData("Decaf", Arrays.asList("Milk"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Decaf"));
        assertTrue(fileContent.contains("Milk"));
    }


    void add16() throws Exception {
        OrderFileRepository orderRepository = new OrderFileRepository();

        OrderData orderData = new OrderData("Decaf", Arrays.asList("Mocha"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Decaf"));
        assertTrue(fileContent.contains("Mocha"));
    }

}