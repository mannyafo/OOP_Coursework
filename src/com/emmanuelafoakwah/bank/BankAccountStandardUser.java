package com.emmanuelafoakwah.bank;

import com.emmanuelafoakwah.bank.provided.BankAccount;
import com.emmanuelafoakwah.bank.provided.BankAccountStandardUserInterface;

/**
 *
 *	Software Workshop, Worksheet 6, Exercise 3
 *	BankAccountUser class, implements BankAccountStandardUserInterface
 *	@author Emmanuel Afoakwah
 *	@version 21.11.2018
 *
 */

public class BankAccountStandardUser extends BankAccountUser implements BankAccountStandardUserInterface {

    /** Declaring Bank Account Standard User Variables */
    private BankAccount bankAccount;
    private int maximumLoginAttempts = 3;
    private int loginAttempts;

    /**
     * Constructor taking three parameters
     * 1) Username
     * 2) Password
     * 3) bankAccount
     * LoginAttempts is set to 0 on construction to ensure correct count
     * @param username is the username of the standard bank account user
     * @param password is the password of the standard bank account user
     * @param bankAccount is the bank account of the standard user
     */
    public BankAccountStandardUser(String username, String password,
                                   BankAccount bankAccount){
        super(username, password);
        this.bankAccount = bankAccount;
        this.setLoginAttempts(0);
    }

    /**
     * Getter function for the bankAccount
     * @return bankAccount of the standard user
     */
    public BankAccount getBankAccount(){
        return bankAccount;
    }

    /**
     * Login function for the standard user
     * First, ensure that the maximum number of attempts has not been exceeded
     * Second, check the password for correctness
     * Third, if correct then the super login function is called, and attempts is reset
     *	if not, not login is attempted and the attempts is incremented
     * @param password is the password to attempt to login with
     */
    public void login(String password){
        if(loginAttempts < maximumLoginAttempts){
            if( passwordCorrect(password) ){
                super.login(password);
                this.setLoginAttempts(0);
            }else{
                loginAttempts++;
            }
        }
    }

    /**
     * Getter function for the login attempts
     * @return loginAttempts of the standard user
     */
    public int getLoginAttempts(){
        return loginAttempts;
    }

    /**
     * Setter for loginAttempts
     * @param loginAttempts to replace current value with
     */
    public void setLoginAttempts(int loginAttempts){
        this.loginAttempts = loginAttempts;
    }

    /**
     * Function to reset the loginAttempts
     */
    public void resetLoginAttempts(){
        this.setLoginAttempts(0);
    }

    /**
     * Function to transfer money to another account
     * First, checks if the user is logged in
     * if so, the money is transferred
     * @param toAccount is the account to transfer the balance to
     * @param amount is the amount to transfer to the account
     * @param password is the password to pass to the transferMoney function
     */
    public void transferMoney(BankAccount toAccount, long amount, String password){

        if(super.getLoggedIn()){
            bankAccount.transferMoney(toAccount, amount, password);
        }
    }

    /**
     * Function to print the balance of the account
     */
    public void printBalance(){
        bankAccount.printBalance();
    }

    /**
     * Function to print the statement of the account
     */
    public void printStatement(){
        bankAccount.printStatement();
    }

}