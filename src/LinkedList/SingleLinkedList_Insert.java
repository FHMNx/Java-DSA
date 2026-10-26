/**
 * INSERT AT BEGINING ,SPECIFIED POSITION , END
 * */
package LinkedList;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {

    Node head, tail;

    public void insert(int data) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("LIST EMPTY");
        } else {
            Node temp = head;

            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }

    public void insertAtBeginning(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            n.next = head;
            head = n;
        }
    }

    public void insertAtSpecifiedPosition(int position, int data) {
        Node n = new Node(data);
        Node temp = head;

        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;

        }
        n.next = temp.next;
        temp.next = n;
    }

}

public class SingleLinkedList_Insert {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(10);
        l.insert(20);
        l.insert(30);

        l.insertAtBeginning(5);
        l.insertAtSpecifiedPosition(2, 15);
        l.display();
    }

}
