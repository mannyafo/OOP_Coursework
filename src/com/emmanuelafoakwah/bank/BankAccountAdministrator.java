package com.emmanuelafoakwah.bank;

import com.emmanuelafoakwah.bank.provided.BankAccountAdministratorInterface;

import java.util.ArrayList;

/**
 *	BankAccountAdministrator class, implements BankAccountStandardUserInterface and inherits from BankAccountUser
 *	@author Emmanuel Afoakwah
 *	@version 21.11.2018
 */

public class BankAccountAdministrator extends BankAccountUser implements BankAccountAdministratorInterface {

    /** Declaring Bank Account User Arraylist */
    private ArrayList<BankAccountUser> bankAccountUsers = new ArrayList<BankAccountUser>();

    /**
     * Constructor taking two parameters
     * 1) Username
     * 2) Password
     * Logged in is set to false at construction to ensure authentication
     * step is not bypassed
     * @param username is the username of the bank account user
     * @param password is the password of the bank account user
     */
    public BankAccountAdministrator( String username, String password ){
        super(username, password);
    }

    /**
     * Login function
     * First, checks whether the password is correct
     * Second, if correct, calls login function to execute
     * @param password is the password to check before executing login
     */
    public void login(String password){
        if( passwordCorrect(password) ){
            super.login(password);
        }
    }

    /**
     * Function to add a user to administrators list
     * Adds user to bankAccountUsers Arraylist
     * @param user is the user to add to the list
     */
    public void addUser(BankAccountUser user){
        bankAccountUsers.add(user);
    }

    /**
     * Function to reset the account of a user
     * First, checks if user is logged in
     * Second, resets the password to the one passed into the function
     * Third, if it is a standard user, the login attempts tracker is reset
     * @param bankAccountUser is the user to reset
     * @param password is the password to reset to
     */
    public void resetAccount(BankAccountUser bankAccountUser, String password){
        if(super.getLoggedIn()){
            bankAccountUser.setPassword(password);
            if( bankAccountUser instanceof BankAccountStandardUser ){
                ((BankAccountStandardUser) bankAccountUser).setLoginAttempts(0);
            }
        }
    }

}
