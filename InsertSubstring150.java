class Sample
{
    public static void main(String[] args) 
    {
        String String = "Hello World";
        String substring = "Java ";
        int index = 7;

        StringBuffer sb = new StringBuffer(String);

        sb.insert(index, substring);

        String result = sb.toString();

        System.out.println("Original string: " + String);
        System.out.println("Substring to insert: " + substring);
        System.out.println("Index to insert: " + index);
        System.out.println("Resulting string: " + result);
    }
}