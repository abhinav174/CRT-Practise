package DataStructures;
import java.util.Stack;
public class StackDS {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        stack.push("Person1");
        stack.push("Person2");
        System.out.println(stack);
        System.out.println("Deleted Element: "+stack.pop());
        String topElement = stack.peek();
        System.out.println("Top Element: "+topElement);
    }
}
