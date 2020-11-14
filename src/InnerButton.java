import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerButton {

    JFrame frame;
    JButton b;

    public static void main(String [] args){
        InnerButton gui = new InnerButton();
        gui.go();
    }

    private void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b = new JButton("A");
        b.addActionListener(new BListener());

        frame.setSize(300,300);
        frame.setVisible(true);
    }

    class BListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            if (b.getText().equals("A")){
                b.setText("B");
            }else {
                b.setText("A");
            }
        }
    }
}
