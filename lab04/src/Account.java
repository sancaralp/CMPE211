import java.util.*;
//************************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, and get a String representation
// of the account.
//************************************************************
public class Account
{
    private double balance;
    private String name;
    private long acctNum;
    private static int numAccounts=0;
    Random rand=new Random();

    //-------------------------------------------------------------------------------------------------
    //Constructor -- initializes balance and owner as specified, randomly generates the account number
    //-------------------------------------------------------------------------------------------------
    public Account(double initBal, String owner)
    {
        numAccounts++;
        balance=initBal;
        name=owner;
        do {
            acctNum = rand.nextLong() + 1;
        }
        while(acctNum<=0);
        // TODO
    }
    //-------------------------------------------------
    // Returns balance.
    //-------------------------------------------------
    public double getBalance()
    {
        return balance;
    }
    //-------------------------------------------------
    // Returns a string containing the name, account number, and balance.
    //-------------------------------------------------
    public String toString()
    {
        return "Name:" + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance;
    }
    public static int getNumAccounts(){
        return numAccounts;
    }

}