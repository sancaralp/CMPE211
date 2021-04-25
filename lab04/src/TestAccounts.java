import java.util.Scanner;
public class TestAccounts
{
    public static void main(String[] args)
    {

        Account testAcct; // Create a test Account object
        Scanner scan = new Scanner(System.in);
        System.out.println("How many accounts would you like to create?");
        int num = scan.nextInt();
        for(int i=1; i<=num;i++){
            String name= "name"+i;
            int balance = 100+10*i;
            testAcct=new Account(balance,name);
            System.out.println(testAcct.toString()+"\nNow there are "+Account.getNumAccounts()+" accounts\n");
        }
        // Create the #num new Accounts and print the appropriate messages (see demo link from pdf) in a loop
        // TODO
    }
}