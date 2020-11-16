package Chat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleChatClientA {

    JTextField outgoing;
    PrintWriter writer;
    Socket sock;

    public void go(){
        // 注册按钮的监听者
        // 调用setUpNetworking()
        JFrame frame = new JFrame("Ludicrously Simple Chat Client");
        JPanel mainPanel = new JPanel();
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("send");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        setUpNetworking();
        frame.setSize(400,500);
        frame.setVisible(true);
    }//关闭go

    private void setUpNetworking(){
        // 建立Socket、PrintWriter
        //赋值PrintWriter给实例变量
        try {
            sock = new Socket("127.0.0.1",5000);
            writer = new PrintWriter(sock.getOutputStream());//建立socket和PrintWriter
            System.out.println("networking established");
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }//关闭setUpNetWorking

    public class SendButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            // 取得文字字段内容
            // 传送到服务器上
            try {
                writer.println(outgoing.getText());
                writer.flush();
            }catch (Exception ex){
                ex.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();
        }
    } //关闭SendButton Listener内部类
    public static void main(String[] args){
        new SimpleChatClientA().go();
    }
} // 关闭外部类
