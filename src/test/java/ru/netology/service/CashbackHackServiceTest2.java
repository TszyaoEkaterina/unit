package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest2 {
    CashbackHackService service = new CashbackHackService();
    
    @Test
    public void shouldReturnCorrectRemainWithCommonAmount() {
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(expected,actual);
    }
    
    @Test
    public void shouldReturn1000IfAmountIs0() {
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(expected,actual);
    }
    
    @Test
    public void shouldReturn0IfAmountIsAMultipleOf1000() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected,actual);
    }
    
}