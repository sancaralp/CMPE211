public class ListTest
{
    public static void main(String[] args)
    {
        BaseballPlayerList myList = new BaseballPlayerList(5);
        SortedBaseballPlayerList sortedList=new SortedBaseballPlayerList(5);

        myList.add("ali",100);
        myList.add("veli",50);
        myList.add("ibrahim",200);
        myList.add("selami",25);
        myList.add("bahar",160);
        System.out.println("Original List: ");
        System.out.println("-------------- ");
        System.out.println(myList);


        sortedList.add("ali",100);
        sortedList.add("veli",50);
        sortedList.add("ibrahim",200);
        sortedList.add("selami",25);
        sortedList.add("bahar",160);
        System.out.println("Sorted List: ");
        System.out.println("-------------- ");
        System.out.println(sortedList);

        //TODO

    }
}