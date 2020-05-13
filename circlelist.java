public class circlelist{

    public class node{
        String data;
        node next;

        node(String x){
            this.data = x;
            this.next = null;
        }

    }

    private node head;

    public void add(String x){
        node temp = new node(x);
        node h1 = head;
        if(head==null){
            head = temp;
        }
        else{
            while(h1.next!=null){
                h1=h1.next;
            }
            h1.next = temp;
        }
    }

    public void print(){
        node h1 = head;
        while(h1.next!=null){
            System.out.print(h1.data + " > ");
            h1=h1.next;
        }
        System.out.println(h1.data);
    }

    public void corruption(circlelist a){
        node h1 = head;
        node h2 = head;

        while(h1.next!=null){
            h1=h1.next;
        }

        h2 = h2.next.next.next.next;

        h1.next = h2;
    }

    public void loop(circlelist a){
        node h1 = head;
        node h2 = h1.next;
        node h3 = h2.next.next;

        while(h1.next!=null){
            if(h1 == h2){
                break;
            }
            else if(h1 == h3){
                break;
            }
            else if(h1 == h3.next){
                break;
            }
            else if(h2 == h3){
                h1 = h1.next;
            }
            h2=h2.next;
            h3=h3.next.next;
        }

        System.out.println("character is " + h1.data);
    }
}