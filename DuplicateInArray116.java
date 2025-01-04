class Sample
{
    public static void main(String[] args) 
    {
        int[] array = {1, 3, 4, 2, 3, 1, 5, 2};

        System.out.println("Duplicate elements are:");

        for (int i = 0; i < array.length; i++) 
        {
            for (int j = i + 1; j < array.length; j++) 
            {
                if (array[i] == array[j]) 
                {
                    System.out.println(array[i]);
                    break;
                }
            }
        }
    }
}