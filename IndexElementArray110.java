import java.util.Scanner;
class Sample
{
    public static void main(String[] args)
    {
        int[] array = {10, 21, 32, 43, 54, 65, 76};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to find the index of: ");

        int value = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] == value) 
            {
                index = i;
                break;
            } 
        }
        if (index != -1) 
        {
            System.out.println("The value " + value + " is found at index " + index + ".");
        } 
        else 
        {
            System.out.println("The value " + value + " is not found in the array.");
        }
    }
}