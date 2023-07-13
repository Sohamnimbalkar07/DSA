package binarySearch;

public class BinarySearch {
	
	public static int binarySearch(int[] arr, int key)
	{
		int left = 0;
		int right = arr.length - 1;
		int mid;
		while(right >= left)
		{
		mid = (left + right) /2;
		if(arr[mid] == key)
		{
			return mid;
		}
		else 
		{ 
			if(key < arr[mid])
		{
			right = mid -1;
		}
		else
		{
			left = mid +1;
		}
		}
		}
		return -1;
	}
	
//	public static int recursiveBinarySearch(int[] arr,int left, int right, int key)
//	{
//		
//		if(right < left)
//		{
//			return -1;
//		}
//		int mid  = (left + right)/2;
//		int index;
//		if(arr[mid] == key)
//		{
//			return mid;
//		}
//		if(arr[mid] > key)
//		{
//			index = recursiveBinarySearch(arr, left,mid -1,key);
//		}
//		else
//		{
//			index = recursiveBinarySearch(arr,mid +1,right,key);
//		}
//		return index;
//	}
	
     

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {11,22,33,44,55,66,77,88,99};
        int index = BinarySearch.binarySearch(arr,55);
        if(index != -1)
        {
        	System.out.println("number is found at index " + index);
        }
        else 
        {
        	System.out.println("number is not found");
        }
        
//        index = BinarySearch.recursiveBinarySearch(arr, 0, arr.length-1, 11);
//		if(index != -1)
//			System.out.println("Key found at index: " + index);
//		else
//			System.out.println("Key not found.");
	}

}
