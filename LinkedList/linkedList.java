package LinkedList;

import java.util.LinkedList;

public class linkedList {

    public void linkedListMethods() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(5));
        System.out.println(list.contains(10));
    }
}
