public class IntegerList
{
    int[] list; //values in the list
    int cap;
    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        cap=size;
    }
    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    public void IncreaseSize() {
        cap++;
        int[] list2 = new int[cap];

        for(int i = 0;i<list.length;i++) list2[i]=list[i];

        list =new int[cap];

        for(int i = 0;i<list.length;i++) list[i]=list2[i];

    }
    void addElement(int newVal){
if(cap<=list.length){
    IncreaseSize();
}
list[list.length-1]=newVal;
    }


    void removeFirst(int newVal){
        for(int i =0; i<list.length;i++){
            if(list[i]==newVal){

                for(int u =i; u+1<list.length;u++){
                    list[u]=list[u+1];

                }
                cap--;
                int[] list3= new int[cap];
                for(i=0;i<list3.length;i++){
                    list3[i]=list[i];
                }
                list=list3;
                i=list.length;
            }

        }
    }

}