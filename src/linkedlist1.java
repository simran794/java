public class linkedlist1
{
    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void add(int x)
    {
        Node temp = new Node(x);
        if(head == null)
        {
            head = temp;
        }
        else
        {
            Node h1 = head;
            while(h1.next != null)
            {
                h1 = h1.next; 
            }
            h1.next = temp;
        }
    }

    public void print()
    {
        Node h1 = head;
        while(h1.next != null)
        {
            System.out.print(h1.data + "->" );
            h1 = h1.next;
        }
        System.out.println(h1.data);
    }

    public int length()
    {
        int count = 0;
        Node temp = head;
        
        while(temp.next != null)
        {
            count++;
            temp = temp.next;
        }
        count++;
        return count;
    }
}