import java.io.*;
import java.net.*;
public class TCPSever2{
    public static void main(String[] args){
        /*
         * 服务器同时向多个客户端提供服务
         * 利用多线程解决
         * 多个客户端即多个线程
         * 每来一个线程，主线程创建一个子线程
         */
        SeverSocket ss=new SeverSocket(9000);
        while(true){
            Socket s=ss.accept();
            System.out.println(s.getInetAddress());
            Thread t=new SeverThread(s);
            t.start();//主线程

            /*
             * OutputStream os=s.getOutputStream();
            PrintWriter out=new PrintWriter(os);
            for(int i=1;i<=30;i++){
                out.pritnln("hello"+i);
                out.flush();
                Thread.sleep(500);
            }
            s.close();
            */
        }
    }
}
class ServerThread extends Thread{
    Socket s;
    public ServerThread(Socket s){
        this.s;
    }
    public void run(){
        try{
        OutputStream os=s.getOutputStream();
        PrintWriter out=new PrintWriter(os);
        for(int i=1;i<30;i++){
            out.pritnln("hello"+i);
            out.flush();
            Thread.sleep(500);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
        s.close();
            }catch(IOException e){
                e.printStackTrace();
            }
    }
    }
}
