class Sample
{
    public static void main(String[] args)
    {
        String String = "Hello, World!";
        String suffix = "World!";
    
        boolean suf = String.endsWith(suffix);
    
        System.out.println("Input string: " + String);
        System.out.println("Suffix: " + suffix);
        System.out.println("Does the string end with the suffix? " + suf);
    }
}