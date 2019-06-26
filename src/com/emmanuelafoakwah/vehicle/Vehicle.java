package com.emmanuelafoakwah.vehicle;

/**
 *	vehicle Class
 *	@author Emmanuel Afoakwah
 *	@version 17.11.2018
 */

public class Vehicle {

    /** Passenger Number & Max Speed Variables */
    private int passengerNumber;
    private int maxSpeed;

    /**
     * This constructor creates a vehicle from two inputs:
     * 1) Passenger Number
     * 2) Max Speed
     * @param passengerNumber The passenger number of the vehicle
     * @param maxSpeed The maximum speed of the vehicle
     */
    public Vehicle(int passengerNumber, int maxSpeed){
        this.passengerNumber = passengerNumber;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Getter for the passenger number
     * @return The passenger number of the vehicle
     */
    public int getPassengerNumber(){
        return passengerNumber;
    }

    /**
     * Getter for the passenger number
     * @return The passenger number of the vehicle
     */
    public int getMaxSpeed(){
        return maxSpeed;
    }

    /**
     * Setter for the passenger number
     * @param passenger number for vehicle
     */
    public void setPassengerNumber(int passengerNumber){
        this.passengerNumber = passengerNumber;
    }

    /**
     * Setter for the maximum speed
     * @param maximum speed of vehicle
     */
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    /**
     * toString method for the vehicle
     * @return A string representation of the vehicle
     */
    public String toString(){
        return "vehicle Details -> "
                + "Passenger Number: " + passengerNumber
                + "Max Speed: " + maxSpeed;
    }

}
