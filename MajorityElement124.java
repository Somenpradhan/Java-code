class Sample
{
    public static int Element(int[] arr) 
    {
        int count = 0;
        int Element = arr[0];

        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == Element) 
            {
                count++;
            } 
            else 
            {
                count--;
            }

            if (count == 0) 
            {
                Element = arr[i];
                count = 1;
            }
        }

        return Element;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        int majority = Element(arr);
        System.out.println("Majority Element: " + majority);
    }
}