import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {

    String[] adviceList = {"Take smaller bites", "Go for the tight jeans. No they do NOT make you look fat.",
    "One word: inappropriate", "Just for today, be honest. Tell your boss what you *really* think",
            "You might want to rethink that haircut."};

    public void go(){
        try {
            //ServerSocket会监听客户端对这台机器在4242端口上的请求
            ServerSocket serverSocket = new ServerSocket(4242);
            //服务器进入无穷循环等待服务客户端的请求
            while (true){
                Socket sock = serverSocket.accept();//这个方法会停下来等待请求到达之后才会继续

                PrintWriter writer = new PrintWriter(sock.getOutputStream());//使用Socket连接来送出信息
                String advice = getAdvice();
                writer.println(advice);
                writer.close();//送出信息后关闭连接
                System.out.println(advice);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private String getAdvice(){
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args){
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}
