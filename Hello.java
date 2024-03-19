// Hello world

// add ui components
import javax.swing.*;
import java.awt.*;

public class Hello {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.setSize(300, 150);
        // JLabel label = new JLabel("Hello!", JLabel.CENTER);
        // frame.add(label);
        frame.add(new HelloComponent());
        frame.setVisible(true);
    } 
}
class HelloComponent extends JComponent {
    public void paintComponent(Graphics g) {
     g.drawString("Hello!", 125, 95);
}
}