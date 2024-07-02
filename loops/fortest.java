package loops;

public class fortest {
    public static void main(String[] args) {
        // counter style for loops
        for (int i = 0;i <10;i++) {
            System.out.println(i);
        }
        // enhanced for loop
        // an array
        int[] arr = {2, 3, 5, 7};
        // print every value in the array
        for (int i:arr) { 
            System.out.println(i);
        }        
    }
} 
