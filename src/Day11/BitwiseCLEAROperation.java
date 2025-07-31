package Day11;

public class BitwiseCLEAROperation {
    public static void main(String[] args) {
        int n = 5;
        int pos =2;
        int bitmask = 1 << pos;
        int notBitMask = ~(bitmask);
        int newBit = notBitMask & n;
        System.out.println(newBit);

    }
}
