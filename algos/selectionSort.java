package algos;

public class selectionSort {
    public static void main(String args[]) {
        // use selection sort
        // time = O(n^2)
        int[] n = {2, 3, 1};
        System.out.println(sort(n));
    } public static int[] sort(int[] i) {
        int[] newArr = new int[i.length];
        int[] copiedArr = i;
        for (int j = 0;j<copiedArr.length;j++) {
            int smallest = smallest(copiedArr);
            newArr[j] = smallest;
        };
        return newArr;
    } private static int smallest(int[] i) {
        // find smallest
        int smallest = i[0];
        int smallestIndex = 0;
        for (int y = 0;y<i.length;y++) {
            if (i[y] < smallest) {
                smallest = i[y];
                smallestIndex = y;
            }
        }
        return smallestIndex;
    }
}