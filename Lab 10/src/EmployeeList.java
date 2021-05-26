// ***************************************************************
// FILE: EmployeeList.java
//
// Purpose: Defines a class that represents a list of employees
//
// ***************************************************************
public class EmployeeList
{

    private EmployeeNode front; //first node in list


    //-----------------------------------------
    // Constructor. Initially list is empty.
    //-----------------------------------------
    public EmployeeList()
    {
        front=null;
    }
    //-----------------------------------------
    // Adds given employee to end of list.
    //-----------------------------------------
    public void addToEnd(Employee e)
    {
        EmployeeNode node = new EmployeeNode(e);
        EmployeeNode nodeCurrent;
        if(front==null) front = node;
        else{
            nodeCurrent=front;
            while(nodeCurrent.next!=null) nodeCurrent=nodeCurrent.next;
            nodeCurrent.next=node;
        }
        // TODO
    }
    //-------------------------------------------------------------------
    // Checks whether the employee with name n is present in linked list
    //-------------------------------------------------------------------
    public boolean search(String n)
    {

        EmployeeNode nodeCurrent=front;
        while(!nodeCurrent.val.toString().equalsIgnoreCase(n)){if(nodeCurrent.next!=null) nodeCurrent=nodeCurrent.next; else break;}
        if(!nodeCurrent.val.toString().equalsIgnoreCase(n)) return false;
        return true;
    }
    //------------------------------------------------
    // Prints the list elements from first to last.
    //------------------------------------------------
    public void print()
    {
        System.out.println("--------------------");
        System.out.print("List elements: ");
        String result = "";
        EmployeeNode nodeCurrent = front;
        while (nodeCurrent != null) {
            result += " "+nodeCurrent.val;
            nodeCurrent = nodeCurrent.next;
        }
        System.out.println(result);
        System.out.println("\n-----------------------\n");

    }
    //*************************************************************
    // An inner class that represents a node in the employee list.
    // The public variables are accessed by the EmployeeList class.
    //*************************************************************
    private class EmployeeNode
    {
        public Employee val; //Employee object in the node
        public EmployeeNode next; //link to next node in list
        //----------------------------------
        // Constructor; sets up the node
        //----------------------------------
        public EmployeeNode(Employee e)
        {
            this.val = e;
            this.next = null;
        }
    }
}