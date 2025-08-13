package RecursionProblems;

public class StringReverse {
    public static void Reverse(String s, int id)
    {
        if(id < 0)
        {
            return;
        }
        System.out.print(s.charAt(id));
        Reverse(s,id-1);

    }

    public static void main(String[] args) {
        String str ="dcba";
        int len = str.length();
        Reverse(str,len-1);
    }
}
