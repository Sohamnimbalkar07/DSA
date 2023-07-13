package hashTable;
import java.util.LinkedList;
import java.util.Scanner;

public class HashTable {
	
	static class pair
	{
		private int key;         //key = roll 
		private String value;    //value = name
		
		public pair()
		{
			key = 0;
			value = "";
		}
		
		public pair(int key, String value)
		{
			this.key = key;
			this.value = value;
		}
		
	}
	
	private final int SLOT = 10;
	private LinkedList<pair> table[];
	
	public HashTable()
	{
		table = new LinkedList[SLOT];
		for(int i = 0;i<10;i++)
		{
			table[i] = new LinkedList<>();
		}
	}
	
	public int Hash(int key)
	{
		return key %10;
	}
	
	public String get(int key)
	{
		int slot = Hash(key);
        LinkedList<pair> bucket = table[slot];
        for(pair pair : bucket)
        {
        	if(key == pair.key)
        	{
        		return pair.value;
        	}
        }
        return null;
	}
     
	public void put(int key,String Value)
	{
		int slot = Hash(key);
        LinkedList<pair> bucket = table[slot];
        for(pair pair : bucket)
        {
        	if(key == pair.key)
        	{
        		pair.value = Value;
        		return;
        	}
        	
        }
        
        pair Pair = new pair(key,Value);
        bucket.add(Pair);
        
	}
	
	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashTable ht = new HashTable();
		ht.put(1, "Nilesh");
		ht.put(4, "Nitin");
		ht.put(8, "Sandeep");
		ht.put(5, "Amit");
		ht.put(24, "Vishal");
		ht.put(34, "Yogesh");
		ht.put(25, "Aakash");
		ht.put(1, "Rohan");
		
		System.out.print("Enter roll to find: ");
		int roll = sc.nextInt();
		String name = ht.get(roll);
		System.out.println("Name found: " + name);
		
		sc.close();
	}

}
