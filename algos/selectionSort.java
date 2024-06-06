package algos;

public class selectionSort {
    public static void main(String args[]) {
        // use selection sort
        // time = O(n^2)
    } public int[] sort(int[] i) {
        return int[];
    } private int smallest(int[] i) {
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