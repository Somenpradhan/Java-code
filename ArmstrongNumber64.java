import java.util.Scanner;
class Sample 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (Armstrong(number)) 
        {
            System.out.println(number + " is a Armstrong number ");
        } 
        else
        {
            System.out.println(number + " is not a Armstrong number ");
        }
    }
    private static boolean Armstrong(int num) 
    {
        int num1 = num;
        int result = 0;
        int n = String.valueOf(num).length();

        while (num != 0) 
        {
            int digit = num % 10;
            result += Math.pow(digit, n);
            num = num / 10;
        }
        return result == num1;
    }
}
