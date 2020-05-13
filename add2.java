public class add2 {

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

    public void addition(add2 a, add2 b){
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

    // public add2 reverse(add2 b){
    //     add2 s = new add2();
    //     add2 ba = b;
    //     node pre = null;
    //     node h1 = ba.head;
    //     node runner = h1.next;
    //     while(runner.next!=null){
    //         h1.next = pre;
    //         pre=h1;
    //         h1=runner;
    //         runner=runner.next;
    //         System.out.println(runner.data);
    //     }
    //     h1.next=pre;
	// 	pre=h1;
	// 	h1=runner;
    //     h1.next=pre;
        
    //     node r = runner;
    //     while(r.next!=null){
    //         s.add(r.data);
    //         //System.out.println(r.data);
    //     }
    //     s.add(r.data);
    //     return s;
    // }

    public add2 reverse(add2 a) {
		node pre = null;
		node h1=a.head;
		node runner=h1.next;
		while(runner.next!=null) {
			//System.out.println("pre: "+ pre.data);
			h1.next=pre;
			//System.out.println("h1.next: "+ h1.next.data);
			pre=h1;
			h1=runner;	
			runner=runner.next;
		}
		h1.next=pre;
		pre=h1;
		h1=runner;
		h1.next=pre;
		
        add2 m = new add2();
        node r = h1;
		while(r.next!=null) {
			m.add(r.data);
			//System.out.print(r.data + " > ");
			r=r.next;
		}
		m.add(r.data);
		//System.out.println(r.data);
		return m;
    }
    
    //is it a palindrome?

    public void palind(add2 a){
        add2 A = a;
        add2 B = reverse(A);
        B.print();
        node h1 = A.head;
        node h2 = B.head;
        boolean x=true;
        while(h1.next!=null){
            if (h1.data != h2.data){
                x = false;
                break;
            }
            h1=h1.next;
            h2=h2.next;
        }
        if (h1.data != h2.data){
            x = false;
        }

        if (x == true){
            System.out.print("palindrome");
        }
        else{
            System.out.print("not a palindrome");
        }
    }		
    
    public add2 palin(add2 x) {
		node h1 = x.head;
		node h2=null;
		if(h2==null) {
			while(h1.next!=null) {
				h1=h1.next;
			}
            h2=h1;
        
			//System.out.println("adding "+h1.data);
			x.add(h1.data);
			h1=head;
		}
		for(int i =0; i<4-1; i++) {
			while(h1.next.data!=h2.next.data) {
                h1=h1.next;
			}
			x.add(h1.data);
			System.out.println("adding "+h1.data);
			h2=h2.next;
			h1=head;
			System.out.println("h2 is "+h2.data+" and h1 is"+h1.data);
            System.out.println("i = "+ i);
        }
		//x.print();
		return x;		
    }
    
    public add2 betterpalin(add2 a){
        add2 A = a;
        add2 B = reverse(a);
        node h1=A.head;
        node h2=B.head;
        while(h1.next!=null){
            A.add(h2.data);
            System.out.println("adding "+h2.data);
            h1=h1.next;
            h2=h2.next;
        }
        return A;
    }
}


