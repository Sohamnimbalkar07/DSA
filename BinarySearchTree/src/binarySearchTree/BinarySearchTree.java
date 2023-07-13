package binarySearchTree;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTree {

	static class Node
	{
		private int data;
		private Node left;
		private Node right;
		
		
		public Node()
		{
			data = 0;
			left = null;
			right = null;
		}
		
		public Node(int val)
		{
			data = val;
			left = null;
			right = null;
		}
		
		public int getData() {
			return data;
		}
	}
	
	private Node root;
	
	public BinarySearchTree()
	{
		root = null;
	}
	
	public void add(int val)
	{ 
		Node newNode = new Node(val);
		if (root == null)
		{
			root = newNode;
		}
		
		else
		{   
			Node trav = root;
		while(true)
		{
		if(trav.data > val)
			{   
				if(trav.left != null)
			    {
				trav = trav.left;
			    }
				else
			   {
				trav.left = newNode;
				break;
				}
			}
			
			else
			{     //if(trav.data <= val )
				   if(trav.right != null)
				{
					trav = trav.right;
				}
				else
				{
					trav.right = newNode;
					break;
				}
				
			}
		}
		}
	}
	
	public void preorder(Node trav)
	{
		if(trav == null)
		{
			return;
		}
		System.out.print(trav.data+ " ,");
		preorder(trav.left);
		preorder(trav.right);
	}
	
	public void preorder()
	{
		System.out.print("PRE : ");
		preorder(root);
		System.out.println();
	}
	
	public void preorderNonRecursive()
	{   
		System.out.print("PRE : ");
		Stack<Node> s = new Stack<>(); 
		Node trav = root;
		
		while(trav != null || !s.isEmpty())
		{
		   while(trav != null)
		 {
		System.out.print(trav.data + ", ");
		if(trav.right != null)
		     {
			s.push(trav.right);
		     }
		trav = trav.left;
		  }
		if(!s.isEmpty())
		  {
			trav = s.pop();
		  }
		}
		System.out.println();
	}
	
	public void inorder(Node trav)
	{
		if(trav == null)
		{
			return;
		}
		inorder(trav.left);
		System.out.print(trav.data+ " ,");
		inorder(trav.right);
	}
	
	public void inorder()
	{
		System.out.print("IN : ");
		inorder(root);
		System.out.println();
	}
	
	public void inorderNonRecursive()
	{
		System.out.print("IN  : ");
		Stack<Node> s = new Stack<>();
		Node trav = root;
		while(trav != null || !s.isEmpty())
		{
		while(trav != null) 
		{
		  s.push(trav); 
		  trav = trav.left;
		}
		
		if(!s.isEmpty())
		{
			trav = s.pop();
			System.out.print(trav.data + ", ");
			trav = trav.right;
		}
		}
		System.out.println();
	}
	
	
	public void postorder(Node trav)
	{
		if(trav == null)
		{
			return;
		}
		postorder(trav.left);
		postorder(trav.right);
		System.out.print(trav.data+ " ,");
		
	}
	
	public void postorder()
	{
		System.out.print("POST : ");
		postorder(root);
		System.out.println();
	}
	

	
	
	//delete all nodes individually  by using recursion by using postorder traversal
	private void deleteAll(Node trav) {
		if(trav == null)
			return;
		deleteAll(trav.left);
		deleteAll(trav.right);
		trav.left = null;
		trav.right = null;
		trav = null;
	}
	
	public void deleteAll() {
		deleteAll(root);
		root = null;
	}
	
	public int height(Node trav)
	{
		if (trav == null)
			{
			  return -1;
			}
		int hl = height(trav.left);
		int hr = height(trav.right);
		int max = hl > hr ? hl : hr;
		int height = max +1;
		return height;
	}
	
	public int height()
	{
		return height(root);
	}
	
	public Node breadthFirstSearch(int key)
	{   Queue<Node> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty())
      { 
		Node trav = q.poll();
		if(trav.data == key)
		{
			return trav;
		}
		if(trav.left != null)
		{
			q.offer(trav.left);
		}
		if(trav.right != null)
		{
			q.offer(trav.right);
		}
	   }
		return null;
		
	}
	
	public Node depthFirstSearch(int key) {
		Stack<Node> s = new Stack<>();
		s.push(root);
		while(!s.isEmpty()) {
			Node trav = s.pop();
			if(key == trav.data)
				return trav;
			if(trav.right != null)
				s.push(trav.right);
			if(trav.left != null)
				s.push(trav.left);
		}
		return null;
	}
	
	public Node binarySearch(int key)
	{   
		Node trav = root;
		while(trav != null)
		{
			if(trav.data == key) {
				
				return trav;
			}
			if(trav.data > key)
			{
				trav = trav.left;
			}
			else
			{
				trav = trav.right;
			}
		}
		return null;
	}
	
	public Node[] binarySearchWithParent(int key)
	{   
		Node trav = root;
		Node parent = null;
		while(trav != null)
		{    
			
			if(trav.data == key) {
				
				return new Node[] { trav, parent };
			}
			parent = trav;
			if(trav.data > key)
			{
				trav = trav.left;
			}
			else
			{
				trav = trav.right;
			}
		}
		return new Node[] { null, null };
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinarySearchTree t = new BinarySearchTree();
		t.add(50);
		t.add(30);
		t.add(10);
		t.add(90);
		t.add(100);
		t.add(40);
		t.add(70);
		t.add(80);
		t.add(60);
		t.add(20);
		
		t.preorder();
		t.preorderNonRecursive();
	    t.inorder();
	    t.inorderNonRecursive();
		t.postorder();
		System.out.println("Height: " + t.height());
		System.out.print("Enter element to find: ");
		int val = sc.nextInt();
		
		Node temp = t.breadthFirstSearch(val);
		if(temp == null)
			System.out.println("BFS: Not found.");
		else
			System.out.println("BFS: Found: " + temp.getData());
		
		
		temp = t.depthFirstSearch(val);
		if(temp == null)
			System.out.println("DFS: Not found.");
		else
			System.out.println("DFS: Found: " + temp.getData());
		
		temp = t.binarySearch(val);
		if(temp == null)
			System.out.println("BS: Not found.");
		else
			System.out.println("BS: Found: " + temp.getData());
		

		Node[] arr = t.binarySearchWithParent(val);
		if(arr[0] == null)
			System.out.println("BS: Not found.");
		else if(arr[1] == null) // root node found
			System.out.println("BS: Found: " + arr[0].getData() + " with Parent: " + arr[1]);
		else // node found with parent
			System.out.println("BS: Found: " + arr[0].getData() + " with Parent: " + arr[1].getData());
		
		t.deleteAll();
		t.preorder();
		System.out.println("Height: " + t.height());

	}

}
