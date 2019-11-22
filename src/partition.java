/*
 public void partition(int x)
    {
        Node runner = head;
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
 */