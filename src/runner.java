import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class runner {
    public static String compression(String str)
    {

        int count = 1;
        int next = 0;

        StringBuilder str1 = new StringBuilder();
        str1.append(str.charAt(0));

        for(int i = 1; i < str.length(); i++)
        {
            if(str.charAt(i) == str1.charAt(next))
            {
                count++;
            }
            else
            {
                str1.append(count);
                count = 1;
                next = next + 2;
                str1.append(str.charAt(i));
            }
        }
        str1.append(count);
        return str1.toString();
    }

    public static boolean isUnique(String str)
    {
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        HashSet<Character> unique = new HashSet<>();
        for(int i = 0; i < str.length(); i++)
        {
            if(!unique.contains(str.charAt(i)))
            {
                unique.add(str.charAt(i));
            }
            else
            {
                return false;
            }
        }
        return true;
    }


    public static void main (String [] args)
    {
        /*
        linkedlist list = new linkedlist();
        list.add(3);
        list.add(8);
        list.add(3);
        list.add(5);
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(9);
        list.print();
        //list.redup();
       // list.print();

        //list.createCircle();
       // System.out.println(list.loopDetection());

        sortStack stack = new sortStack(5);
        stack.push(15);
        stack.push(3);
        stack.print();
        stack.pop();
        stack.print();
        */
        System.out.println("test");
    }
}
