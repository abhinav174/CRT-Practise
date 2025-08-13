package RecursionProblems;

public class Guest {
    public static int callGuest(int n ){
        if(n<=1){
            return 1;
        }
        int s  = callGuest(n-1);
        int p = (n-1) * (callGuest(n-2));
        return s+p;
    }

    public static void main(String[] args) {
        int n =4;
        System.out.println(callGuest(n));
    }
}
