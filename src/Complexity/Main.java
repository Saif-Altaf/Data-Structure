//package Complexity;
//
//public class Main {
//    public static void main(String[] args) {
//        //Big O notation is used to describe the performance of an algorithm as the amount of data increases.
//        // we ignore smaller operations
//    }
//
//    public void func() {
//        System.out.println(1 + 2); // O(1)
//    }
//
//    public void func2() {
//        System.out.println(1 + 2); // O(1)
//        for (int i = 0; i < n; i++) { // O(n)
//            System.out.println(number);
//        }
//    }// O(1+n) = O(n)
//
//    public void func3() {
//        for (int i = 0; i < n; i++) { // O(n)
//            System.out.println(number);
//        }
//        for (int i = 0; i < m; i++) { // O(n)
//            System.out.println(string);
//        }
//    } //O(n+m) = O(n)
//
//    public void func4() {
//        for (int i = 0; i < n; i++) { // O(n)
//            for (int i = 0; i < n; i++) { // O(n)
//                System.out.println(string);
//            }
//        }
//        for (int i = 0; i < m; i++) {
//            System.out.println("something");
//        }
//    }// O(n*n + m)= O(n^2 + m) = O(n^2)
//
//
//}
