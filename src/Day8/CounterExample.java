package Day8;

// Create a class Counter with static variable count initialized to 0,
// a constructor that increments count by 1 each time the object is created.
// a static method getCount returns the current count
// In the main method create three instances and use Counter.getCount() to print how many instances have been created

class Counter{
    static int count =0;
    Counter()
    {
        count += 1;
    }
    static void getCount()
    {
        System.out.println(count);
    }
}
public class CounterExample {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        Counter.getCount();

    }
}
