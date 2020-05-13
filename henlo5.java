//import java.util.Arrays;

public class henlo5 {

	class node{
		int data;
		node next;
		
		node(int x){
			this.data=x;
			this.next=null;
		}
	}
	
	private node head;

	public void push(int x) {
		
		node temp = new node(x);
		temp.next=head;
		head=temp;
	}
	
	public void print() {
		node h1 = head;
		while(h1.next!=null) {
			System.out.print(h1.data + " > ");
			h1 = h1.next;
		}
		System.out.println(h1.data);

	}
	
	public boolean isEmpty() {
		if(head == null) {
			System.out.println("empty");
			return true;
		}
        return false;
	}
	
	public int pop() {
        int temp = head.data;
        head = head.next;
        return temp;
	}
     
    public int peek(){
        return head.data;
    }

    public void sort(henlo5 r){
        henlo5 newstack = new henlo5();
        
        while(!r.isEmpty()){
            int x = r.pop();
            if(newstack.isEmpty()){
                newstack.push(x);
            }
            else{
                while(!newstack.isEmpty() && x > newstack.peek()){
                    r.push(newstack.pop());
                }
                newstack.push(x);
            }
        }
        newstack.print();
    }
	
    public void threestack1(int[] array) {
		int y = array.length;
		henlo5 a = new henlo5();
		henlo5 b = new henlo5();
		henlo5 c = new henlo5();
        
        int j = y/3;

        if(y<3){
            if(y==1){
            a.push(array[0]);
            a.print();
            }
            if(y==2){
            a.push(array[0]);
            b.push(array[1]);
            a.print();
            b.print();
            }
        }
        else{
            for(int i=0;i<j;i++) {
                a.push(array[i]);
                //System.out.println("pushing" + array[i]);
            }
            for(int i=j;i<2*j;i++) {
                b.push(array[i]);
                //System.out.println("pushing" + array[i]);
            }
            for(int i=2*j;i<y;i++) {
                c.push(array[i]);
                //System.out.println("pushing" + array[i]);
            }
            a.print();
            b.print();
            c.print();
        }
		
	}
   
    public void delete(int x){
        node h1 = head;
        node r = h1.next;
        boolean check = false;
        
        while(r.next != null){
            if(head.data == x){
                head=head.next;
                check = true;
                break;
            }
            else if(r.data == x){
                h1.next = r.next;
                System.out.println("h1.data = "+ h1.data);
                check = true;
                h1 = h1.next;
                r = h1.next;
                break;
            }
            else{
                h1 = h1.next;
                r = r.next;
            }
        }

        if(check == false){
            h1.next = null;
        }

        
        //length = length-1;    
    }


    
}
