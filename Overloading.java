public class Overloading 
{
    public int add(int a, int b) 
    {
        return a + b;
    }
    public double add(double a, double b) 
    {
        return a + b;
    }
    public int add(int a, int b, int c) 
    {
        return a + b + c;
    }
    public static void main(String[] args) 
    {
        Overloading obj = new Overloading();
        int sum1 = obj.add(2, 3);
        double sum2 = obj.add(2.5, 3.7);
        int sum3 = obj.add(1, 2, 3);
    
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3); 
    }
}
