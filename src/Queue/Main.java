package Queue;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q);
        reverse(q);
        System.out.println(q);

        QueueUsingStack q2=new QueueUsingStack();
        var first=q2.dequeue();

        System.out.println(first);

    }
    public static void reverse(Queue<Integer> q){
        //use only add,remove and isEmpty
        Stack<Integer> stack=new Stack<>();
        while (!q.isEmpty()){
            stack.push(q.remove());
        }
        while (!stack.isEmpty()){
            q.add(stack.pop());
        }
    }
}
    //in java queue is not a class it is an interface so it cannot be instantiated like class

// interfaces are contracts which declares
// the list of methods queue implementation should provide

