package com.emmanuelafoakwah.bank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.emmanuelafoakwah.bank.provided.BankAccount;
import com.emmanuelafoakwah.bank.provided.Customer;
import org.junit.Before;
import org.junit.Test;

public class BankTest {

    /** Creating objects for testing **/
    private BankAccountAdministrator admin1;
    private Customer cust1, cust2;
    private BankAccount ba1, ba2;
    private BankAccountStandardUser stand1, stand2;

    @Before
    public void setUp(){

        //Create Admins
        admin1 = new BankAccountAdministrator("Admin1","A1Login");

        //Create Customers
        cust1 = new Customer("cust1","m","Bham","1234");
        cust2 = new Customer("cust2","f","Bham","2345");

        //Create BankAccount
        ba1 = new BankAccount(cust1,"BA1Login");
        ba2 = new BankAccount(cust2,"BA2Login");

        //Create Standard Users
        stand1 = new BankAccountStandardUser("Stand1","S1Login",ba1);
        stand2 = new BankAccountStandardUser("Stand2","S2Login",ba2);

    }

    /** Test successful standard user login and logout*/
    @Test
    public void test1(){

        //Successful logins
        stand1.login("S1Login");

        // Expected values
        int expectedAttempts = 0;
        int actualAttempts = stand1.getLoginAttempts();

        //Test
        assertEquals(expectedAttempts, actualAttempts);
        assertTrue(stand1.getLoggedIn());

        //Successful logout
        stand1.logout();
        assertFalse(stand1.getLoggedIn());
    }

    /** Test unsuccessful standard user login*/
    @Test
    public void test2(){

        //Failure1
        stand1.login("S11Login");
        int expectedAttempts = 1;
        int actualAttempts = stand1.getLoginAttempts();
        assertEquals(expectedAttempts, actualAttempts);
        assertFalse(stand1.getLoggedIn());

        //Failure2
        stand1.login("S111Login");
        expectedAttempts = 2;
        actualAttempts = stand1.getLoginAttempts();
        assertEquals(expectedAttempts, actualAttempts);
        assertFalse(stand1.getLoggedIn());

        //Failure3
        stand1.login("S1111Login");
        expectedAttempts = 3;
        actualAttempts = stand1.getLoginAttempts();
        assertEquals(expectedAttempts, actualAttempts);
        assertFalse(stand1.getLoggedIn());

        //Failure4 - login attempts exceed maximum of 3, therefore no login attempted
        stand1.login("S11111Login");
        expectedAttempts = 3;
        actualAttempts = stand1.getLoginAttempts();
        assertEquals(expectedAttempts, actualAttempts);
        assertFalse(stand1.getLoggedIn());

    }

    /** Test Money Transfer */
    @Test
    public void test3(){

        //Login
        stand1.login("S1Login");
        int expectedAttempts = 0;
        int actualAttempts = stand1.getLoginAttempts();
        assertEquals(expectedAttempts, actualAttempts);
        assertTrue(stand1.getLoggedIn());

        //Failure - insufficient funds
        stand1.transferMoney(ba2,200,"BA1Login");
        double expectedBalance = 100;
        double actualBalance = stand2.getBankAccount().getBalance();
        assertEquals(expectedBalance, actualBalance, 0.00001);

        //Failure - wrong password
        stand1.transferMoney(ba2,50,"BA11Login");
        expectedBalance = 100;
        actualBalance = stand2.getBankAccount().getBalance();
        assertEquals(expectedBalance, actualBalance, 0.00001);

        //Success - sufficient funds
        stand1.transferMoney(ba2,50,"BA1Login");
        //Payout test
        expectedBalance = 50;
        actualBalance = stand1.getBankAccount().getBalance();
        assertEquals(expectedBalance, actualBalance, 0.00001);
        //Receipt test
        expectedBalance = 150;
        actualBalance = stand2.getBankAccount().getBalance();
        assertEquals(expectedBalance, actualBalance, 0.00001);

    }

    /** Test Admin Login */
    @Test
    public void test4(){

        //Failure1
        stand1.login("S11Login");
        int expectedAttempts = 1;
        int actualAttempts = stand1.getLoginAttempts();
        assertEquals(expectedAttempts, actualAttempts);
        assertFalse(stand1.getLoggedIn());

        //Failure2
        stand1.login("S111Login");
        expectedAttempts = 2;
        actualAttempts = stand1.getLoginAttempts();
        assertEquals(expectedAttempts, actualAttempts);
        assertFalse(stand1.getLoggedIn());

        //Failure3
        stand1.login("S1111Login");
        expectedAttempts = 3;
        actualAttempts = stand1.getLoginAttempts();
        assertEquals(expectedAttempts, actualAttempts);
        assertFalse(stand1.getLoggedIn());

        //Failure4 - login attempts exceed maximum of 3, therefore no login attempted
        stand1.login("S11111Login");
        expectedAttempts = 3;
        actualAttempts = stand1.getLoginAttempts();
        assertEquals(expectedAttempts, actualAttempts);
        assertFalse(stand1.getLoggedIn());

        //Reset Failure - admin not logged in
        admin1.resetAccount(stand1,"ThisWillNotWork");

        //Stand1 login failure - password has not been changed
        stand1.login("ThisWillNotWork");

        //Login attemps unchanged due to unsuccesful login following unsuccesful reset
        expectedAttempts = 3;
        actualAttempts = stand1.getLoginAttempts();
        assertEquals(expectedAttempts, actualAttempts);
        assertFalse(stand1.getLoggedIn());

    }

    /** Test Account Reset */
    @Test
    public void test5(){

        //Failure1
        stand1.login("S11Login");
        int expectedAttempts = 1;
        int actualAttempts = stand1.getLoginAttempts();
        assertEquals(expectedAttempts, actualAttempts);
        assertFalse(stand1.getLoggedIn());

        //Failure2
        stand1.login("S111Login");
        expectedAttempts = 2;
        actualAttempts = stand1.getLoginAttempts();
        assertEquals(expectedAttempts, actualAttempts);
        assertFalse(stand1.getLoggedIn());

        //Failure3
        stand1.login("S1111Login");
        expectedAttempts = 3;
        actualAttempts = stand1.getLoginAttempts();
        assertEquals(expectedAttempts, actualAttempts);
        assertFalse(stand1.getLoggedIn());

        //Failure4 - login attempts exceed maximum of 3, therefore no login attempted
        stand1.login("S11111Login");
        expectedAttempts = 3;
        actualAttempts = stand1.getLoginAttempts();
        assertEquals(expectedAttempts, actualAttempts);
        assertFalse(stand1.getLoggedIn());

        //Admin resets John's password
        admin1.login("A1Login");
        admin1.resetAccount(stand1,"S1LoginReset");

        //Stand1 login again - success due to password reset
        stand1.login("S1LoginReset");

        //Login attempts should be reset to 0
        expectedAttempts = 0;
        actualAttempts = stand1.getLoginAttempts();
        assertEquals(expectedAttempts, actualAttempts);
        assertTrue(stand1.getLoggedIn());

    }

}