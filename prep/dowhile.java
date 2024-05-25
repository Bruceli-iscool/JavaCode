package prep;

public class dowhile {
 public static void main(String[] args) throws InterruptedException {
    int i = 0;
    do {
        System.out.println(i - 1 + " then " + i);
        i++;
        Thread.sleep(100);
    } while (i < 301);
 }   
}
