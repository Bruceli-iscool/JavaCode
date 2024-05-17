package prep;

public class forLoops {
    public static void main(String[] args) {
        String[] foods = {"BigMac", "Salad", "HotDog", "Soda"};
        for (int i = 0; i < foods.length;i++) {
            System.out.println(foods[i]);
        }
        for (int y = 0; y < 101;y++) {
            System.out.println(y);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println();
        for (int z = 0; z <= 10; z++) {
            for (int j = 0; j <= 5;j++) {
                System.out.print(5);
            }
            System.out.println();
        }
    }
}
