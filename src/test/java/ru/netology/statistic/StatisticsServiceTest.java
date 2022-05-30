package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMaxFirst() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxLast() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {10, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxMiddle() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {10, 5, 8, 4, 5, 13, 8, 6, 11, 11, 12};
        long expected = 13;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}