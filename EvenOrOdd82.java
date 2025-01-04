class Sample
{
    public static void main(String[] args) 
    {
        int number = 7;
        String result = EvenOrOdd(number);
        System.out.println("The number " + number + " is: " + result);
    }

    public static String EvenOrOdd(int num) 
    {
        if (num % 2 == 0) 
        {
            return "Even";
        }
        else 
        {
            return "Odd";
        }
    }
}
