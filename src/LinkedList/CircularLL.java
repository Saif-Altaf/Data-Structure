package LinkedList;

public class CircularLL {
    private Node head;
    private Node tail;

    private class Node {
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public void addFirst(int val) {
            Node node = new Node(val);
            if (isEmpty()) {
                head = tail = node;
                return;
            }
            node.next = head;
            tail.next = node;
            head = node;
        }

        public void delete(int val){
            Node temp=head;
            if(temp==null){
                return;
            }
            if(temp.val==val){
               head=head.next;
               tail.next=head;
               return;
            }
            do{
                Node after=temp.next;
                if(after.val==val){
                    temp.next=after.next;
                    break;
                }
                temp=temp.next;
            }while (temp!=null);
        }

        public void print() {
            Node temp = head;
            if (head != null) {
                do {
                    System.out.println(temp.val + "->");
                    temp = temp.next;
                }while(temp!=head);
            }
        }

        private boolean isEmpty() {
            return head == null;
        }
    }
}
