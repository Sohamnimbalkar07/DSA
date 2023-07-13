package stack;
import java.util.*;

public class Stack {
	
	private int[] arr;
	private int top;
	
	public Stack(int size)
	{
		arr = new int[size];
		top = -1;
	}
	
	public void push(int val)
	{
		if(isFull())
		{
			throw new RuntimeException("stack is full");
		}
		top++;
		arr[top] = val;
	}
	
	public void pop()
	{   
		if(isEmpty())
		{
			throw new RuntimeException("stack is empty");
		}
		top--;
		
	}
	
	public int peek()
	{
		if(isEmpty())
			throw new RuntimeException("Stack is Empty.");
		return arr[top];
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public boolean isFull()
	{
		return top == (arr.length -1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack s = new Stack(6);
		
		int choice, val;
		do {
			System.out.println("\n0. Exit\n1. Push\n2. Pop\n3. Peek\nEnter choice: ");
			choice = sc.nextInt();
			switch(choice) 
			{
			case 1:
				try {
					System.out.println("enter a value");
					val = sc.nextInt();
					s.push(val);
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
				break;
				
			case 2:
				try {
					
					val = s.peek();
					s.pop();
					System.out.println("popped value is " + val);
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
				break;
			
			case 3 : 
				try {
					
					val = s.peek();
					System.out.println("peek value is " + val);
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
				break;
			}
	        }while(choice != 0);
	}
}
