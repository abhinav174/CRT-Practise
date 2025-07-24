package Day7;

class SomeAnimal{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}
class SomeDog extends SomeAnimal{
    void bark()
    {
        SomeAnimal animal = new SomeAnimal();
        animal.eat();
        System.out.println("Dog is barking");
    }
}
public class SingleInheritance {
    public static void main(String args[])
    {
        SomeDog myDog = new SomeDog();
        myDog.bark();
//        myDog.eat();

    }
}
