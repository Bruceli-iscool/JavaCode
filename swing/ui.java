package swing;
import javax.swing.*;
import java.awt.*;

  
public class ui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ui");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        JLabel label = new JLabel("Hi john\n");
        frame.add(label);
        JTextArea t = new JTextArea(); 
        frame.add(t);
        frame.setVisible(true);
}
}
