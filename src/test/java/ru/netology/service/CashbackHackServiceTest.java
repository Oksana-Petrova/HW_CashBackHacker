package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testWithRemain() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(800);
        int expected = 200;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testWithoutRemain() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }
}