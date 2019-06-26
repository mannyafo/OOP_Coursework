package com.emmanuelafoakwah;

/**
 *	Basic BankAccount class with constructor
 *	@author Emmanuel Afoakwah
 *	@version 23.10.2018
 */

public class BankAccount {

    private int accountNumber;
    private int balance;
    private int setupFee;

    /**
     *	Book Constructor
     *	@param accountNumber is the account number of the bank account
     *	@param initialDeposit is the starting balance for the account
     *	@param setupFee is the upfront fee for creating the account
     */
    public BankAccount(int accountNumber, int initialDeposit, int setupFee){
        this.accountNumber = accountNumber;
        this.setupFee = setupFee;
        balance = initialDeposit - this.setupFee;
    }

    /** @return the account number of bank account */
    public int getAccountNumber(){ return accountNumber; }

    /** @return the balance of bank account */
    public int getBalance(){ return balance; }

    /** @return the setup fee of bank account */
    public int getSetupFee(){ return setupFee; }

    /** Sets the balance of the bank account
     *   @param balance is the balance to change to
     */
    public void setBalance(int balance){
        this.balance = balance;
    }

    /**
     *   Prints the account number, balance and setup fee of the book
     *   @return a string summarising the bank account
     */
    public String toString(){
        return "Account Number: " + accountNumber
                + "Balance: " + balance
                + "Setup Fee: " + setupFee;
    }

}
