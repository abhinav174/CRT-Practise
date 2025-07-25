package Day8;

abstract class Animal{
    abstract void makeSound();
    void sleep(){
        System.out.println("ZzZzzz..");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog barks: Woof Woof");
    }
}
class Cat extends Animal{
    void makeSound()
    {
        System.out.println("Meow Meow ");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.makeSound();
        d.sleep();

        c.makeSound();
        c.sleep();
    }
}
