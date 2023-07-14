package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testWithRemain() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(800);
        int expected = 200;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testWithoutRemain() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }
}