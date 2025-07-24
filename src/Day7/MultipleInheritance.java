package Day7;

class ThatPerson{
    String name;
    int age;
    public void displayPerson()
    {
        System.out.println("Name is :"+ this.name);
        System.out.println("Age is :"+this.age);
    }
}
class ThatStudent extends ThatPerson{
    int rollNumber;
    public void displayStudent()
    {
        System.out.println("Roll Number: "+this.rollNumber);
    }
}
class GraduateStudent extends ThatStudent{
    String degree;
    public void displayGradutateStudent()
    {
        System.out.println("Degree is: "+this.degree);
    }
}

public class MultipleInheritance {
public static void main(String args[])
{
    GraduateStudent gs = new GraduateStudent();
    gs.name = "Abhi";
    gs.age = 25;
    gs.rollNumber = 525;
    gs.degree = "Btech";
    gs.displayPerson();
    gs.displayStudent();
    gs.displayGradutateStudent();
}

}
