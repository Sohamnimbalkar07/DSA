package arraySorting;

import java.util.Arrays;

public class ArraySorting {
	
	public static void bubbleSort(int[] arr)
	{
		for(int i = 0;i<arr.length-1;i++)
		{
			for(int j = 0;j< arr.length-1;j++)
			{
				if(arr[j+1] < arr[j])
				{
					int temp= arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	
	public static void improvedbubbleSort(int[] arr)
	{
		for(int i = 0;i<arr.length-1;i++)
		{   boolean swapFlag = false;
			for(int j = 0;j< arr.length-1-i;j++)
			{
				if(arr[j+1] < arr[j])
				{
					int temp= arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					swapFlag = true;
				}
			}
			
			if(!swapFlag)
				break;
		}
	}
	
	public static void insertionSort(int[] arr)
	{
		for(int i = 1;i<arr.length;i++)
		{
			int temp = arr[i];
			int j;
			for(j = i-1;j>= 0 && arr[j] > temp;j--)
			{
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6, 4, 2, 8, 3, 1};
		int[] arr1 = {5, 3, 9, 7, 4, 1};
		int[] arr2 = {4, 7, 2, 5, 9, 8};

		ArraySorting.bubbleSort(arr);
		System.out.println( Arrays.toString(arr));
		ArraySorting.improvedbubbleSort(arr1);
		System.out.println( Arrays.toString(arr1));
		ArraySorting.insertionSort(arr2);
		System.out.println( Arrays.toString(arr2));
	}

}
