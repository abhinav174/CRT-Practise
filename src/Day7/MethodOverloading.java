package Day7;

public class MethodOverloading {

    String name;
    int age;
    public void displayInfo(String name)
    {
        System.out.println("The name is only: "+name);
    }
    public  void displayInfo(int age){
        System.out.println("The age is only: "+age);
    }
    public void displayInfo(String name,int age){
        System.out.println("The name: "+name+" the age is: "+age);
    }

    public static void main(String args[]){
        MethodOverloading obj = new MethodOverloading();
        obj.displayInfo("Abhinav");              // Calls method with String
        obj.displayInfo(22);                     // Calls method with int
        obj.displayInfo("Abhinav", 22);
    }
}
