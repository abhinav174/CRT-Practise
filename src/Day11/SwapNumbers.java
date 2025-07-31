package Day11;

public class SwapNumbers {
    public static void SwapArray(int[] a)
    {
        if(a.length<2)
        {
            System.out.println("Atleast 2 Numbers are required");
            return;
        }
        else{
            System.out.println("Numbers before swapping are:"+a[0]+" "+a[1]);
            a[0] = a[0] ^ a[1];
            a[1] = a[0] ^ a[1];
            a[0] = a[0] ^ a[1];
            System.out.println("Numbers after swapping are:"+a[0]+" "+a[1]);
        }
    }
    public static void main(String[] args) {

        int a =5;
        int b =10;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b; // or a = a - b
        System.out.println(a);
        System.out.println(b);

        int[] arr = {10,15};
        SwapArray(arr);


    }
}
