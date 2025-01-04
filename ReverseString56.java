import java.util.Scanner;
class Sample
{
	public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String String = scanner.nextLine();

        for (int i = String.length()-1; i>=0 ; i--) 
        {
            System.out.println(String.charAt(i));
        }
    }
}