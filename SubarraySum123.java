class Sample
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 7, 5};
        int sum = 12;
        Subarray(arr, sum);
    }

    public static void Subarray(int[] arr, int targetSum) 
    {
        int start = 0, end = 0;
        int currentSum = 0;

        while (end < arr.length) 
        {
            currentSum = currentSum + arr[end];

            while (currentSum > targetSum && start <= end) 
            {
                currentSum = currentSum - arr[start];
                start++;
            }

            if (currentSum == targetSum) 
            {
                System.out.print(" ");
                for (int i = start; i <= end; i++) 
                {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                return;
            }

            end++;
        }

        System.out.println("No subarray with the given sum found.");
    }
}
