package Contests;
import java.util.*;
public class D_Even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w =in.nextInt();
        int half = w/2;
        if(half%2==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
