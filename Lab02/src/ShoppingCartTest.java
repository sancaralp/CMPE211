import java.util.Scanner;
import java.text.NumberFormat;
public class ShoppingCartTest
{
    // Create a static Shopping cart object

    static Scanner scan = new Scanner(System.in);
    //-------------------------------------------------------
    // Repeatedly print the menu and do what the
    // user asks until they quit
    //-------------------------------------------------------
    public static void main(String[] args)
    {
        printMenu();
        int choice = scan.nextInt();
        ShoppingCart mycart = new ShoppingCart();

        while (choice != 0)
        {
            System.out.println("Enter name, price and quantity of item:");
            // Read necessary information from user's line by line
            String name = scan.next();
            int price = scan.nextInt();
            int quan = scan.nextInt();


            // Add the item to your cart
            mycart.addToCart(name,price,quan);
            // Print the current cart contents
            System.out.println(mycart);

            System.out.println("Do you want to continue shopping? Please enter 0/1");
            choice = scan.nextInt();
        }
        System.out.println("Total price: "+mycart.getTotalPrice());
        // Print the check out price after the loop


    }

    //----------------------------
    // Print the user's choices
    //----------------------------
    public static void printMenu()
    {
        System.out.println("\n Menu ");
        System.out.println(" ====");
        System.out.println("0: Quit");
        System.out.println("1: Do the shopping");
        System.out.print("\n Enter your choice: ");
    }
}