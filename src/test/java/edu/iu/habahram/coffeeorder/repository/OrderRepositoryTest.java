package edu.iu.habahram.coffeeorder.repository;

import org.junit.jupiter.api.Test;

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