class Animal 
{
    public void makeSound() 
    {
        System.out.println("Animal makes a sound ");
    }
}
class Dog extends Animal 
{
    public void makeSound() 
    {
        System.out.println("Dog is barking ");
    }
}
public class Override
{
    public static void main(String[] args) 
    {
        Animal animal = new Dog();
        animal.makeSound();
    }
}