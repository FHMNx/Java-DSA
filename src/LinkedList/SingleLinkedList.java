package LinkedList;

class Node {

    int data; //0
    Node next; //null

    Node(int data) {
        this.data = data;
    }
}

class LisnkedList {

    Node head, tail;

    public void insert(int data) {
        Node n = new Node(data);

        if (head == null) { //this is the first node
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public void display() {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

}

public class SingleLinkedList {

    public static void main(String[] args) {
        LisnkedList l = new LisnkedList();
        l.insert(10);
        l.insert(20);
        l.insert(30);

        l.display();
    }

}


//in LinkedList there is no fixed length like arrays
