class Sample
{
    public static void main(String[] args) 
    {
        System.out.println(removeVowels("Hello World"));
        System.out.println(removeVowels("aeiou"));
        System.out.println(removeVowels("bcdfghjklmnpqrstvwxyz"));
    }

    public static String removeVowels(String s) 
    {
        return s.replaceAll("[aeiouAEIOU]", "");
    }
}