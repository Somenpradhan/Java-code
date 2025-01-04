class Sample 
{
    public static void main(String[] args) 
    {
        System.out.println(countWords("Hello World"));
        System.out.println(countWords("This is a test string"));
        System.out.println(countWords("   "));
    }

    public static int countWords(String s) 
    {
        int count = 0;
        boolean inWord = false;
        for (char c : s.toCharArray()) 
        {
            if (Character.isWhitespace(c)) 
            {
                inWord = false;
            } 
            else if (!inWord) 
            {
                count++;
                inWord = true;
            }
        }
        return count;
    }
}