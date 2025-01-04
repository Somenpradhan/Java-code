class Sample
{
    public static void main(String[] args)
    {
        int[] array = {10, 20, 30, 40, 50};
        int count = 0;
        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] % 2 == 0) 
            {
                count++;
            }
        }
        System.out.println("Even numbers in the array are: " + count);
    }
}