import java.util.Scanner;
class Sample
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial term: ");
        int initialTerm = scanner.nextInt();

        System.out.print("Enter the common difference: ");
        int commonDifference = scanner.nextInt();

        System.out.println("The first 10 terms of the arithmetic sequence are: ");

        for (int i = 0; i < 10; i++) 
        {
            int term = initialTerm + i * commonDifference;
            System.out.print(term + " ");
        }
    }
}