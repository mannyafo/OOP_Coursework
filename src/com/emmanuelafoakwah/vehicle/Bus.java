package com.emmanuelafoakwah.vehicle;

/**
 *	Bus Class
 *	@author Emmanuel Afoakwah
 *	@version 17.11.2018
 */

public class Bus extends Vehicle{

    /** Fuel Consumption Variable */
    private double fuelConsumption;

    /**
     * This constructor creates a Bus from two inputs:
     * 1) Passenger Number
     * 2) Max Speed
     * 3) Fuel Consumption
     * @param passengerNumber The passenger number of the bus
     * @param maxSpeed The maximum speed of the bus
     * @param fuelConsumption The fuel consumption of the bus
     */
    public Bus(int passengerNumber, int maxSpeed, double fuelConsumption){
        super(passengerNumber, maxSpeed);
        this.fuelConsumption = fuelConsumption;
    }

    /**
     * Getter for the fuel consumption
     * @return The fuel consumption of the account
     */
    public double getFuelConsumption(){
        return fuelConsumption;
    }

    /**
     *  Setter for the fuel consumption
     *  @param fuelConsumption The new fuel consumption of the bus
     */
    public void setFuelConsumption(double fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }

    /**
     * toString method for the bus
     * @return A string representation of the bus
     */
    @Override
    public String toString(){
        return super.toString() +
                " Fuel Consumption: " + fuelConsumption;
    }

}
