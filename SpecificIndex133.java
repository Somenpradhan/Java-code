import java.util.Scanner;
class Sample
{
    public static void main(String[] args)
    { 
        Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();
    
            System.out.print("Enter the index of the character you want to find: ");
            int index = scanner.nextInt();
    
            if (index < 0 || index >= inputString.length()) 
            {
                System.out.println("Invalid index ");
            } 
            else 
            {
                char character = inputString.charAt(index);
                System.out.println("The character at index " + index + " is: " + character);
            }
        }
}