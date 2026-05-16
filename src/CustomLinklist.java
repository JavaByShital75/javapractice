public class CustomLinklist {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = node;
    }

    public void print() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + "-> ");
            curNode = curNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        CustomLinklist c = new CustomLinklist();
        c.addFirst("Shital");
        c.addFirst("more");
        c.addFirst("tyson");
        c.print();
        c.addLast("patil");
        c.print();

    }
}





