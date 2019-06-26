package com.emmanuelafoakwah;

/**
 *	Book class JUnit Tests
 *	@author Emmanuel Afoakwah
 *	@version 23.10.2018
 */

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BookTest {
    private Book b1;
    private Book b2;

    @Before
    public void setup() {
        b1 = new Book("The Test Book", 2017, "123-4-56-7898765");
        b2 = new Book("The Test Book Second Edition", 2018, ""); // Testing book with no ISBN
    }

    // B1 Tests:
    // Testing getTitle
    @Test
    public void test1() {
        String expected = "The Test Book";
        String actual = b1.getTitle();
        assertEquals(expected, actual);
    }

    // Testing getYear
    @Test
    public void test2() {
        int expected = 2017;
        int actual = b1.getYear();
        assertEquals(expected, actual);
    }

    // Testing getIsbn
    @Test
    public void test3() {
        String expected = "123-4-56-7898765";
        String actual = b1.getIsbn();
        assertEquals(expected, actual);
    }

    // Testing setTitle
    @Test
    public void test4() {
        b1.setTitle("The new title");
        String expected = "The new title";
        String actual = b1.getTitle();
        assertEquals(expected, actual);
    }

    // B2 Tests:
    // Testing getTitle
    @Test
    public void test5() {
        String expected = "The Test Book Second Edition";
        String actual = b2.getTitle();
        assertEquals(expected, actual);
    }

    // Testing getYear
    @Test
    public void test6() {
        int expected = 2018;
        int actual = b2.getYear();
        assertEquals(expected, actual);
    }

    // Testing getIsbn
    @Test
    public void test7() {
        String expected = "";
        String actual = b2.getIsbn();
        assertEquals(expected, actual);
    }

    // Testing setTitle
    @Test
    public void test8() {
        b2.setTitle("The Test Book Second Edition Volume 2");
        String expected = "The Test Book Second Edition Volume 2";
        String actual = b2.getTitle();
        assertEquals(expected, actual);
    }
}