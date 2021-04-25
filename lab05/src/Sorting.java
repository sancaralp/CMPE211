//********************************************
// Sorting.java
//
// Demonstrates the insertion sort algorithm.
//********************************************
public class Sorting
{
    //------------------------------------------------------------
    // Sorts the specified array of objects using the insertion
    // sort algorithm.
    //------------------------------------------------------------
    public static void insertionSort (Comparable[] list)
    {
        for (int index = 1; index < list.length; index++)
        {
            Comparable key = list[index];
            int position = index;
            // Shift larger values to the right
            while (position > 0 && key.compareTo(list[position-1]) < 0)
            {
                list[position] = list[position-1];
                position--;
            }
            list[position] = key;
        }
    }
}