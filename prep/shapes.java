package prep;

public class shapes {
    public static void main(String[] args) {
        Square red = new Square(100, 23);
        System.out.println(red.area());
    }
}
class Square {
    int widths, lengths;
    public Square(int length, int width) {
        widths = width;
        lengths = length;
    } public int area() {
        return lengths * widths;
    }
}