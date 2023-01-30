package LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        // linkedList listMethods = new linkedList();
        // listMethods.linkedListMethods();

        implementedLinkedList impl = new implementedLinkedList();
        Node headNode = impl.createHead(5);

        impl.insertNewNode(headNode, 6);
        impl.insertNewNode(headNode, 7);
        impl.insertNewNode(headNode, 8);

        impl.iterateOverLinkedList(headNode);
    }
}
