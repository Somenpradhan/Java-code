class FinalClass 
{
    public void printMessage() 
    {
        System.out.println("This is a final class");
    }
}
class SubClass extends FinalClass 
{
    public class FinalClassExample 
    {
        public static void main(String[] args) 
        {
            FinalClass obj = new FinalClass();
            obj.printMessage();
        }
    }
}
