import java.util.HashSet;

class Sample 
{
    public static void main(String[] args) 
    {
        System.out.println("Input: \"abcabcbb\"");
        System.out.println("Output: " + lengthOfLongestSubstring("abcabcbb"));
        System.out.println();

        System.out.println("Input: \"bbbbb\"");
        System.out.println("Output: " + lengthOfLongestSubstring("bbbbb"));
        System.out.println();

        System.out.println("Input: \"pwwkew\"");
        System.out.println("Output: " + lengthOfLongestSubstring("pwwkew"));
        System.out.println();

        System.out.println("Input: \"\"");
        System.out.println("Output: " + lengthOfLongestSubstring(""));
        System.out.println();

        System.out.println("Input: \"abcdefghijklmnopqrstuvwxyz\"");
        System.out.println("Output: " + lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyz"));
    }

    public static int lengthOfLongestSubstring(String s) 
    {
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < n; right++) 
        {
            while (set.contains(s.charAt(right))) 
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}