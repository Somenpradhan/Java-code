import java.util.Scanner;
class Sample
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int lcm = findLCM(num1, num2);

        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);

    }

    public static int findLCM(int a, int b) 
    {
        return (a * b) / findGCD(a, b);
    }

    public static int findGCD(int a, int b) 
    {
        if (b == 0) 
        {
            return a;
        }
        return findGCD(b, a % b);
    }
}
