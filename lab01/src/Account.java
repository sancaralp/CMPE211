public class Account
{
    private double balance;
    private String name;
    private long acctNum;
    // ---------------------------------------------------------------
    // Constructor -- initializes balance, owner, and account number
    // ---------------------------------------------------------------
    public Account(double initBal, String owner, long number)
    {
        this.balance=initBal;
        this.name=owner;
        this.acctNum=number;

    }
    // --------------------------------
    // Decrements balance by amount
    // --------------------------------
    public void withdraw(double amount)
    {
        balance-=amount;
    }
    // ------------------------
    // Returns balance.
    // ------------------------
    public double getBalance()
    {
        return balance;
    }
    // --------------------------------------------------------------------
    // Returns a string containing the name, account number, and balance.
    // --------------------------------------------------------------------
    public String toString()
    {

        return "\nName: "+this.name+"\nAccount Number: "+this.acctNum+"\nBalance: "+this.balance;
        //add body of toString
    }
    // --------------------------------------------------
    // Deducts $10 service fee
    // Also, dont forget to modify for Task 1's item e.
    // --------------------------------------------------
    public double chargeFee()
    {
        this.balance-=10;
        return this.balance;
        //add body of chargeFee
    }
    // --------------------------------------------
    // Changes the name on the account
    // --------------------------------------------
    public void changeName(String newName)
    {
        this.name=newName;
        //add body of changeName
    }
}