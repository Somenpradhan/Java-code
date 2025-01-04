import java.util.Arrays;
class Sample
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;

        rotateArray(arr, k);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void rotateArray(int[] arr, int k) 
    {
        k = k % arr.length; 
        int[] rotated = new int[arr.length];
        for (int i = 0; i < arr.length; i++) 
        {
            if (i < k) 
            {
                rotated[i] = arr[arr.length - k + i];
            } 
            else 
            {
                rotated[i] = arr[i - k];
            }
        }
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = rotated[i];
        }
    }
}