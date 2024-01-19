import java.util.Arrays;
class Sorting
{
    public static void selectionSort(int [] arr)
    {
        for(int i = 0; i< arr.length;i++)
        {
            for(int j = i+1; j< arr.length;j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void bubbleSort(int [] arr)
    {
        for(int i = 0; i < arr.length ; i++)
        {
            for(int j = 0; j < arr.length - 1 -i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int [] arr)
    {
        for(int i = 1; i < arr.length ;i++)
        {
            int temp = arr[i];
            int j ;
            for(j = i - 1; j >= 0 && arr[j] > temp; j--)
            {
                arr[j+1] = arr[j];
            }

            arr[j+1] = temp;
        }
    }

    public  static void mergeSort(int[] arr, int left, int right)
    {
        if(left == right)
        {
            return;
        }

        int mid = (left + right) /2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);

        int []temp = new int[right - left +1];

        int i = left;
        int j = mid+1;
        int k = 0;

        while( i <= mid && j <= right)
        {
            if(arr[i] < arr[j])
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

        while(i<= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j<= right)
        {
            temp[k] = arr[j];
            k++;
            j++;
        }

        for( i = 0; i < temp.length ; i++)
        {
            arr[left+i] = temp[i];
        }
    }

    public static void swap(int [] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int left, int right)
    {
        if(left >= right)
        {
            return;
        }

        int i = 0;
        int j = right;

        while( i < j)
        {
            while( i <= right && arr[i] <= arr[left])
            {
                i++;
            }

            while(arr[j] > arr[left])
            {
                j--;
            }

            if(i < j)
            {
                swap(arr, i,j);
            }
        }

        swap(arr,left,j);
        quickSort(arr, left,j-1);
        quickSort(arr,j+1,right);

    }
    
    public static void main(String[] args)
    {
       int [] arr = {3,5,7,1,9,4,1,4};
       selectionSort(arr);
       System.out.println(Arrays.toString(arr));

       int [] arr1 = {7,3,6,2,5,9,10,11,54,23,11,7,99,65,34};
       bubbleSort(arr1);
       System.out.println(Arrays.toString(arr1));

       int [] arr2 = {4,7,89,45,56,23,78,45,7,3,89,1,111};
       insertionSort(arr2);
       System.out.println(Arrays.toString(arr2));

       int [] arr3 = {4,7,89,45,56,23,78,45,7,3,89,1,111};
       mergeSort(arr3,0,arr3.length-1);
       System.out.println(Arrays.toString(arr3));

       int [] arr4 = {4,7,89,45,56,23,78,45,7,3,89,1,111};
       quickSort(arr4,0,arr4.length-1);
       System.out.println(Arrays.toString(arr4));
    }
}

