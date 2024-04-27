package edu.iu.habahram.coffeeorder.repository;

import edu.iu.habahram.coffeeorder.model.OrderData;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepositoryTest {
    private static final String DATABASE_NAME = "db.txt";

    @Test
    void add1() throws Exception {
        int one = 1;
        int two = 2;
        assertNotEquals(one, two);
    }
}