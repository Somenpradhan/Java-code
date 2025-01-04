import java.util.Arrays;
class Sample
{
    public static void main(String[] args)
    {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};
                
        int[] merge = new int[array1.length + array2.length];
                
        for (int i = 0; i < array1.length; i++) 
        {
            merge[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) 
        {
            merge[array1.length + i] = array2[i];
        }

        System.out.print("Merged Array: ");

        for (int i = 0; i < merge.length; i++) 
        {
            System.out.print(merge[i] + " ");
        }
    }
}