package com.emmanuelafoakwah.measurable;

/**
 *	Invoice Class, Implementing Measurable Interface
 *	@author Emmanuel Afoakwah
 *	@version 17.11.2018
 */

public class Invoice implements Measurable{

    private String accountNumber;
    private String sortCode;
    private double amount;

    /**
     * Constructor creates Invoice from three imputs:
     * 1) Account Number
     * 2) Sort Code
     * 3) Amount
     * @param accountNumber The account number of the invoice
     * @param sortCode The sort code of the invoice
     * @param amount The amount of the invoice
     */
    public Invoice(String accountNumber, String sortCode, double amount){
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.amount = amount;
    }

    /**
     * Getter for the relevant value (amount)
     * @return The amount of the invoice
     */
    public double getValue(){
        return amount;
    }

    /**
     * toString method for the invoice
     * @return A string representation of the invoice
     */
    public String toString(){
        return "Invoice Details -> \n" +
                "Account Number: " + accountNumber +
                "Sort Code: " + sortCode +
                "Amount: " + amount;
    }

}
