class Sample
{
    public static void main(String[] args)
    {
        int[] array = {10, 21, 32, 43, 54, 65, 76};
        int count = 0;

        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] % 2 != 0) 
            {
                count++;
            }
        }
        System.out.println("Odd numbers in the array are: " + count);
    }
}