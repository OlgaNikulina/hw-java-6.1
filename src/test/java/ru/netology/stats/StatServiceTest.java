package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {

    @org.junit.jupiter.api.Test
    void calculateSum() {
        StatService service = new StatService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calculateAverage() {
        StatService service = new StatService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = (int) service.calculateAverage(purchases);
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void findMonthWithMaxPurchase() {
        StatService service = new StatService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findMonthWithMaxPurchase(purchases);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void findMonthsUnderAverage() {
        StatService service = new StatService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findMonthsUnderAverage(purchases);
        assertEquals(expected, actual);
    }
}







