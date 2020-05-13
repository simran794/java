public class deletecnode{
    
    class node{
        int data;
        node next;

        node(int x){
            this.data = x;
            this.next = null;

        }

    }

    private node head;
    private int length = 0;

	public void add(int x) {
		node temp=new node(x);
		
		if(head==null) {
			head = temp;
		}
		else{
			node h1 = head;
			while(h1.next!=null) {
				h1=h1.next;
			}	
			h1.next = temp;
        }
        length++;
	}
    
    public void print(){
        node h1 = head;
        while(h1.next!=null){
            System.out.print(h1.data+" > ");
            h1=h1.next;
        }
        System.out.print(h1.data);
        System.out.println();
        System.out.println("size = "+ length);
    }

    public void delnode(){
        node x = head;
        while(x.next.next!=null){
            x.data = x.next.data;
            x=x.next;
        }
        x.data = x.next.data;
        x.next = null;

    }

    public void kdel(int k){
        int x = length - k;
        node h1 = head;
        for(int i =0; i < x-1;i++){
            h1 = h1.next;
            //System.out.println(h1.data);
        }
        //h1.data = h1.next.data;
        System.out.println(h1.next.data);
    }

    public void kend(int k){
        int pos = length;
        node h1 = head;
        while(h1.next!=null){
            h1=h1.next;
            pos--;
            if(h1.data==k){
                System.out.print(pos+" and data is "+ h1.data);
            }
        }
    }


}