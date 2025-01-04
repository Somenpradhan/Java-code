class Sample
{
    public static void main(String[] args)
    {
        String err = "Hello, World!";
        char Char = 'l';
        char newChar = '*';
        String newString = replaceCharacter(err, Char, newChar);
        System.out.println("Original string: '" + err + "'");
        System.out.println("New string: '" + newString + "'");
    }
    public static String replaceCharacter(String s, char oldChar, char newChar) 
    {
        return s.replace(oldChar, newChar);
    }
}