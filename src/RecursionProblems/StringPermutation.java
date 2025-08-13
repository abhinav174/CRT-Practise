package RecursionProblems;
//Time Complexity is O(n!) common for all permutation questions

public class StringPermutation {
    public static void permutation(String str, String perm)
    {
        if(str.length() == 0)
        {
            System.out.println(perm);
            return ;
        }
        for (int i = 0; i < str.length() ; i++) {
            char curr = str.charAt(i); // First Character of the string
            String newString  = str.substring(0,i) + str.substring(i+1); // second character and third character of string
            permutation(newString, perm+ curr);
        }
    }

    public static void main(String[] args) {
        String input = "ABC";
        permutation(input," ");
    }
}
