import java.util.Arrays;

class Sample
{
    public static void main(String[] args) 
    {
        System.out.println(areAnagrams("listen", "silent"));  // Output: true
        System.out.println(areAnagrams("hello", "world"));  // Output: false
        System.out.println(areAnagrams("acts", "cats"));  // Output: true
    }

    public static boolean areAnagrams(String s1, String s2) 
    {
        if (s1.length() != s2.length()) 
        {
            return false;
        }
        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}