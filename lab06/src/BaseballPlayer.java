public class BaseballPlayer
{
    private String name;
    private int jerseyNumber;

    public BaseballPlayer(String n, int jN)
    {
        name = n;
        jerseyNumber = jN;
    }

    // --------------------------------------------------------
    // Return a string with the information about the player
    // --------------------------------------------------------
    public String toString()
    {
        return ("\t"+ name + "\t" + jerseyNumber);
    }

    public String getName()
    {
        return name;
    }

    public int getjN()
    {
        return jerseyNumber;
    }

}
