//*********************************
//  Employee.java       
//
//  Represents a single employee.
//*********************************

public class Employee
{

    private String name;

    //-----------------------------------------------------------------
    //  Sets up the new employee with its name.
    //-----------------------------------------------------------------
    public Employee(String newName)
    {
        name = newName;
    }
    //-----------------------------------------------------------------
    //  Returns the employee as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        return name;
    }
}