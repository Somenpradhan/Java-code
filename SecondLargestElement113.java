class Sample
{
    public static void main(String[] args) 
    {
        int[] array = {10, 20, 4, 45, 99, 98};

        int num1 = array[0];
        int num2 = array[0];


        for (int i = 1; i < array.length; i++) 
        {
            if (array[i] > num1) 
            {
                num2 = num1;
                num1 = array[i];
            } 
            else if (array[i] > num2 && array[i] != num1) 
            {
                num2 = array[i];
            }
        }
        System.out.println("The second largest element in the array is: " + num2);
    }
}
