import java.util.Arrays;
class Sample 
{
    public static int[] value(int[] digits)
    {
        int n = digits.length;
    
        for (int i = n - 1; i >= 0; i--) 
        {
            if (digits[i] == 9) 
            {
                digits[i] = 0;
            } 
            else 
            {
                digits[i]++;
                return digits;
            }
        }
    
            int[] result = new int[n + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, n);
            return result;
        }
    
        public static void main(String[] args) 
        {
            int[] digits = {1, 2, 3};
            int[] result = value(digits);
            System.out.println(Arrays.toString(result));
        }
    }
    