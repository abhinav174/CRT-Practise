package RecursionProblems;

public class SendXtoLast {
    public static void moveX(String s, int index,int count, String newStr){
        if(index == s.length()-1)
        {
            for (int i = 0; i < count; i++) {
                newStr += "x";
            }
            System.out.println(newStr);
            return;
        }
        char currChar = s.charAt(index);
        if(currChar == 'x')
        {
            count++;
            moveX(s,index+1,count,newStr);
        }else {
            newStr += currChar;
            moveX(s, index + 1, count, newStr);
        }
    }

    public static void main(String[] args) {
        String str ="axbxcde";
        String newStr = "";
        moveX(str,0,0,newStr);
    }
}
