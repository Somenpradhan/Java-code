class Sample
{
    public static void main(String[] args)
    {
        int[] array = {10, 20, 30, 40, 50, 5};
        int min = array[0];

        for (int i = 1; i < array.length; i++) 
        {
            if (array[i] < min) 
            {
                min = array[i];
            }
        }
        System.out.println("Minimum element in the array: " + min);
    }
}