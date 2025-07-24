package Day7;
//Usage of Constructors

class Dog{
    String name;
    String breed;
    public Dog(String name,String breed)
    {
        this.name = name;
        this.breed = breed;
    }
    public void bark()
    {
        System.out.println(name+" says woof!");
    }
}
public class Animal {
    public static void main(String args[])
    {
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        System.out.println("My Dogs name is :"+myDog.name+" and its a "+myDog.breed);
        myDog.bark();
    }
}
