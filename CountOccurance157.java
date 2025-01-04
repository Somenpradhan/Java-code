import java.util.Scanner;

class Sample 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        System.out.println("Enter a character:");
        char c = scanner.next().charAt(0);
        int count = countChar(str, c);
        System.out.println("The character '" + c + "' occurs " + count + " times in the string");
    }

    public static int countChar(String str, char c) 
    {
        int count = 0;
        for (char ch : str.toCharArray()) 
        {
            if (ch == c) 
            {
                count++;
            }
        }
        return count;
    }
}