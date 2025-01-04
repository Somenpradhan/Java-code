class Sample
{
    public static void main(String[] args) 
    {
        int[] array = {10, 20, 4, 45, 99, 98};

        if (array.length < 2) 
        {
            System.out.println("Array contain at least two elements.");
            return;
        }

        int firstSmallest = array[0];
        int secondSmallest = array[0];

        for (int i = 1; i < array.length; i++) 
        {
            if (array[i] < firstSmallest) 
            {
                firstSmallest = array[i];
            }
        }

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < secondSmallest && array[i] > firstSmallest) 
            {
                secondSmallest = array[i];
            }
        }

        System.out.println("The second smallest element in the array is: " + secondSmallest);
    }
}
