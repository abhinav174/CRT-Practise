//Class and Object Implementation

class Student{
    String name;
    int age;

    public void getInfo()
    {
        System.out.println("Name of Student: "+ this.name);
        System.out.println("Age of Student: "+this.age);
    }
}

public class Main7 {
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.name = "Uday";
        s1.age = 99;
        s1.getInfo();
    }
}
