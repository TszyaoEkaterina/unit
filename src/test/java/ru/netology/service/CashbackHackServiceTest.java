package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
        public void shouldReturnCorrectRemainWithCommonAmount() {
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(actual,expected);
    }
    @Test
    public void shouldReturn1000IfAmountIs0() {
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual,expected);
    }
    @Test
    public void shouldReturn0IfAmountIsAMultipleOf1000() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual,expected);
    }
}