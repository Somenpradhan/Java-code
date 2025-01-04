class Sample
{
    public static void main(String[] args)
    {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("Array Representation: ");
        for (int i : array) 
        {
            System.out.print(i + " ");
        }
        int n = array.length;
        for (int i = 0; i < n / 2; i++) 
        {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
        System.out.println("\nReversed array:");
        for (int i : array) 
        {
            System.out.print(i + " ");
        }
    }
}
