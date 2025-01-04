class Sample
{
    public static void main(String[] args) 
    {
        int[] nums = {1, 0, 1, 1, 0, 1};
        int maxConsecutive = Ones(nums);
        System.out.println(" " + maxConsecutive);
    }

    public static int Ones(int[] nums) 
    {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) 
        {
            if (num == 1) 
            {
                currentCount++;
                if (currentCount > maxCount) 
                {
                    maxCount = currentCount;
                }
            } 
            else 
            {
                currentCount = 0;
            }
        }

        return maxCount;
    }
}
