package Day11;
// n =0101
public class BitwiseGETOperation {
    public static void main(String[] args) {
        int n = 5;
        int position =2;
        int bitmask = 1<<position;
        if((bitmask & n) == 0)
        {
            System.out.println("The Bit is 0");
        }
        else {
            System.out.println("The bit is 1");
        }
    }
}
