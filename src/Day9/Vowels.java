package Day9;
import java.util.*;
public class Vowels {
    public static void main(String[] args) {
        String input = "Hello Java Learners!";
        int count =0;
        for(int i =0;i<input.length();i++)
        {
            char ch = input.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                count ++;
                System.out.println(ch);
            }
        }
        System.out.println("No of Vowels: "+count);
    }
}
