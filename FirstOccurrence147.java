class Sample
{
    public static void main(String[] args)
    {
        String inputString = "Hello, World!";
        char target = 'o';
    
        int index = inputString.indexOf(target);

        if (index!= -1)
        {
            System.out.println("Input string: " + inputString);
            System.out.println("Target character: " + target);
            System.out.println("Index of the first occurrence: " + index);
        } 
        else 
        {
            System.out.println("The character '" + target + "' is not found in the string.");
        }
    }
}