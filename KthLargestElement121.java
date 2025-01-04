import java.util.Arrays;
class Sample 
{
    public static void main (String[] args)
    {
        int[] arr = {3,2,1,5,6,4};
        int k = 2;

        Arrays.sort(arr);

        int KthLargestElement = arr[arr.length - k];
        System.out.println("Kth largest element is: " + KthLargestElement);

    }
}

