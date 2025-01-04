class Sample
{
    public static void main(String[] args) 
    {
        int[] nums = {4, 1, 2, 1, 2};
        int result = SingleNumber(nums);
        System.out.println("The single number is: " + result);
    }

    public static int SingleNumber(int[] nums) 
    {
        int singleNumber = 0;
        for (int num : nums) 
        {
            singleNumber = singleNumber ^ num;
        }
        return singleNumber;
    }
}
