package ir.mapsa.linkedlist;

public class LinkedList {
    private static Node head = null;
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

    public Node getNode(int data) {
        Node current = head;
        while (current != null) {
            if (current.getData() == data) {
                return current;
            }
            current = current.getNext();
        }
        return new Node(data);
    }

    public Node getHead() {
        return head;
    }

    public Node getPrevious(Node node) {
        Node current = getHead();
        while (current != null) {
            if (current.getNext() == node) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public Node deleteNode(Node head, int data) {
        if (head == null) {
            return null;
        }
        Node currNode = head, prev = null;
        if (currNode.getData() == data) {
            prev=getPrevious(head);
            prev.setNext(currNode.getNext());
            return head;
        }

        while (currNode != null && currNode.getData() != data) {
            prev = currNode;
            currNode = currNode.getNext();
        }

        if (currNode != null) {
            prev.setNext(currNode.getNext());
        }
        if (currNode == null) {
            System.out.println(data + " not found");
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
