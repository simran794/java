
public class partition{
    public void partitionList(int x) // you should return the head node of the new list, also pass in the list as a parameter
    {
        Node runner = head;   // head of what? if you pass in the list you can use the head of that :) 
        Node small_head = null;
        Node small = null;
        Node large_head = null;
        Node large = null;

        while(runner.next != null)
        {
            if(runner.data < x)
            {
                if(small_head == null)
                {
                    small_head = runner;
                    small = small_head;
                }
                else
                {
                    small.next = runner;
                    small = runner;
                }
            }

            else
            {
                if(large_head == null)
                {
                    large_head = runner;
                    large = large_head;
                }
                else
                {
                    large.next = runner;
                    large = runner;
                }
            }
            runner = runner.next;
        }
        if(runner.data < x)
        {
            small.next = runner;
            small = runner;
        }
        else
        {
            large.next = runner;
            large = runner;
        }
        large.next = null;
        small.next = large_head;
    }    
}
 