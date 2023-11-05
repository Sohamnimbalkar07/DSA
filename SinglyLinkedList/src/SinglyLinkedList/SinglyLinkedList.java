package SinglyLinkedList;

public class SinglyLinkedList {
	
	public static class Node
	{
		
		private int data;
		private Node next;
		
		public Node()
		{
			data = 0;
			next = null; 
		}
		
		public Node(int val)
		{
			data = val;
			next = null;
		}
		
	}
	
	private Node head;
	
	public SinglyLinkedList()
	{
		head = null;
	}
	
	public void display()
	{
		Node trav = head;
		
		while(trav != null)
		{
			System.out.print(trav.data + " ->");
			trav = trav.next;
		}
	
	}
	
	public void addFirst(int val)
	{
		Node n1 = new Node(val);
		n1.next = head;
		head  = n1;
	}
	
	public void addLast(int val)
	{
		Node n1 = new Node(val);
		Node trav  = head;
		
		while(trav.next != null)
		{
			trav = trav.next;
		}
		
		trav.next = n1;
	}
	
	public void deleteFirst()
	{
			head = head.next;
	}
	
	public void deleteLast()
	{
		Node trav = head;
		Node prev = null;
		
		while(trav.next != null)
		{
			prev = trav;
			trav = trav.next;
		}
		prev.next = null;
	}
	
	public void addAtPosition(int val, int position)
	{
		Node n1 = new Node(val);
		
		Node trav = head;
		
		for(int i =1; i<position -1 ;i++)
		{
			if(trav.next == null)
				break;
			trav = trav.next;
			
		}
		
		n1.next = trav.next;
		
		trav.next = n1;
	}
	
	public void deleteAtPosition(int position)
	{
		Node trav = head;
		Node prev = null;
		for(int i = 1;i<position;i++)
		{
			prev = trav;
			trav = trav.next;
		}
		
		  prev.next = trav.next;
	}
	
	

	public static void main(String[] args) {
		

		SinglyLinkedList list = new SinglyLinkedList();
		
		list.addFirst(1);
		list.addFirst(2);
		list.addLast(3);
		list.addLast(4);
		list.addAtPosition(5, 5);
		//list.deleteAtPosition(3);
		//list.addAtPosition(6, 10);
		//list.deleteFirst();
		//list.deleteAtPosition(3);
		list.display();
	}

}
