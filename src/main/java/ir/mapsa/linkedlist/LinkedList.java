package ir.mapsa.linkedlist;

public class LinkedList {
    // TODO: don't need set null (default is null)
    // TODO: why this field is static?
    private static Node head = null;
    private Node tail = null;

    public void appendToTail(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    private static boolean isEmpty() {
        return head == null;
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

    public Node getPrevious(Node node) {
        Node current = head;
        while (current != null) {
            if (current.getNext() == node) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    private int find(int data) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.getData() == data) return index;
            current = current.getNext();
            index++;
        }

        return -1;
    }

    public Node deleteNode(Node head, int data) {
        if (head == null || find(data) == -1) {
            return null;
        }
        Node currNode = head, prev = null;
        if (currNode.getData() == data) {
            prev = getPrevious(head);
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
