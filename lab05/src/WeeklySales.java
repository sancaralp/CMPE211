// *****************************************************
// WeeklySales.java
//
// Sorts the sales staff in ascending order by sales.
// *****************************************************
public class WeeklySales
{
    public static void main(String[] args)
    {
        // TODO: Create an array for 10 Salesperson objectsHoca
        Salesperson[] myarray= new Salesperson[10];

        // TODO: Populate all the array elements with the values as given in the PDF screenshot
        myarray[0]=new Salesperson("Don","Trump",1570);
        myarray[1]=new Salesperson("Dick","Walter",2800);
        myarray[2]=new Salesperson("Jim","Doe",2850);
        myarray[3]=new Salesperson("Jane","Black",3000);
        myarray[4]=new Salesperson("James","Jones",3000);
        myarray[5]=new Salesperson("Jane","Jones",3000);
        myarray[6]=new Salesperson("Walt","Smith",3000);
        myarray[7]=new Salesperson("Daffy","Duck",4935);
        myarray[8]=new Salesperson("Andy","Adams",5000);
        myarray[9]=new Salesperson("Harry","Taylor",7300);


        // TODO: Use insertionSort function for your array
        Sorting.insertionSort(myarray);
        System.out.println ("\nRanking of Sales for the Week\n");
        // TODO: Print each array element
        for(int i=0;i<10;i++)System.out.println(myarray[i].toString());

    }
}