package ir.mapsa.practicethree.linkedlist;

public class LinkedList {
    private Node head = null;
    private Node tail = null;

    public void appendToTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public Node getNode(int item) {
        Node current = head;
        while (current != null) {
            if (current.getData() == item) {
                return current;
            }
            current = current.getNext();
        }
        return new Node(item);
    }


    public Node deleteByKey(Node head, int value) {
        if (head == null) {
            return null;
        }
        Node currNode = head, prev = null;
        if (currNode.getData() == value) {
            head = currNode.getNext();
            return head;
        }

        while (currNode != null && currNode.getData() != value) {
            prev = currNode;
            currNode = currNode.getNext();
        }

        if (currNode != null) {
            prev.setNext(currNode.getNext());
        }
        if (currNode == null) {
            System.out.println(value + " not found");
        }
        return head;
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

}
