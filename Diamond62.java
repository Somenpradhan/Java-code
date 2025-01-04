import java.util.Scanner;
class Sample 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) 
        {
            printRow(rows, i);
        }
        for (int i = rows - 1; i >= 1; i--) 
        {
            printRow(rows, i);
        }        
    }
        private static void printRow(int tr, int cr) 
        {
                    for (int j = tr; j > cr; j--) 
                    {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= (2 * cr - 1); k++) 
                    {
                        System.out.print("*");
                    }
                    System.out.println();
        }
} 