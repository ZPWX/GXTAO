import java.net.*;
import java.io.*;
public class TcpServer1{
    public static void main(String[] args)throws Exception{
        //让服务器进程绑定9000端口
        ServerSocket ss=new ServerSocket(9000);
        //ServerSocket
        Socket s=ss.accept();//监听 阻塞方法 等待客户端的连接请求

        //System.out.prinltn(s.getInetAddress());

        OutputStream os =s.getOutputStream();
        PrintWriter out=new PrintWriter(os);
        for(int i=1;i<30;i++){
                out.println("hello"+i);
                out.flush();
                Thread.sleep(500);
            }
        s.close();//关socket
    }
}
