package algos;

// brute force search
public class searchTest {
    public static void main(String[] args) {
        int[] n = {2, 4, 5};
        Search s = new Search(n, 4);
        System.out.println(s.search());

    }
} 

class Search {
    int[] nums;
    int target;
    public Search(int[] arr, int tar) {
        nums = arr;
        target = tar;
    } public boolean search() {
        for (int y:nums) {
            if (y == target) {
                return true;
            }
        }
        return false;
    }
}
