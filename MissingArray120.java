class Sample
{
    public static void main(String[] args) 
    {
        int[] array = {1, 2, 3, 5}; 
        int n = array.length + 1; 

        int expected = n * (n + 1) / 2;
        int actual = 0;


        for (int i = 0; i < array.length; i++) 
        {
            actual += array[i];
        }

        int missingNumber = expected - actual;

        System.out.println("The missing number is: " + missingNumber);
    }
}