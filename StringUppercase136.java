import java.util.Scanner;
class Sample
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
    
        String uppercase = inputString.toUpperCase();
    
        System.out.println("Uppercase String: " + uppercase);
    }
}
