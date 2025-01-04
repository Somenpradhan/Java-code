class Sample
{
    public static void main(String[] args)
    {
        String inputString = "Hello World";
        char[] charArray = inputString.toCharArray();
        
        System.out.println("Original string: " + inputString);
        System.out.print("Character array: ");
                for (char c : charArray) 
                {
                    System.out.print(c + " ");
                }
    }
}