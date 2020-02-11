public class runner {
    public static void main (String [] args)
    {
        test listA = new test();
        test listB = new test();
        //test listC = new test();

        listA.add(3);
        listA.add(8);
        listA.add(3);
        
        listB.add(5);
        listB.add(3);
        listB.add(5);

        listA.print();
        listB.print();
    }
}
