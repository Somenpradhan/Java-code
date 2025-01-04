import java.util.Scanner;
class Sample
{
    public static void main(String[] args)
    {
        int[] array = {1, 21, 62, 53, 24, 89, 95};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value to search for: ");
        int valueToFind = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] == valueToFind) 
            {
                found = true;
                break;
            }
        }
        if (found) 
        {
            System.out.println("The array contains the value " + valueToFind + ".");
        } 
        else 
        {
            System.out.println("The array does not contain the value " + valueToFind + ".");
        }
    }
}