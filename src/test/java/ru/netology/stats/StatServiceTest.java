package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.assertEquals;;

class StatServiceTest {
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @org.junit.jupiter.api.Test
    void calculateSum() {
        StatService service = new StatService();
        int expected = 180;
        int actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calculateAverage() {
        StatService service = new StatService();
        int expected = 15;
        int actual = service.calculateAverage(purchases);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void findMonthWithMaxPurchase() {
        StatService service = new StatService();
        int expected = 7;
        int actual = service.findMonthWithMaxPurchase(purchases);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void findMonthWithMinPurchase() {
        StatService service = new StatService();
        int expected = 8;
        int actual = service.findMonthWithMinPurchase(purchases);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void findMonthsUnderAverage() {
        StatService service = new StatService();
        int expected = 5;
        int actual = service.findMonthsUnderAverage(purchases);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void findMonthsOverAverage() {
        StatService service = new StatService();
        int expected = 5;
        int actual = service.findMonthsOverAverage(purchases);
        assertEquals(expected, actual);
    }
}
