package DynamicArray;

public class Array {
    private int[] arr;
    private int count;

    public Array(int length) {
        arr = new int[length];
    }

    public void insert(int value) {
        //if array is full, resize it
        if (arr.length == count) {
            //create new array of twice the size
            int[] newArray = new int[2 * count];

            //copy all the elements to the new array
            for (int i = 0; i < count; i++) {
                newArray[i] = arr[i];
            }

            //set the 'arr' to the new array
            arr = newArray;
        }
        // add the new value at the end
        arr[count++] = value;
    }

    public void removeAt(int index) {
        //validate the index
        if (index < 0 || index >= count) {
            throw new IllegalStateException("do not joke around");
        }

        //shift elements to the left to fill the gap
        for (int i = index; i < count; i++) {
            arr[i] = arr[i + 1];
        }
        count--;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }
}

