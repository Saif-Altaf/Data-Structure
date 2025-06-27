package MultiDimensionalArray;

public class Main {
    public static void main(String[] args) {
        int [][] arr=new int[3][3];
        var val=1;
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[0].length ; col++) {
                arr[row][col]=val++;
            }
        }

//        for (int row = 0; row < arr.length ; row++) {
//            for (int col = 0; col <arr[0].length ; col++) {
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[0].length ; col++) {
                if(row==col) {
                    System.out.print(arr[row][col] + " ");
                }
            }
            System.out.println();
        }
    }
}
