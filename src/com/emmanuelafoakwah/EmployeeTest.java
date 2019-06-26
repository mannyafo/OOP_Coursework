package com.emmanuelafoakwah;

/**
 *	Employee class JUnit tests
 *	@author Emmanuel Afoakwah
 *	@version 23.10.2018
 */

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
    private Employee e1;
    private Employee e2;
    private final static double TOLERANCE = 0.0001;

    @Before
    public void setup() {
        e1 = new Employee("Joe Bloggs", 2000, 40);
        e2 = new Employee("Jane Doe", 1000, 0); // Testing for zero tax rate

    }

    // e1 Tests
    //Testing Getters
    @Test
    public void test1() {
        String expectedName = "Joe Bloggs";
        double expectedTaxRate = 40;
        double expectedGrossSalary = 2000;
        double expectedNetSalary = 1200;

        String actualName = e1.getName();
        double actualTaxRate = e1.getTaxRate();
        double actualGrossSalary = e1.getMonthlyGrossSalary();
        double actualNetSalary = e1.getMonthlyNetSalary();

        assertEquals(expectedName, actualName);
        assertEquals(expectedTaxRate, actualTaxRate, TOLERANCE);
        assertEquals(expectedGrossSalary, actualGrossSalary, TOLERANCE);
        assertEquals(expectedNetSalary, actualNetSalary, TOLERANCE);
    }

    //Testing Salary Calcualation
    @Test
    public void test2(){

        e1.increaseSalary(5.0);
        double expectedGrossSalary = 2100;
        double expectedNetSalary = 1260;

        double actualGrossSalary = e1.getMonthlyGrossSalary();
        double actualNetSalary = e1.getMonthlyNetSalary();

        assertEquals(expectedGrossSalary, actualGrossSalary, TOLERANCE);
        assertEquals(expectedNetSalary, actualNetSalary, TOLERANCE);
    }

    //Testing Setters
    @Test
    public void test3(){
        String expectedName = "New Bloggs";
        double expectedTaxRate = 30;
        double expectedMonthlyGrossSalary = 2200;

        e1.setName("New Bloggs");
        e1.setTaxRate(30);
        e1.setMonthlyGrossSalary(2200);

        String actualName = e1.getName();
        double actualTaxRate = e1.getTaxRate();
        double actualMonthlyGrossSalary = e1.getMonthlyGrossSalary();

        assertEquals(expectedName, actualName);
        assertEquals(expectedTaxRate, actualTaxRate, TOLERANCE);
        assertEquals(expectedMonthlyGrossSalary, actualMonthlyGrossSalary, TOLERANCE);

    }


    // e2 Tests
    //Testing Getters
    @Test
    public void test4() {
        String expectedName = "Jane Doe";
        double expectedTaxRate = 0;
        double expectedGrossSalary = 1000;
        double expectedNetSalary = 1000;

        String actualName = e2.getName();
        double actualTaxRate = e2.getTaxRate();
        double actualGrossSalary = e2.getMonthlyGrossSalary();
        double actualNetSalary = e2.getMonthlyNetSalary();

        assertEquals(expectedName, actualName);
        assertEquals(expectedTaxRate, actualTaxRate, TOLERANCE);
        assertEquals(expectedGrossSalary, actualGrossSalary, TOLERANCE);
        assertEquals(expectedNetSalary, actualNetSalary, TOLERANCE);
    }

    //Testing Salary Calcualation
    @Test
    public void test5(){

        e2.increaseSalary(5.0);
        double expectedGrossSalary = 1050;
        double expectedNetSalary = 1050;

        double actualGrossSalary = e2.getMonthlyGrossSalary();
        double actualNetSalary = e2.getMonthlyNetSalary();

        assertEquals(expectedGrossSalary, actualGrossSalary, TOLERANCE);
        assertEquals(expectedNetSalary, actualNetSalary, TOLERANCE);
    }

    //Testing Setters
    @Test
    public void test6(){
        String expectedName = "Mrs New Bloggs";
        double expectedTaxRate = 100;
        double expectedMonthlyGrossSalary = 0;

        e2.setName("Mrs New Bloggs");
        e2.setTaxRate(100);
        e2.setMonthlyGrossSalary(0);

        String actualName = e2.getName();
        double actualTaxRate = e2.getTaxRate();
        double actualMonthlyGrossSalary = e2.getMonthlyGrossSalary();

        assertEquals(expectedName, actualName);
        assertEquals(expectedTaxRate, actualTaxRate, TOLERANCE);
        assertEquals(expectedMonthlyGrossSalary, actualMonthlyGrossSalary, TOLERANCE);

    }
}