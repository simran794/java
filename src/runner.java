import java.util.HashMap;
import java.util.HashSet;
import java.util.linkedlist;
import java.util.nodesAddition;


public class runner {
    public static void main (String [] args)
    {
        linkedlist listA = new linkedlist();
        linkedlist listB = new linkedlist();
        linkedlist listC = new linkedlist();

        listA.add(3);
        listA.add(8);
        listA.add(3);
        
        listB.add(5);
        listB.add(3);
        listB.add(5);
        
        listC.addition(listA, listB);

        listC.print();
    }
}
