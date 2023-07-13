package doublyLinkedList;
import java.util.*;

public class doublyLinkedList {

	
	class Node
	{
		private int data;
		private Node next;
		private Node prev;
		
		public Node()
		{
			data = 0;
			next = null;
			prev = null;
		}
		
		public Node(int val)
		{
			data = val;
			next = null;
			prev = null;
		}
		
		}
	
	Node head;
	
	public doublyLinkedList()
	{
		head = null;
	}
	
	public void displayForward()
	{   System.out.println(" forward list");
		Node trav = head;
	    while(trav != null)
	{
	      System.out.println(trav.data);
	      trav = trav.next;
		
	}
	
	}
	
	public void displayReverse()
	{   System.out.println(" reverse list");
		Node trav = head;
	    while(trav.next != null)
	{
	      
	      trav = trav.next;
    }
	
	 while(trav != null)
	 {
		 System.out.println(trav.data);
	      trav = trav.prev;
	      //System.out.println(trav.prev);
	      
	 }
	
	}
	
	public void addFirst(int val)
	{
		Node nn = new Node(val);
		if(head== null)
		{
			head = nn;
		}
		else
		{
		head.prev = nn;
		nn.next = head;
		head = nn;
		}
	}
	
	public void addLast(int val)
	{
		Node nn = new Node(val);
		if(head==null) {
			head=nn;
			return;
		}
		Node trav = head;
		while(trav.next!= null)
		{
			trav = trav.next;
		}
		
		
		nn.prev = trav;
		trav.next = nn;
	 }
	
	public void addAtPosition(int val,int p)
	{
		Node nn = new Node(val);
		if (p == 1)
		{
			addFirst(val);
		}
		else {
	    Node trav = head;
	    int a = 1;
	    while(a != (p-1))
	    {   
	        if(trav.next == null)
	      {
	    	break;
	      }
	    	trav = trav.next;
	    	a++;
	    }
	    nn.prev = trav;
	    nn.next = trav.next;
	    trav.next.prev = nn;
	    trav.next = nn;
		}
	}
	
	public void deleteFirst()
	{
		Node trav = head;
		head = trav.next;
		trav.next.prev = null;
		
	}
	public void deleteLast()
	{   Node trav = head;
		while(trav.next.next != null)
		{
			trav = trav.next;
		}
		trav.next = null;
		
	}
	
	public void deleteAtPosition(int pos)
	{
		Node trav = head;
		int a =1;
		while(a != pos)
		{
			trav = trav.next;
			a++;
		}
		
		trav.prev.next = trav.next;
		trav.next.prev = trav.prev;
	}
	
	public void deleteAll()
	{
		head = null;
	}
	
	public static void main(String[] args)
	{
		doublyLinkedList list = new doublyLinkedList();
		Scanner sc = new Scanner(System.in);
		int val,pos,choice;
		
		do 
		{
			System.out.println("\n0. Exit \n1. Display\n2. Add First\n3.  Add Last\n4. Add At Pos\n"
					+ "5. Del First\n6.  Del Last\n7. Del At Pos\n8. Del All\nEnter choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: // Display
				list.displayForward();
				list.displayReverse();
				break;
			case 2: //addfirst
				System.out.println("enter a value");
				val = sc.nextInt();
				list.addFirst(val);
				break;
			case 3://addlast
				System.out.println("enter a value");
				val = sc.nextInt();
				list.addLast(val);
				break;	
			case 4://addatposition
				System.out.println("enter a value");
				val = sc.nextInt();
				System.out.println("enter a position");
				pos = sc.nextInt();
				list.addAtPosition(val,pos);
				break;
			case 5: //delete first
			    list.deleteFirst();
			    break;
			case 6:
				list.deleteLast();
			case 7://deleteatposition
				
				System.out.println("enter a position");
				pos = sc.nextInt();
				list.deleteAtPosition(pos);
				break;
			case 8:
				list.deleteAll();
			}
		}while(choice !=0);
	}
}
