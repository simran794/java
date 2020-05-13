public class asc {
    public class node{
        int data;
        node next;

        node(int x){
            this.data = x;
            this.next = null;
        }
    }

    private node head;
    
    public void add(int x){
        node temp = new node(x);
        if (head==null){
            head = temp;
        }
        else{
            node h1 = head;
            while(h1.next!=null){
                h1=h1.next;
            }
            h1.next=temp;
        }
    }

    public void delete(int x){
        node h1 = head;
        while(h1.next!=null){
            if(h1.data == x){
                h1=h1.next.next;
            }
            else{
                h1=h1.next;
            }
        }
    }

    public void print(){
        node h1=head;
        while(h1.next!=null){
            System.out.print(h1.data+" > ");
            h1=h1.next;
        }
        System.out.print(h1.data);
        System.out.println();
    }

    public void sort(){
        node h1 = head;
        node r = h1.next;
        while(h1.next!=null){
            if(h1.data > r.data){
                add(h1.data);
                delnode(h1.data);
                r = r.next;
            }
            else{
                r = r.next;
            }
            System.out.println("h: "+h1.data+", r: "+r.data);
            //print();
            h1=h1.next;
        }
        h1=h1.next;
    }

    public void delnode(int y){
        node x = head;
        node h1=head.next;
        while(h1.next!=null){
            if(h1.data==y){
                x.data=x.next.data;
                x.next = x.next.next;
            }
            h1=h1.next;
            x=h1;
        }
    }
}