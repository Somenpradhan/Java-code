class Sample 
{
    public static void main(String[] args) 
    {
        System.out.println("Max of 10 and 20: " + max(10, 20));
        System.out.println("Max of -5 and 0: " + max(-5, 0));
        System.out.println("Max of 100 and 50: " + max(100, 50));
    }

    public static int max(int a, int b) 
    {
        return (a > b) ? a : b;
    }
}