public class runner1{

    public static void main(String[] args){
        //add1 n = new add1();
        linkedlista m = new linkedlista();
        linkedlista n = new linkedlista();
        linkedlista p = new linkedlista();
        linkedlista o = new linkedlista();
       // n.add(8);
        n.add(7);
        n.add(6);
        n.add(5);
        m.add(1);
        m.add(2);
        m.add(3);
        m.add(4);
        p.add(10);
        p.add(9);
        p.add(8);
        p.add(7);
        //n.print();
        //System.out.println();
        //m.print();
        //add2 o = new add2();
        //n.addition(n,m);
        //o = m.palin(m);
        // o = m.betterpalin(m);
        // o.print();
        //o.print();
        o.join(n,m);
        o.join(p,m);
        boolean result = o.check(n,p);
        System.out.println("The result = " + result);

    }
}
