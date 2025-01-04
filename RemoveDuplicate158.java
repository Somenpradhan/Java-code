import java.util.Scanner;

class Sample
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        String result = removeDuplicates(str);
        System.out.println("String without duplicates: " + result);
    }

    public static String removeDuplicates(String str) 
    {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) 
        {
            if (sb.indexOf(String.valueOf(c)) == -1) 
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}