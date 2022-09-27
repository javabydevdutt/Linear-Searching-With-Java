package com.devdutt.searching;

/*Best-case complexity is O(1):-  where the element is found at   the first index.
   Worst-case complexity is O(n):- where the element is found at the last index or element is not
   present in the array.
* */
public class LinearSearch {
    public static int searchElement(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }//if
        }//for
        return -1;
    }//method

    public static void main(String[] args) {
        int[] a1 = {10, 20, 30, 50, 70, 90};
        int key = 50;
        int result = searchElement(a1, key);
        if (result < 0) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println(key + " is found at index: " + result);
        }
    }
}
