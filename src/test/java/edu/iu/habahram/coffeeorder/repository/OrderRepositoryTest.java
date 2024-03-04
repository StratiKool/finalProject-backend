package edu.iu.habahram.coffeeorder.repository;

import edu.iu.habahram.coffeeorder.model.OrderData;
import edu.iu.habahram.coffeeorder.model.Receipt;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Or;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepositoryTest {
    private static final String DATABASE_NAME = "db.txt";
    @Test
    void add1() throws Exception {
        OrderRepository orderRepository = new OrderRepository();

        OrderData orderData = new OrderData("Espresso", Arrays.asList("Soy"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Espresso"));
        assertTrue(fileContent.contains("Soy"));
    }

    @Test
    void add2() throws Exception {
        OrderRepository orderRepository = new OrderRepository();

        OrderData orderData = new OrderData("Espresso", Arrays.asList("Whip"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Espresso"));
        assertTrue(fileContent.contains("Whip"));
    }

    @Test
    void add3() throws Exception {
        OrderRepository orderRepository = new OrderRepository();

        OrderData orderData = new OrderData("Espresso", Arrays.asList("Milk"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Espresso"));
        assertTrue(fileContent.contains("Milk"));
    }

    @Test
    void add4() throws Exception {
        OrderRepository orderRepository = new OrderRepository();

        OrderData orderData = new OrderData("Espresso", Arrays.asList("Mocha"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Espresso"));
        assertTrue(fileContent.contains("Mocha"));
    }

    @Test
    void add5() throws Exception {
        OrderRepository orderRepository = new OrderRepository();

        OrderData orderData = new OrderData("Dark Roast", Arrays.asList("Soy"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Dark roast"));
        assertTrue(fileContent.contains("Soy"));
    }

    @Test
    void add6() throws Exception {
        OrderRepository orderRepository = new OrderRepository();

        OrderData orderData = new OrderData("Dark Roast", Arrays.asList("Whip"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Dark roast"));
        assertTrue(fileContent.contains("Whip"));
    }

    @Test
    void add7() throws Exception {
        OrderRepository orderRepository = new OrderRepository();

        OrderData orderData = new OrderData("Dark roast", Arrays.asList("Milk"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Dark roast"));
        assertTrue(fileContent.contains("Milk"));
    }

    @Test
    void add8() throws Exception {
        OrderRepository orderRepository = new OrderRepository();

        OrderData orderData = new OrderData("Dark Roast", Arrays.asList("Mocha"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Dark roast"));
        assertTrue(fileContent.contains("Mocha"));
    }

    @Test
    void add9() throws Exception {
        OrderRepository orderRepository = new OrderRepository();

        OrderData orderData = new OrderData("House Blend", Arrays.asList("Soy"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("House Blend"));
        assertTrue(fileContent.contains("Soy"));
    }

    @Test
    void add10() throws Exception {
        OrderRepository orderRepository = new OrderRepository();

        OrderData orderData = new OrderData("House Blend", Arrays.asList("Whip"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("House Blend"));
        assertTrue(fileContent.contains("Whip"));
    }

    @Test
    void add11() throws Exception {
        OrderRepository orderRepository = new OrderRepository();

        OrderData orderData = new OrderData("House Blend", Arrays.asList("Milk"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("House Blend"));
        assertTrue(fileContent.contains("Milk"));
    }

    @Test
    void add12() throws Exception {
        OrderRepository orderRepository = new OrderRepository();

        OrderData orderData = new OrderData("House Blend", Arrays.asList("Mocha"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("House Blend"));
        assertTrue(fileContent.contains("Mocha"));
    }

    @Test
    void add13() throws Exception {
        OrderRepository orderRepository = new OrderRepository();

        OrderData orderData = new OrderData("Decaf", Arrays.asList("Soy"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Decaf"));
        assertTrue(fileContent.contains("Soy"));
    }

    @Test
    void add14() throws Exception {
        OrderRepository orderRepository = new OrderRepository();

        OrderData orderData = new OrderData("Decaf", Arrays.asList("Whip"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Decaf"));
        assertTrue(fileContent.contains("Whip"));
    }

    @Test
    void add15() throws Exception {
        OrderRepository orderRepository = new OrderRepository();

        OrderData orderData = new OrderData("Decaf", Arrays.asList("Milk"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Decaf"));
        assertTrue(fileContent.contains("Milk"));
    }

    @Test
    void add16() throws Exception {
        OrderRepository orderRepository = new OrderRepository();

        OrderData orderData = new OrderData("Decaf", Arrays.asList("Mocha"));
        orderRepository.add(orderData);

        String fileContent = Files.readString(Path.of(DATABASE_NAME));
        assertTrue(fileContent.contains("Decaf"));
        assertTrue(fileContent.contains("Mocha"));
    }

}