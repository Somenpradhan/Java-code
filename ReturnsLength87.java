class Sample
{
    public static void main(String[] args) 
    {
        System.out.println(stringLength("Hello, World!"));
        System.out.println(stringLength(""));
    }

    public static int stringLength(String s) 
    {
        return s.length();
    }
}