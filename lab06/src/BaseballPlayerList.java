public class BaseballPlayerList
{

    protected int numElements = 0;
    protected BaseballPlayer[] list;
    //-------------------------------------------------------------
    // Constructor -- creates an BaseballPlayerList of a given size.
    //-------------------------------------------------------------
    public BaseballPlayerList(int size)
    {
        list = new BaseballPlayer[size];

        //TODO
    }
    //------------------------------------------------------------
    // Adds a baseball player to the list. If the list is full,
    // prints a message and does nothing.
    //------------------------------------------------------------
    public void add(String value1, int value2)
    {
        if(numElements==list.length) System.out.println("Can't add, list is full");
        else{
        list[numElements]=new BaseballPlayer(value1,value2);
        numElements++;}
        //TODO
    }
    //-------------------------------------------------------------
    // Returns a string containing the elements of the list with their
    // indices.
    //-------------------------------------------------------------
    public String toString()
    {
        String returnString = "";
        returnString += "\n\tName\tJersey Number\t\n";
        for (int i=0; i<numElements; i++)
            returnString += i + ": " + list[i].toString() + "\n";
        return returnString;
    }
}