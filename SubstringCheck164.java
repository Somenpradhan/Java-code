import java.util.Scanner;
class Sample
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the main string:");
        String main = scanner.nextLine();

        System.out.println("Enter the substring to check:");
        String sub = scanner.nextLine();

        boolean contains = main.toLowerCase().contains(sub.toLowerCase());

        if (contains) 
        {
            System.out.println("String contains the substring");
        } 
        else 
        {
            System.out.println("String does not contain the substring");
        }
    }
}
