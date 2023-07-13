package searchingArray;


public class SearchingArray {
	
	public static int binarySearch(int[] arr,int key)
{    int left =0;
     int right= arr.length -1;
	int mid;
	while(right >= left)
	{
		
	mid = (left + right) /2;
	if(key == arr[mid])
	{
		return mid;
	}
	if(key < arr[mid])
	{
		right = mid-1;
	}
	else
	{
		left = mid +1;
	}
	}
	return -1;
}
	
	

	public static void main(String[] args) {
		
		int[] arr = {11,22,33,44,55,66,77,88,99};
        int index = SearchingArray.binarySearch(arr,11);
        if(index != -1)
        {
        	System.out.println("number is found at index " + index);
        }
        else 
        {
        	System.out.println("number is not found");
        }
		

	}

}
