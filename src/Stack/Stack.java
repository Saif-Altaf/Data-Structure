package Stack;

public class Stack {
    private int[] items = new int[5];
    private int count;

    public void push(int item) {
        if (count == items.length) {
            throw new StackOverflowError();
        }

        items[count++] = item;
    }

    public int pop() {
        if (count == 0) {
            throw new IllegalStateException();
        }

        return items[--count];
    }

    public int peek() {
        if (count == 0) {
            throw new IllegalStateException();
        }

        return items[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }


    // [10,20,30,0,0]
    //      ^
    //count=0
    //push(10)
    //count++
    //push(20)
    //count++
    //push(30)


    //push
    //pop
    //peek
    //isEmpty
    //print
}
