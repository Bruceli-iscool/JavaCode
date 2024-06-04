package prep;


public class math {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        // use math libary
        // testing decapritated declarations
        Integer c = new Integer(Math.max(0, 10));
        System.out.println(c);
        Double a = new Double(Math.sqrt(200));
        System.out.println(a);
        c = Math.min(2, 5);
        System.out.println(c);
        c = Math.abs(-123);
        System.out.println(c);
    }
}
