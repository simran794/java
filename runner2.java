
public class runner2 {

    public static void main(String [] args){
        circlelist a = new circlelist();
        a.add("A");
        a.add("B");
        a.add("C");
        a.add("D");
        a.add("E");
        a.add("F");
        a.add("G");
        a.add("H");
        a.corruption(a);
        a.loop(a);

    }
}