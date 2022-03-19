package ru.netology.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackerTest {
    CashbackHacker service = new CashbackHacker();

    @org.junit.jupiter.api.Test
    public void shouldIfAmountBuyingZero() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    public void shouldIfAmountEqualBoundary() {// Тест не проходит
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    public void shouldIfAmountOver() {
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldIfAmountLessBoundary() {
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }


}