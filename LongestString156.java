class Sample 
{
    public static void main(String[] args) 
    {
        System.out.println(findLongestWord("I love programming in Java"));  // Output: programming
        System.out.println(findLongestWord("This is a test string"));  // Output: string
        System.out.println(findLongestWord("Hello world"));  // Output: Hello
    }

    public static String findLongestWord(String str) 
    {
        String[] words = str.split("\\s+");
        String longestWord = "";
        for (String word : words) 
        {
            if (word.length() > longestWord.length()) 
            {
                longestWord = word;
            }
        }
        return longestWord;
    }
}