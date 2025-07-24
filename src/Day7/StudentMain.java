package Day7;

class SomeStudent{
    String name;
    int rollNumber;
    char grade ;

    SomeStudent(String name, int rollNumber, char grade){
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }
    public void displayDetails()
    {
        System.out.println("Name of Student is: "+name);
        System.out.println("Roll number of Student is: "+rollNumber);
        System.out.println("Grade of Student is: "+grade);
    }
}

public class StudentMain {
    public static void main(String args[])
    {
        SomeStudent s = new SomeStudent("Uday", 27, 'F');
        s.displayDetails();
    }
}
