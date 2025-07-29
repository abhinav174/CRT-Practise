package Day10;

import java.util.Arrays;

public class SecondLargest {
    public int SLargest(int[] a)
    {
        int n = a.length;
        int largest = a[n-1];
        for(int i = n-1;i>=0;i--)
        {
            if(a[i] != largest )
            {
                return a[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = {85,23,6,7,2,99,41};
        SecondLargest s = new SecondLargest();
        int result = s.SLargest(arr1);
        System.out.println("Second Largest Element is: "+result);

    }
}
