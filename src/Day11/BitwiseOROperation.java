package Day11;

public class BitwiseOROperation {
    public static void main(String[] args) {
        int n =5;
        int pos =1;
        int bitmask = 1<< pos;
        int newNo = bitmask | n;
        System.out.println(newNo);
    }
}