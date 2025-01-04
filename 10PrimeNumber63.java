class Sample
{
    public static void main(String[] args)
    {
        int count = 0;
        int num = 2;

        System.out.println("The first 10 prime numbers are: ");

        while (count < 10) 
        {
            if (Prime(num)) 
            {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
    private static boolean Prime(int num) 
    {
        if (num <= 1) 
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            if (num % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
}
