// ***************************************************************
// EmployeeListTest.java
//
// Driver to test EmployeeList methods.
// ***************************************************************
import java.util.Scanner;
public class EmployeeListTest
{

    private static Scanner scan;
    private static EmployeeList list = new EmployeeList();
    //----------------------------------------------------------------
    // Creates a list, then repeatedly prints the menu and does what
    // the user asks until they quit.
    //----------------------------------------------------------------
    public static void main(String[] args)
    {
        scan = new Scanner(System.in);
        printMenu();
        int choice = scan.nextInt();
        while (choice != 0)
        {
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();
        }
    }
    //----------------------------------------
    // Does what the menu item calls for.
    //----------------------------------------
    public static void dispatch(int choice)
    {
        int newVal;
        switch(choice)
        {
            case 0:
                System.out.println("Bye!");
                break;
            case 1: //add to end
                System.out.println("Enter name(string) of employee to add to end");
                list.addToEnd(new Employee(scan.next()));
                // TODO
                break;
            case 2: //search with name
                System.out.println("Enter name(string) of employee to search");
                if(list.search(scan.next()))
                System.out.println("Yes, Employee Found!");
                else System.out.println("No, Employee Not Found!");
                // TODO
                break;
            case 3: //print
                list.print();
                // TODO
                break;
            default:
                System.out.println("Sorry, invalid choice");
        }
    }
    //-----------------------------------------
    // Prints the user's choices
    //-----------------------------------------
    public static void printMenu()
    {
        System.out.println("\n Menu ");
        System.out.println(" ====");
        System.out.println("0: Quit");
        System.out.println("1: Add an employee to the end of the list");
        System.out.println("2: Search for an employee due to name in the list");
        System.out.println("3: Print the list");
        System.out.print("\nEnter your choice: ");
    }
}