import java.util.Scanner;
public class CompareTest {
    public static void main(String[] args){
        Compare3 com = new Compare3();
        Scanner read=new Scanner(System.in);

        System.out.println("Enter your three strings: ");
        String x = read.nextLine(); String y = read.nextLine(); String z = read.nextLine();
        System.out.println("Largest of three strings: ");
        System.out.println(com.largest(x,y,z));
        System.out.println("Enter your three integers: ");
        int a = read.nextInt(); int b = read.nextInt(); int c = read.nextInt();
        System.out.println(com.largest(a,b,c));
    }
}
