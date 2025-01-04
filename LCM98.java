class Sample 
{
    public static int gcd(int a, int b) 
    {
        if (b == 0) 
        {
            return a;
        }
        return gcd(b, a % b);
    }
    public static int lcm(int a, int b) 
    {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) 
    {
        System.out.println(lcm(12, 15));
        System.out.println(lcm(24, 30));
        System.out.println(lcm(7, 11));
    }
}