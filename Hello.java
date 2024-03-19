// Hello world

// add ui components
import javax.swing.*;

public class Hello {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.setSize(300, 150);
        JLabel label = new JLabel("Hello!", JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    } 
}