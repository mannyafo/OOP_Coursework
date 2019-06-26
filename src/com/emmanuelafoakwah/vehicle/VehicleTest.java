package com.emmanuelafoakwah.vehicle;

/**
 *	vehicle Class JUnit Tests
 *	@author Emmanuel Afoakwah
 *	@version 17.11.2018
 */

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class VehicleTest {

    public static final double TOLERANCE = 0.00001;
    private Vehicle vehicle;
    private Bus bus;

    @Before
    public void setUp(){
        vehicle = new Vehicle(5,170);
        bus = new Bus(50, 90, 43.2);
    }

    /** Testing getters for vehicle */
    @Test
    public void test1() {

        int expectedNumOfPassengers = 5;
        int actualNumOfPassengers = vehicle.getPassengerNumber();
        assertEquals(expectedNumOfPassengers,actualNumOfPassengers);

        int expectedMaxSpeed = 170;
        int actualMaxSpeed = vehicle.getMaxSpeed();
        assertEquals(expectedMaxSpeed,actualMaxSpeed);

    }

    /** Testing getters for bus */
    @Test
    public void test2() {

        int expectedNumOfPassengers = 50;
        int actualNumOfPassengers = bus.getPassengerNumber();
        assertEquals(expectedNumOfPassengers,actualNumOfPassengers);

        int expectedMaxSpeed = 90;
        int actualMaxSpeed = bus.getMaxSpeed();
        assertEquals(expectedMaxSpeed,actualMaxSpeed);

        double expectedFuelCons = 43.2;
        double actualFuelCons = bus.getFuelConsumption();
        assertEquals(expectedFuelCons,actualFuelCons,TOLERANCE);

    }

    /** Testing setters for vehicle */
    @Test
    public void test3() {

        vehicle.setPassengerNumber(1);
        int expectedNumOfPassengers = 1;
        int actualNumOfPassengers = vehicle.getPassengerNumber();
        assertEquals(expectedNumOfPassengers,actualNumOfPassengers);

        vehicle.setMaxSpeed(200);
        int expectedMaxSpeed = 200;
        int actualMaxSpeed = vehicle.getMaxSpeed();
        assertEquals(expectedMaxSpeed,actualMaxSpeed);

    }

    /** Testing setters for bus */
    @Test
    public void test4() {

        bus.setPassengerNumber(60);
        int expectedNumOfPassengers = 60;
        int actualNumOfPassengers = bus.getPassengerNumber();
        assertEquals(expectedNumOfPassengers,actualNumOfPassengers);

        bus.setMaxSpeed(70);
        int expectedMaxSpeed = 70;
        int actualMaxSpeed = bus.getMaxSpeed();
        assertEquals(expectedMaxSpeed,actualMaxSpeed);


        bus.setFuelConsumption(61.2);
        double expectedFuelCons = 61.2;
        double actualFuelCons = bus.getFuelConsumption();
        assertEquals(expectedFuelCons,actualFuelCons,TOLERANCE);

    }

}