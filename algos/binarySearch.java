package algos;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        // binary search 
        // time: O(log n)
        // create an object of type Array    
        int[] arr = {1, 2, 3, 4, 5, 2};
        Array k = new Array(arr);
        System.out.println(k.binarySearch(6)); 
        int[] arr2 = {1, 2, 4, 5, 6, 7 , 8, 10, 3, 4, 6};
        Array l = new Array(arr2);
        System.out.println(l.binarySearch(4)); 
    }
}

// create an Array class
class Array {
    int[] arr;
    public Array(int[] values) {
        arr = values;
    } public int binarySearch(int target) {
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            double mid = (double)(low + high) / 2;
            int guess = arr[(int) mid];
            if (guess == target) {
                return (int) mid;
            } else if (guess > target) {
                high = (int) mid - 1;
            } else {
                low = (int) mid + 1;
            }
        }
        return -1;
    }
}
