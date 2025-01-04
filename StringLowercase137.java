import java.util.Scanner;
class Sample
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
    
        String lowercase = inputString.toLowerCase();
    
        System.out.println("Lowercase String: " + lowercase);
    }
}