package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	
	private static Queue<Integer> q1 = new LinkedList<>();
	private static Queue<Integer> q2 = new LinkedList<>();
	
    public void push(int val)
    {
    	 while(!q1.isEmpty())
    	 {
    		 q2.offer(q1.poll());
    	 }
    	 q1.offer(val);
    	 while(!q2.isEmpty())
    	 {
    		 q1.offer(q2.poll());
    	 }
     }
    
    public int pop()
    {
    	if(q1.isEmpty())
    	{
    		return -1;
    	}
    	int i = q1.peek();
    	q1.poll();
    	return i;
    }

	public static void main(String[] args) {
		
		StackUsingQueue s = new StackUsingQueue();
		s.push(1);
		s.push(2);
		s.push(3);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		

	}

}
