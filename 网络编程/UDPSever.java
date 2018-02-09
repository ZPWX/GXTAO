import java.io.*;
import java.net.*;
public class UDPSever{
    public static void main(String[] args)throws Exception{
        DatagramSocket ds=new DatagramSocket(9000);
        //从客户端收信
        DatagramPacket receiveLetter=new DatagramPacket(new byte[100],0,100);
        ds.receive(receiveLetter);//监听阻塞

        InetAddress address=receiveLetter.getAddress();
        int port=receiveLetter.getPort();

        //给客户端发送30封信
        for(int i=1;i<=30;i++){
            String str="hello"+i;
            byte[] bs=str.getBytes();
            DatagramPacket sendLetter=new DatagramPacket(bs,0,bs.length,address,port);
            ds.send(sendLetter);
            Thread.sleep(1000);
        }
        ds.close();
    }
}
