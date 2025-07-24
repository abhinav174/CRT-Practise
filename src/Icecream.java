import java.util.*;
public class Icecream {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            boolean Duplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    Duplicate = true;
                    break;
                }
            }
            if (!Duplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
