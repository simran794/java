
public class add1 {

    class node{
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
        node h1=head;
        if(head==null){
            head = temp;
        }
        else{
            while(h1.next!=null){
                h1=h1.next;
            }
            h1.next=temp;
        }
        length++;
    }

    public void print(){
        node h1=head;
        while(h1.next!=null){
            System.out.print(h1.data + " > ");
            h1=h1.next;
        }
        System.out.println(h1.data);
    }

    public node head(){
        node h1=head;
        return h1;
        //System.out.println(h1.data);
    }

    public int size(){
        node h1=head;
        while(h1.next!=null){
            length++;
            h1=h1.next;
        }
        length++;
        return length;
    }

    public void addition(add1 a, add1 b){
        node h1=a.head();
        node h2=b.head();
        int carry=0;
        node x1=null;
        node x2=null;
        node temp=null;

        while(h1.next!=null){
            temp = new node((h1.data + h2.data + carry)%10);
            carry = (h1.data + h2.data + carry)/10;
            if(x1==null){
                x1=temp;
                x2=x1;
            }
            else{
                x2.next=temp;
                x2=x2.next;
            }
            h1=h1.next;
            h2=h2.next;
        }
        temp = new node((h1.data + h2.data + carry));
        x2.next=temp;
        node r = x1;
        while(r.next!=null){
            System.out.print(r.data+ " > ");
            r=r.next;
        }
        System.out.println(r.data);
    }

}