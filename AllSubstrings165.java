import java.util.Scanner;
class Sample 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String input = scanner.nextLine();

        System.out.println("Substrings are: ");
        for (int i = 0; i < input.length(); i++) 
        {
            for (int j = i + 1; j <= input.length(); j++) 
            {
                System.out.println(input.substring(i, j));
            }
        }
    }
}
