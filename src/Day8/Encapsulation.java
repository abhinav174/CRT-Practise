package Day8;

//Encapsulation Example: We cannot directly assign the values to the variable in the main method, so we need to use getter and setter methods
// s.name ="abhi"; this is wrong way of doing it, u cannot directly give the value to it

class Student{
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int newAge)
    {
        if(newAge >0)
        {
            age = newAge;
        }
        else{
            System.out.println("Age must be positive");
        }
    }
}

public class Encapsulation {
    public static void main(String args[])
    {
        Student s = new Student();

        s.setName("Abhi");
        s.setAge(20);

        System.out.println("The Name of Student is: "+s.getName());
        System.out.println("The Age of Student is: "+s.getAge());

    }
}
