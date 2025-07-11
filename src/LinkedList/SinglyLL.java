package LinkedList;

import java.util.NoSuchElementException;

public class SinglyLL {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    //addFirst
    //addLast
    //add(val,index)
    //deleteFirst
    //deleteLast
    //delete(index)
    //indexOf(val)
    //contains(val)

    public void addFirst(int val) {
        Node node = new Node(val);
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size += 1;
    }

    public void addLast(int val) {
        Node node = new Node(val);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size += 1;
    }

    public void add(int val, int index) {
        if (index == 0) {
            addFirst(val);
            return;
        }
        if (index == size) {
            addLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size += 1;

    }

    public void deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (head == tail) {
            head = tail = null;
            size -= 1;
            return;
        }
        head = head.next;
        size -= 1;
    }

    public void deleteLast() {
        if (head == tail) {
            head = tail = null;
            size -= 1;
        } else {
            Node temp = head;
            for (int i = 1; i < size - 1; i++) {
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
            size -= 1;
        }
    }

    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size) {
            deleteLast();
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next=temp.next.next;
        size-=1;
    }

    public int indexOf(int val) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.val == val) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public boolean contains(int val) {
        return indexOf(val) != -1;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            if (temp.next != null) {
                System.out.print(temp.val + " -> ");
            } else {
                System.out.print(temp.val);
            }
            temp = temp.next;
        }
        System.out.println();
    }
}

