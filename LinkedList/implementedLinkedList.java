package LinkedList;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class implementedLinkedList {

    public Node createHead(int head) {
        Node headNode = new Node(head);
        return headNode;
    }

    public Node insertNewNode(Node head, int newNode) {
        // copying the head node
        Node headCopy = head;
        // iterating through the linked list til the last node
        while (headCopy.next != null) {
            headCopy = headCopy.next;
        }
        // creating a new node
        Node newUpdatedNode = new Node(newNode);
        // inserting new node to the end of linked list
        headCopy.next = newUpdatedNode;
        // returning the old head of ll.
        return head;
    }

    public void iterateOverLinkedList(Node headNode) {
        while (headNode.next != null) {
            System.out.println(headNode.data);
            headNode = headNode.next;
        }
        // printing last node whose next is null but still have data
        System.out.println(headNode.data);
    }
}