import java.util.Arrays;
class Sample
{
        public static void main(String[] args) 
        {
            int[] array = {1, 3, 4, 2, 3, 1, 5, 2};
    

            Arrays.sort(array);

            int Count = 1;
            for (int i = 1; i < array.length; i++) 
            {
                if (array[i] != array[i - 1]) 
                {
                    Count++;
                }
            }

            int[] Array = new int[Count];
            Array[0] = array[0];
            int index = 1;

            for (int i = 1; i < array.length; i++) 
            {
                if (array[i] != array[i - 1]) 
                {
                    Array[index++] = array[i];
                }
            }

            System.out.println("Array without duplicates: ");
            for (int i = 0; i < Array.length; i++) 
            {
                System.out.print(Array[i] + " ");
            }
        }
}