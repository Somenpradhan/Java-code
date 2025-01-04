public class MathUtils
{
    public static int calculate(int a, int b)
    {
        return a + b;
    }
    interface MathOperation
    {
        default int calculate(int a, int b)
        {
            return a + b;
        }
    }
}