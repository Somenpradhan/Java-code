class Sample 
{
    public static void main(String[] args)
    {
        String num1 = "Somen";
        String num2 = "Pradhan";

        System.out.println(num1);
        System.out.println(num1 == num2);

        num1 = concatStrings(num1, num2);
        System.out.println(num1);
    }

    private static String concatStrings(String str1, String str2) 
    {
        return str1 + str2;
    }
}