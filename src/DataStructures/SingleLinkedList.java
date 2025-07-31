package DataStructures;
//From Scratch Code
public class SingleLinkedList {
    int size =1;
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void addLast(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        size++;
        Node currNode = head;
        if(head.next == null)
        {
            head.next = newNode;
            return;
        }
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void deleteFirst()
    {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }
    public void deleteLast()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        size--;
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null)
        {
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }
    public void elementSearch(String key) {
        Node currNode = head;
        while (currNode != null) {
            if (key != null && key.equals(currNode.data)) {
                System.out.println("Element is found");
                return;
            }
            currNode = currNode.next;
        }
        System.out.println("Element not found");
    }

    public void findMax()
    {
        int max =0;
        int num =0;
        Node currNode = head;
        while(currNode!=null)
        {
            try {
                num = Integer.parseInt(currNode.data);
            }
            catch(Exception e){
                System.out.println("Exception is: "+e.getMessage());
            }
            if( num > max){
                max = num;
            }
            currNode = currNode.next;
        }
        System.out.println("Max Element is: "+max);
    }
    public void findMin()
    {
        int min =500;
        int num =0;
        Node currNode = head;
        while(currNode!=null)
        {
            try {
                num = Integer.parseInt(currNode.data);
            }
            catch(Exception e){
                System.out.println("Exception is: "+e.getMessage());
            }
            if( num < min){
                min = num;
            }
            currNode = currNode.next;
        }
        System.out.println("Min Element is: "+min);
    }

    public void printList()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null)
        {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
        System.out.println("Size of LinkedList: "+size);
    }
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.addFirst("30");
        list.addFirst("20");
        list.addFirst("10");
        list.addLast("40");
        list.addLast("50");
        list.printList();
        list.deleteFirst();;
        list.printList();
        list.deleteLast();
        list.printList();
        list.elementSearch("10");
        list.elementSearch("80");
        list.findMax();
        list.findMin();
        list.printList();
    }
}
