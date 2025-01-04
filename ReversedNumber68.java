import java.util.Scanner;
class Sample
{
	public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int reversedNumber = 0;
        while (num != 0) 
        {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed number: " + reversedNumber);
        }
}
