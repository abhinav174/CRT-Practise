package Day8;

interface  Vehicle{
    void start();
    void stop();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("Car is Starting...");
    }
    public void stop(){
        System.out.println("Car is stopping");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.stop();
    }
}
