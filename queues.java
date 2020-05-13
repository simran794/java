public class queues {
    class node{
        int data;
        node next;

        node(int x){
            this.data = x;
            this.next = null;
        }
    }

    private node first;
    private node last;

    public void add(int x){
        node temp = new node(x);
    
        if(first != null){
            last.next = temp;
        }
        last = temp;
        if(first == null){
            first = last;
        }
    }

    public int remove(){
        
        if(first == null){
            System.out.println("null");
            return 1;
        }
        
        int temp = first.data;
        
        first = first.next;
        if(first == null){
            last=null;
        }
        
        return temp;
    }

    public int peek(){
        return first.data;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void print(){
        node h = first;
        while(h.next!=null){
            System.out.print(h.data+" > ");
            h=h.next;
        }
        System.out.println(h.data);
    }

}