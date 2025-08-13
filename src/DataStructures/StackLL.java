package DataStructures;

 class Stack {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next =null;
        }
    }
    Node top;
    void push(int data){
        Node newNode = new Node(data);
        newNode.next =top;
        top = newNode;
    }
    void display(){
        Node temp = top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    int pop(){
        if(top == null){
            System.out.println("Stack empty");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }
    int peek(){
        if(top == null){
            System.out.println("Stack is empty");
            return  -1;
        }
        return top.data;
    }
}
public class StackLL{
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Popped Element is: "+stack.pop());
        stack.display();
        System.out.println("Top element is:"+stack.peek());
    }
}
