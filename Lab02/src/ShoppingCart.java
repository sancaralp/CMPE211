import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
public class ShoppingCart
{
    private int itemCount; // total number of items in the cart
    private double totalPrice; // total price of items in the cart
    private int capacity; // current cart capacity
    private Item cart[];

    // ---------------------------------------------------------
    // Creates an empty shopping cart with a capacity of 4 items.
    // ---------------------------------------------------------
    public ShoppingCart()
    {
        capacity = 4;
        itemCount = 0;
        totalPrice = 0.0;
        cart = new Item[capacity];
    }

    // -------------------------------------------------------------------
    // Adds an item to the shopping cart while checking capacity condition.
    // -------------------------------------------------------------------
    public void addToCart(String itemName, double price, int quantity)
    {

        cart[itemCount]= new Item(itemName,price,quantity);
        itemCount+=1;
        totalPrice+=price*quantity;
        if(this.itemCount>=capacity){System.out.println("Capacity has increased for 2 more items...");increaseSize();}



    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // -----------------------------------------------------
    // Returns the contents of the cart together with
    // summary information.
    // -----------------------------------------------------
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String contents = "\nShopping Cart\n";
        contents += "\nItem\tUnit Price\tQuantity\tTotal\n";
        for (int i = 0; i < itemCount; i++)
            contents += cart[i].toString() + "\n";
        contents += "\nTotal Price: " + fmt.format(totalPrice);
        contents += "\n";
        return contents;
    }
    // -----------------------------------------------------
    // Increases the capacity of the shopping cart by 2
    // -----------------------------------------------------
    private void increaseSize()
    {
        capacity+=2;
        Item[] cart2= Arrays.copyOf(cart,capacity);
        cart= Arrays.copyOf(cart2,capacity);
    }
}