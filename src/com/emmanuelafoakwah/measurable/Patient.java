package com.emmanuelafoakwah.measurable;

/**
 *	Invoice Class, Implementing Measurable Interface
 *	@author Emmanuel Afoakwah
 *	@version 17.11.2018
 */

public class Patient implements Measurable{

    private String name;
    private int age;
    private double weight;

    /**
     * Constructor creates Patient from three imputs:
     * 1) Name
     * 2) Age
     * 3) Weight
     * @param name The name of the patient
     * @param age The age of the patient
     * @param weight The weight of the patient
     */
    public Patient(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    /**
     * Getter for the relevant value (weight)
     * @return The weight of the patient
     */
    public double getValue(){
        return weight;
    }

    /**
     * toString method for the patient
     * @return A string representation of the patient
     */
    public String toString(){
        return "Patient Details -> \n" +
                "Name: " + name +
                "Age: " + age +
                "Weight: " + weight;
    }

}
