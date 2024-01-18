package queue;

import java.util.Stack;

public class QueueUsingStack {
	
	static Stack<Integer> s1 = new Stack<>();
	static Stack<Integer> s2 = new Stack<>();
	
	public void add(int val)
	{
		while(!s1.isEmpty())
		{
			s2.push(s1.pop());
		}
		s1.push(val);
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
	}
	
	public int poll()
	{
		int val = s1.pop();
		return val;
	}
	

	public static void main(String[] args) {
	
		QueueUsingStack q = new QueueUsingStack();
		
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());

	}

}
