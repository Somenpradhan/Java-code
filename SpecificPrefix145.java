class Sample
{
    public static void main(String[] args)
    {
        String String = "Hello, World!";
        String prefix = "Hello";
        
        boolean str = String.startsWith(prefix);
        
        System.out.println("Input string: " + String);
        System.out.println("Prefix: " + prefix);
        System.out.println("Does the string start with the prefix? " + str);
    }
}