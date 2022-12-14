
import java.awt.*;
import javax.swing.*;
import  java.io.FileWriter;
import java.io.IOException;

public class toExcel {
    public static void main() throws IOException {
        FileWriter file = new FileWriter("test.txt");
        JFrame demo = new JFrame();
        demo.setSize(400, 300);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox checkbox = new JCheckBox("JCheckBox");
        JRadioButton radiobutton = new JRadioButton("JRadiobutton");
        JButton button = new JButton("JButton");
        JLabel label = new JLabel("JLabel");
        JTextArea textarea = new JTextArea("JTextArea");
        textarea.append("hello");

        System.out.println(textarea);
        demo.getContentPane().add(BorderLayout.EAST, checkbox);
        demo.getContentPane().add(BorderLayout.WEST, radiobutton);
        demo.getContentPane().add(BorderLayout.SOUTH, button);
        demo.getContentPane().add(BorderLayout.NORTH , label);
        demo.getContentPane().add(BorderLayout.CENTER, textarea);

        demo.setVisible(true);
        file.write(String.valueOf(textarea));
        file.close();
    }
}
