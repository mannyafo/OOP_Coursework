package com.emmanuelafoakwah;

/**
 *	BankAccount class JUnit Tests
 *	@author Emmanuel Afoakwah
 *	@version 23.10.2018
 */

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

    private BankAccount b1;
    private BankAccount b2;
    private BankAccount b3;

    @Before
    public void setup() {

        b1 = new BankAccount(12345678, 10000, 100);
        b2 = new BankAccount(23456789, 0, 15); //Testing 0 balances
        b3 = new BankAccount(34567898, -100, 200); // Testing negative balances
    }

    // B1 Tests:
    // Testing getAccountNumber
    @Test
    public void test1() {
        int expected = 12345678;
        int actual = b1.getAccountNumber();
        assertEquals(expected, actual);
    }

    // Testing getBalance
    @Test
    public void test2() {
        int expected = 9900;
        int actual = b1.getBalance();
        assertEquals(expected, actual);
    }

    // Testing getSetupFee
    @Test
    public void test3() {
        int expected = 100;
        int actual = b1.getSetupFee();
        assertEquals(expected, actual);
    }

    // Testing setBalance
    @Test
    public void test4() {
        b1.setBalance(2231);
        int expected = 2231;
        int actual = b1.getBalance();
        assertEquals(expected, actual);
    }


    // B2 Tests:
    // Testing getAccountNumber
    @Test
    public void test5() {
        int expected = 23456789;
        int actual = b2.getAccountNumber();
        assertEquals(expected, actual);
    }

    // Testing getBalance
    @Test
    public void test6() {
        int expected = -15;
        int actual = b2.getBalance();
        assertEquals(expected, actual);
    }

    // Testing getSetupFee
    @Test
    public void test7() {
        int expected = 15;
        int actual = b2.getSetupFee();
        assertEquals(expected, actual);
    }

    // Testing setBalance - testing zero balances
    @Test
    public void test8() {
        b2.setBalance(0);
        int expected = 0;
        int actual = b2.getBalance();
        assertEquals(expected, actual);
    }

    // B3 Tests:
    // Testing getAccountNumber
    @Test
    public void test9() {
        int expected = 34567898;
        int actual = b3.getAccountNumber();
        assertEquals(expected, actual);
    }

    // Testing getBalance
    @Test
    public void test10() {
        int expected = -300;
        int actual = b3.getBalance();
        assertEquals(expected, actual);
    }

    // Testing getSetupFee
    @Test
    public void test11() {
        int expected = 200;
        int actual = b3.getSetupFee();
        assertEquals(expected, actual);
    }

    // Testing setBalance - testing zero balances
    @Test
    public void test12() {
        b3.setBalance(-200);
        int expected = -200;
        int actual = b3.getBalance();
        assertEquals(expected, actual);
    }

}