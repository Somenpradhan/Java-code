class Sample 
{
    public static void main(String[] args) 
    {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);

        for (int num : nums) 
        {
            System.out.print(num + " ");
        }
    }

    public static void moveZeroes(int[] nums) 
    {
        int n = nums.length;
        int ZeroFound = 0;

        for (int i = 0; i < n; i++) 
        {
            if (nums[i] != 0) 
            {
                nums[ZeroFound] = nums[i];
                ZeroFound++;
            }
        }

        for (int i = ZeroFound; i < n; i++) 
        {
            nums[i] = 0;
        }
    }
}
