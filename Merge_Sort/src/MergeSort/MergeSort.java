package MergeSort;

import java.util.Arrays;

public class MergeSort {
	
	public static void mergeSort(int [] arr, int left, int right)
	{
		if( left >= right)
			return;
		int mid = (left + right) /2;		
		
		mergeSort(arr,left,mid);
		
		mergeSort(arr,mid+1,right);
		
		int[] temp = new int[right - left + 1];
		
		int i = left;
		int j = mid+1;
		int k = 0;
		
		while(i <= mid &&  j <= right)
		{
		     if(arr[i] < arr[j] )
		  {
			temp[k] = arr[i];
			k++;
			i++;
		  }
		     else
		  {
			temp[k] = arr[j];
			k++;
			j++;
		  }
		
		}
		
		while( i <= mid)
		{
			temp[k] = arr[i];
			i++;
			k++;
		}
		while( j <= right)
		{
			temp[k] = arr[j];
			j++;
			k++;
		}
		
		for(i = 0; i < temp.length; i++)
		{
			arr[left + i] = temp[i];
		}
    }

	public static void main(String[] args) {
		
		int[] arr = {8, 3, 10, 1, 5, 7, 2, 6, 4,9};
		System.out.println(Arrays.toString(arr));
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

}
