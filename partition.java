
public class partition {

    public class node{
        int data;
        node next;

        node(int x){
            this.data=x;
            this.next=null;
        }
    }

    private node head;
    public int length;

    public void add(int x){
        node temp = new node(x);
        node h1=head;
        if(head==null){
            head=temp;
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
            System.out.print(h1.data+" > ");
            h1=h1.next;
        }
        System.out.print(h1.data);
    }

    public void tail(){
        node h1=head;
        while(h1.next!=null){
            h1=h1.next;
        }
        System.out.print(h1.data+ " is tail");  
    }

    public int size(){
        node h1=head;
        int x=0;
        while(h1.next!=null){
            x=x+1;
            h1=h1.next;
        }
        return x;  
    }

    public void comp(int x){
        node temp;
        node a =null;
        node b=null;
        node c=null;
        node d=null;
        node h1=head;
        while(h1.next!=null){
            temp = new node(h1.data);
            if(h1.data<x){
                if(a==null){
                    a=temp;
                    b=a;
                }
                else{
                    b.next=temp;
                    b=b.next;
                }
            }
            else{
                if(c==null){
                    c=temp;
                    d=c;
                }
                else{
                    d.next=temp;
                    d=d.next;
                }
            }
            h1=h1.next;
        }
        temp=new node(h1.data);
        if(h1.data<x){
            if(a==null){
                a=temp;
                b=a;
            }
            else{
                b.next=temp;
                b=b.next;
            }
        }
        else{
            if(c==null){
                c=temp;
                d=c;
            }
            else{
                d.next=temp;
                d=d.next;
            }
        }
        b.next=c;
        while(a.next!=null){
            System.out.print(a.data + " > ");
            a=a.next;
        }
        System.out.println(a.data);
    }
 







    
}