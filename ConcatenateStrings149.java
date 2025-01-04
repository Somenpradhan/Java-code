class Sample
{
    public static void main(String[] args) 
    {
        String str1 = "Hello";
        String str2 = "World";

        StringBuilder sb = new StringBuilder();

        sb.append(str1);
        sb.append(str2);

        String result = sb.toString();

        System.out.println("Original strings:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("Concatenated string: " + result);
    }
}