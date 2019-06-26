package com.emmanuelafoakwah;

/**
 *	Employee class with constructor
 *	@author Emmanuel Afoakwah
 *	@version 23.10.2018
 */

public class Employee {

    private String name;
    private double monthlyGrossSalary;
    private double taxRate;

    /**
     *	Employee Constructor
     *	@param name is the name of the employee
     *	@param monthlyGrossSalary is the monthly gross salary of the employee
     *	@param isbn is the ISBN of the book
     */
    public Employee(String name, double monthlyGrossSalary, double taxRate){
        this.name = name;
        this.monthlyGrossSalary = monthlyGrossSalary;
        this.taxRate = taxRate;
    }

    /** @return the name of the employee as a String */
    public String getName(){ return name; }

    /** @return the monthly gross salary of the employee as a double */
    public double getMonthlyGrossSalary(){ return monthlyGrossSalary; }

    /** @return the tax rate of the employee as a double */
    public double getTaxRate(){ return taxRate; }

    /** Sets the name of the employee
     *   @param name is the name to change to
     */
    public void setName(String name){
        this.name = name;
    }

    /** Sets the monthly gross salary of the employee
     *   @param monthlyGrossSalary is the name to change to
     */
    public void setMonthlyGrossSalary(double monthlyGrossSalary){
        this.monthlyGrossSalary = monthlyGrossSalary;
    }

    /** Sets the tax rate of the employee
     *   @param taxRate is the name to change to
     */
    public void setTaxRate(double taxRate){
        this.taxRate = taxRate;
    }

    /** Prints the name, gross monthly salary and tax rate of the employee
     *   @return a string summarising the employee
     */
    public String toString(){
        return 	name + " has a monthly gross salary of \u00A3" + monthlyGrossSalary
                + " , a taxrate of " + taxRate + "U+0025"
                + ", and a monthly net salary of \u00A3" + getMonthlyNetSalary()
                + ".";
    }

    /** Computes the monthly net salary of the employee
     *   @return the monthly net salary
     */
    public double getMonthlyNetSalary(){

        // Return the untaxed proportion multiplied by the gross salary
        return ((1-(taxRate/100))*monthlyGrossSalary);
    }

    /** Increases the monthly salary by the rate given in the argument
     *   @param rate by which to increase the monthly gross salary
     */
    public void increaseSalary(double rate){

        // Gross salary is increased by the % increase multiplied by the gross salary
        monthlyGrossSalary += (monthlyGrossSalary*(rate/100));
    }

}
