import java.util.Arrays;
class Sample
{
    public static void main(String[] args)
    {
        int[] array = {1,8,5,2,6,9,3};
        System.out.println("The Original Array: " + Arrays.toString(array));

        Arrays.sort(array);
        
        System.out.println(" The Sorted Array: " + Arrays.toString(array));

    }
}