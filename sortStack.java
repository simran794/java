import java.util.Stack;

public class sortStack {
    Stack<Integer> stack;
    Stack<Integer> copyStack;
    sortStack()
    {
        this.stack = new Stack<>();
        this.copyStack = new Stack<>();
    }

    sortStack(int data)
    {
        this.stack = new Stack<>();
        stack.push(data);
        this.copyStack = new Stack<>();
    }
    
    public void push (int data)
    {
        if(stack.isEmpty() || data <= stack.peek())
        {
            stack.push(data);
        }
        else{
            while(data > stack.peek())
            {
                copyStack.push(stack.pop());
                if(stack.isEmpty())  break;
            }
            stack.push(data);
            while(!copyStack.isEmpty())
            {
                stack.push(copyStack.pop());
            }
        }
    }

    public int pop(){
        return stack.pop();
    }

    public int peek(){
        return stack.peek();
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public void print()
    {
        while(!stack.isEmpty())
        {
            System.out.println(stack.peek());
            copyStack.push(stack.pop());
        }
        while(!copyStack.isEmpty())
        {
            stack.push(copyStack.pop());
        }
    }
}
