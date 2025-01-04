class Sample
{
        public static void main(String[] args) 
        {
            int rows = 5; 
            printPascalsTriangle(rows);
        }
    
        public static void printPascalsTriangle(int rows) 
        {
            for (int i = 0; i < rows; i++) 
            {
                for (int j = 0; j < rows - i; j++) 
                {
                    System.out.print(" ");
                }
    
                int number = 1;
                for (int j = 0; j <= i; j++) 
                {
                    System.out.print(number + " ");
                    number = number * (i - j) / (j + 1);
                }
                System.out.println();
        
            }
    }
}