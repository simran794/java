import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args)
    {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("C");
        arr.add("A");
        arr.add("R");
        for(String i: arr)
        {
            System.out.println(i);
        }
        System.out.println(arr);
    }
}
