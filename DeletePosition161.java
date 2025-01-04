class Sample
{
    public static void main(String[] args)
    {
        StringBuffer str = new StringBuffer("Hello World");
    
        int start = 7;
        int end = 12;
    
        System.out.println("Original string: " + str);
    
        str.delete(start, end);
    
        System.out.println("String after deletion: " + str);
    }
}