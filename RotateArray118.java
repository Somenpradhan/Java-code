class Sample
{
    public static void main(String[] args) 
    {
        int[] array = {1, 2, 3, 4, 5};

        int lastElement = array[array.length - 1];


        for (int i = array.length - 1; i > 0; i--) 
        {
            array[i] = array[i - 1];
        }

        array[0] = lastElement;

        System.out.println("Array after rotation: ");
        for (int i = 0; i < array.length; i++) 
        {
            System.out.print(array[i] + " ");
        }
    }
}