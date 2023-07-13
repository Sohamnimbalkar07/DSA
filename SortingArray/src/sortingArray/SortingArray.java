package sortingArray;

import java.util.Arrays;



public class SortingArray {
	
	public static void selectionSort(int[] arr)
	{
		for(int i = 0;i< arr.length;i++)
		{
			for(int j =i+ 1;j <arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[j];
					arr[j]= arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	public static void bubbleSort(int arr[])
	{
		for(int i = 0;i< arr.length-1;i++)
		{
			for(int j = 0;j<arr.length-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void insertionSort(int[] arr)
	{
		for(int i = 1;i<arr.length;i++)
		{
			int temp = arr[i];
			int j;
			for( j = i-1;j>= 0 &&  temp < arr[j];j--)
			{
				arr[j+1]= arr[j];
			}
			arr[j+1] = temp;
		}
	}
	
	
	public static void main(String[] args)
	{
 int[] arr= {4,8,2,5,3,9,6,1};
 SortingArray.selectionSort(arr);
 System.out.println( Arrays.toString(arr));
 
 int[] arr1= {5,8,1,9,10,6,3,7};
 SortingArray.bubbleSort(arr1);
 System.out.println( Arrays.toString(arr1));
 
	int[] arr2 = {4, 7, 2, 5, 9, 8};

 SortingArray.insertionSort(arr2);
System.out.println( Arrays.toString(arr2));
	
}

}
