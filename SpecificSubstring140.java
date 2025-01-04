class Sample
{
    public static void main(String[] args)
    {
        String original = "Hello World";
        String substring = "World";
        
        boolean name = Substring(original, substring);
        
        System.out.println("Original string: '" + original + "'");
        System.out.println("Substring: '" + substring + "'");
        System.out.println("Contains substring: " + name);
    }
    public static boolean Substring(String s, String sub) 
    {
        return s.contains(sub);
    }
}