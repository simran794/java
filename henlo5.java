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
	private int min ;
	private int length = 0; 
	
	public void push(int x) {
		length = length + 1;
		node temp = new node(x);
		temp.next=head;
		head=temp;

		if(length == 1) {
			min = head.data;
		}
		else {
			if(min > x) {
				min = x;
				//System.out.println("minimum hits "+ min);
			}
		}
	}
	
	public void print() {
		node h1 = head;
		while(h1.next!=null) {
			System.out.print(h1.data + " > ");
			h1 = h1.next;
		}
		System.out.println(h1.data);
//		System.out.println("size is "+ length);
//		System.out.println("minimum is " + min);
	}
	
	public boolean isEmpty() {
		if(head == null) {
			System.out.println("empty");
			return true;
		}
		else {
			System.out.println("not empty");
			return false;
		}
	}
	
	public int pop() {
        int temp = head.data;
        head = head.next;
        return temp;
	}
    
    public int mini(){
        node h1 = head;
        while(h1.next!=null){
            if(min > h1.data){
                min = h1.data;
            }
            h1 = h1.next;
        }
        return min;
    }

    //public void balance(int x);
    
    public int peek(henlo5 r){
        return head.data;
    }

    public void sort(henlo5 r){
        henlo5 newstack = new henlo5();
        henlo5 tempStack = new henlo5();
        while(!r.isEmpty()){
            int min = r.mini();
            if(r.pop() == min){
                newstack.push(r.pop());
            }
            else{
                tempStack.push(r.pop());
            }
        }
        r = tempStack;
        sort(r);
        r.print();
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
