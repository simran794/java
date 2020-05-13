
public class linkedlista {

    public class node{
        int data;
        node next;

        node(int x){
            this.data = x;
            this.next = null;
        }
    }

    private node head;
    public int length;

    public void add(int x){
        node temp = new node(x);
        node h1 = head;
        if (head == null) {
            head = temp;
        }
        else{
            while(h1.next!=null){
                h1=h1.next;
            }
            h1.next = temp;
        }
        length++;
    }

    public void print(){
        node h1 = head;
        while(h1.next!=null){
            System.out.print(h1.data + " > ");
            h1=h1.next;
        }
        System.out.println(h1.data);
    }

    public void join(linkedlista a, linkedlista b){
        node h1 = a.head;
        node h2 = b.head;
        while(h1.next!=null){
            h1=h1.next;
        }
        h1.next = h2;
        a.print();
    }

    public int size(linkedlista a){
        return a.length;
    }

    public boolean check(linkedlista a, linkedlista b){
        node h1 = a.head;
        node h2 = b.head;
        int x;
        if(a.length==b.length){
            System.out.println("a=b");
            while(h2.next!=null){
                if(h1==h2){
                    System.out.println("value is "+h2.data);
                    return true;
                }
                h1=h1.next;
                h2=h2.next;
            }
            return false;
        }
        else if(a.length>b.length){
            System.out.println("a>b");
            for(x = 0; x < a.length-b.length; x++){
                h1 = h1.next;
            }
            while(h1.next!=null){
                if(h1==h2){
                    System.out.println("value is "+h1.data);
                    return true;
                }
                h1=h1.next;
                h2=h2.next;
            }
            return false;
        }
        else{
            System.out.println("a<b");
            for(x = 0; x < b.length-a.length; x++){
                h2=h2.next;
                //System.out.println("h1 = " + h2.data + "x = "+ x + "head = " + b.head.data);
            }
            //System.out.println("h1 = " + h2.data);
            while(h2.next!=null){
                if(h1==h2){
                    System.out.println("value is "+h2.data);
                    return true;
                }
                h1=h1.next;
                h2=h2.next;
            }
            return false;
        }
    }
}