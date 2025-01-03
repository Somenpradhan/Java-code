class Sample 
{
    public static void main(String[] args) 
    {
        int n = 15; 
        int num1 = 0, num2 = 1;

        System.out.println("The 15 numbers in the Fibonacci sequence are: ");
        
        for (int i = 1; i <= n; i++) 
        {
            System.out.print(num1 + " ");

            int next = num1 + num2;
            num1 = num2;
            num2 = next;
        }
    }
}
