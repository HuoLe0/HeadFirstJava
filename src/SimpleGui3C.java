import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui3C implements ActionListener {
    JFrame frame;
    public static void main(String[] args){
        SimpleGui3C gui = new SimpleGui3C();
        gui.go();
    }

    private void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(this);

        JButton button1 = new JButton("try");
        button1.addActionListener(this);

        JLabel label = new JLabel("label");
        JLabel label1 = new JLabel("i'm a label");

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.NORTH,button);
        frame.getContentPane().add(BorderLayout.SOUTH,button1);
        frame.getContentPane().add(BorderLayout.EAST,label);
        frame.getContentPane().add(BorderLayout.EAST,label1);

        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        frame.repaint();
    }
}

class MyDrawPanel1 extends JPanel{
    public void paintComponent(Graphics g){

    }
}
