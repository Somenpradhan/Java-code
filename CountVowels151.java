class Sample
{
    public static void main (String[] args)
    {
        String inputString = "Hello World";
    
        int vowelCount = countVowels(inputString);
    
        System.out.println("Input string: " + inputString);
        System.out.println("Number of vowels: " + vowelCount);
    }
    public static int countVowels(String str) 
    {
        int count = 0;
        str = str.toLowerCase();
    
        for (int i = 0; i < str.length(); i++) 
        {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
            {
                count++;
            }
        }
        return count;
    }
}
