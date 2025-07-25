package Day7;
class Person{
    String name;
    int age;
    public void displayPerson()
    {
        System.out.println("Name is: "+this.name);
        System.out.println("Age is :"+this.age);
    }
}
class StudentDetail extends Person{
    int RollNumber;
    public void displayStudent()
    {
        System.out.println("Roll number is: "+this.RollNumber);
    }
}
public class StudentSingleInheritance {
    public static void main(String args[]){
        StudentDetail sd = new StudentDetail();
        sd.age = 21;
        sd.RollNumber =525;
        sd.name = "Abhi";
        sd.displayPerson();
        sd.displayStudent();
    }
}
