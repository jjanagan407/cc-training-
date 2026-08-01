
public class doublelinkedlist {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;

    void insertfirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    void insertmiddle(int data, int key) {
        Node currNode = head;

        while (currNode != null) {
            if (currNode.data == key) {

                Node newNode = new Node(data);

                newNode.next = currNode;
                newNode.prev = currNode.prev;

                if (currNode.prev != null) {
                    currNode.prev.next = newNode;
                } else {
                    head = newNode;
                }

                currNode.prev = newNode;
                return;
            }

            currNode = currNode.next;
        }

        System.out.println("Key not found");
    }

    void insertlast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
        newNode.prev = currNode;
    }

    void deletefirst() {

        if (head == null)
            return;

        if (head.next == null) {
            head = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    void deletemiddle(int key) {

        if (head == null)
            return;

        if (head.data == key) {
            deletefirst();
            return;
        }

        Node currNode = head.next;

        while (currNode != null) {

            if (currNode.data == key) {

                currNode.prev.next = currNode.next;

                if (currNode.next != null) {
                    currNode.next.prev = currNode.prev;
                }

                return;
            }

            currNode = currNode.next;
        }

        System.out.println("Key not found");
    }

    void deletelast() {

        if (head == null)
            return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.prev.next = null;
    }

    void display() {

        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        doublelinkedlist m = new doublelinkedlist();

        m.insertfirst(2);
        m.insertfirst(3);
        m.insertlast(8);
        m.insertfirst(6);
        m.insertlast(20);
        m.insertlast(24);

        System.out.println("Original List:");
        m.display();

        m.insertmiddle(5, 8);
        m.insertmiddle(12, 3);

        System.out.println("After Insert Middle:");
        m.display();

        m.deletemiddle(2);

        System.out.println("After Delete Middle:");
        m.display();

        m.deletefirst();

        System.out.println("After Delete First:");
        m.display();

        m.deletelast();

        System.out.println("After Delete Last:");
        m.display();
    }
}