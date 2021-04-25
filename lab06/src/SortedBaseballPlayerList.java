public class SortedBaseballPlayerList extends BaseballPlayerList{
    protected BaseballPlayer[] listTemp;

    public SortedBaseballPlayerList(int size) {
        super(size);
    }
    @Override
    public void add(String value1, int value2)
    {
        if(numElements==0){
            list[numElements]=new BaseballPlayer(value1,value2);
            numElements++;
        }
        else {

            if (numElements == list.length)
                System.out.println("Can't add, list is full");
            else {
                listTemp = new BaseballPlayer[list.length];

                for (int i = 0; i < numElements; i++) {
                    if (value2 < list[i].getjN()) {
                        for (int u = i + 1; u < numElements+1; u++) {
                            listTemp[u] = list[u - 1];
                        }
                        listTemp[i] = new BaseballPlayer(value1, value2);
                    } else listTemp[i] = list[i];

                }
                list = listTemp;
                numElements++;
            }
        }
    }
}
