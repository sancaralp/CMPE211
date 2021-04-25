// *******************************************************
// Salesperson.java
//
// Represents a sales person who has a first name, last
// name, and total number of sales.
// *******************************************************
public class Salesperson implements Comparable
{
    private String firstName, lastName;
    private int totalSales;
    //------------------------------------------------------
    // Constructor: Sets up the sales person object with
    // the given data.
    //------------------------------------------------------
    public Salesperson (String first, String last, int sales)
    {
        this.firstName = first;
        this.lastName=last;
        this.totalSales=sales;
        //TODO
    }
    //-------------------------------------------
    // Returns the sales person as a string.
    //-------------------------------------------
    public String toString()
    {
        return lastName + ", " + firstName+ ": \t" + totalSales;
    }
    //--------------------------------------------------
    // Order is based on total sales with the name
    // (last, then first) breaking a tie.
    //--------------------------------------------------
    public int compareTo(Object other)
    {
        Salesperson x = (Salesperson) other;
        if(this.getSales()-x.getSales()!=0) return this.getSales()-x.getSales();

        else {
            return (this.lastName+this.firstName).compareTo(x.lastName+x.firstName);
        }


        //TODO
    }
    //-------------------------
    // First name accessor.
    //-------------------------
    public String getFirstName()
    {
        //TODO
        return firstName;
    }
    //-------------------------
    // Last name accessor.
    //-------------------------
    public String getLastName()
    {
        return lastName;
        //TODO
    }
    //-------------------------
    // Total sales accessor.
    //-------------------------
    public int getSales()
    {
        return totalSales;
        //TODO
    }
}