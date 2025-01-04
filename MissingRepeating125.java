class Sample {
    public static void main(String[] args) 
    {
        int[] arr = {4, 3, 6, 2, 1, 1};
        int[] result = Missing(arr);
        System.out.println("Missing: " + result[0]);
        System.out.println("Repeating: " + result[1]);
    }

    public static int[] Missing(int[] arr) 
    {
        int n = arr.length;
        boolean[] Visited = new boolean[n + 1];

        for (int i = 0; i < n; i++) 
        {
            Visited[arr[i]] = true;
        }

        int missing = -1;
        int repeating = -1;

        for (int i = 1; i <= n; i++) 
        {
            if (!Visited[i]) 
            {
                missing = i;
                break;
            }
        }

        for (int i = 0; i < n; i++) 
        {
            if (arr[i] > 1 && arr[i] <= n) 
            {
                int num = Math.abs(arr[i]) - 1;
                if (arr[num] > 0) 
                {
                    arr[num] = -arr[num];
                }
            }
        }

        for (int i = 0; i < n; i++) 
        {
            if (arr[i] < 0) {
                repeating = Math.abs(arr[i]) + 1;
                break;
            }
        }

        return new int[]{missing, repeating};
    }
}