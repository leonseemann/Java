package Zeit;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class myFrame {
    public void myFrame() {
        JFrame Frame = new JFrame();
        JTextArea Stunde = new JTextArea();
        JTextArea Minute = new JTextArea();

        Frame.setSize(500, 500);

        Stunde.setBounds(0, 0, 100, 50);
        Minute.setBounds(55, 0, 100, 50);
        Stunde.setVisible(true);
        Minute.setVisible(true);

        Minute.setBackground(Color.red);
        Stunde.setBackground(Color.blue);


        Frame.add(Stunde);
        Frame.add(Minute);

        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.getContentPane().setBackground(new Color(0xC9A58D));
        Frame.setResizable(false);
        Frame.setVisible(true);
    }
}
