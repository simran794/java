import java.util.linkedlist1;

public class runnerup
{
    public static void main(String [] args)
    {
        linkedlist1 a = new linkedlist1();
        linkedlist1 b = new linkedlist1();

        a.add(3);
        a.add(1);
        a.add(5);
        a.add(9);
        a.add(7);
        a.add(2);
        a.add(1);

        b.add(4);
        b.add(6);
        b.add(7);
        b.add(2);
        b.add(1);

        a.print();
        System.out.println("Length = "+ a.length());
        b.print();
    }
}