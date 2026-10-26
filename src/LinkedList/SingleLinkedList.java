package LinkedList;

class Node {

    int data; // 0
    Node next; // null

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {

    Node head, tail;
    public void insert(int data) {
        Node n = new Node(data);

        if (head == null) {  //this is the first node
            head = n;
            tail = n;
        }else{
            tail.next = n;
            tail = n;
        }
    }
    
    public void display(){
        Node temp = head;
        
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class SingleLinkedList {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        
        l.display();
    }

}

//in LinkedList there is no fixed length like arrays
// first node is called as head
// last node is called as tail
