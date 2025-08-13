package RecursionProblems;

public class FirstLastOccurence {
    public static int first =-1;
    public static int last = -1;
    public static void FL(String s , int index, char element){
        if(index  == s.length()-1){
            return ;
        }
        char currChar = s.charAt(index);
        if(currChar == element)
        {
            if(first == -1){
                first = index;
            }
            else{
                last = index;
            }

        }

        FL(s,index+1,element);

     }
    public static void main(String[] args) {
        String str = "abbcda";
        FL(str,0,'a');
        System.out.println("First occurence:"+first);
        System.out.println("Last occurence:"+last);
    }
}
