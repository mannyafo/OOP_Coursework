package com.emmanuelafoakwah.bank;

import com.emmanuelafoakwah.bank.provided.BankAccountUserInterface;

/**
 *
 *	Software Workshop, Worksheet 6, Exercise 3
 *	BankAccountUser class, implements BankAccountUserInterface
 *	@author Emmanuel Afoakwah
 *	@version 21.11.2018
 *
 */

public abstract class BankAccountUser implements BankAccountUserInterface {

    /** Declaring Bank Account User Variables */
    private String username;
    private String password;
    private boolean loggedIn;

    /**
     * Constructor taking two parameters
     * 1) Username
     * 2) Password
     * Logged in is set to false at construction to ensure authentication
     * step is not bypassed
     * @param username is the username of the bank account user
     * @param password is the password of the bank account user
     */
    public BankAccountUser(String username, String password){
        this.username = username;
        this.password = password;
        this.setLoggedIn(false);
    }

    /**
     * This function checks whether the password is correct
     * (via appropriate function defined below)
     * and handles changing loggedIn boolean if appropriate
     * @param password is the password to check for suitability
     * before logging in
     */
    public void login(String password){
        if( passwordCorrect(password) ){
            loggedIn = true;
        }
    }

    /**
     * Function logs out by setting the loggedIn boolean to false
     */
    public void logout(){
        this.loggedIn = false;
    }

    /**
     * This function actually checks for equality between the attempted password
     * and the actual password
     * @return returning true if the password was correct
     */
    public boolean passwordCorrect(String password){
        if( this.password.equals(password) ){
            return true;
        }else{
            return false;
        }
    }

    /**
     * This function replaces the current password with a new one
     * @param password is the new password to assign
     */
    public void setPassword(String password){
        this.password = password;
    }

    /**
     * This is a getter function for the loggedIn boolean
     * @return the value of the loggedIn boolean
     */
    public boolean getLoggedIn(){
        return loggedIn;
    }

    /**
     * This function sets the value of the loggedIn boolean
     * @param loggedIn is the boolean value to assign to the loggedIn variable
     */
    public void setLoggedIn(boolean loggedIn){
        this.loggedIn = loggedIn;
    }

}
