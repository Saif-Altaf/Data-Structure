package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLL list=new SinglyLL();
        list.addFirst(50);
        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        list.print();
        list.delete(3);
        list.print();
    }
}
