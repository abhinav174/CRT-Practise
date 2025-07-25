package Day8;



abstract class Animal1{
    abstract void makeSound();
    void sleep(){
        System.out.println("ZzZzzz..");
    }
}
class Dog1 extends Animal1{
    void makeSound(){
        System.out.println("Dog barks: Woof Woof");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Dog1 d = new Dog1();

        d.makeSound();
        d.sleep();

    }
}
