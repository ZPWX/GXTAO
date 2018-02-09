import java.io.*;
import java.net.*;
public class UDPClient{
    public static void main(String[] args)throws Exception{
        DatagramSocket ds=new DatagramSocket();//客户端不需要绑定端口
        //给服务器发信
        String str="I'm here！";
        byte[] bs1=str.getBytes();
        DatagramPacket sendLetter=new DatagramPacket(
                bs1,0,bs1.length,InetAddress.getLocalHost(),9000);//读信
        ds.send(sendLetter);//发信

        //从服务器收30封信
        DatagramPacket receiveLetter=new DatagramPacket(new byte[100],0,100);
        //ds.receive(receiveLetter);
        for(int i=1;i<=30;i++){
            //DatagramPacket receiveLetter=new DatagramPacket(new byte[100],0,100);
            ds.receive(receiveLetter);//延时

            //显示信的内容
            byte[] bs=receiveLetter.getData();
            int offset=receiveLetter.getOffset();
            int length=receiveLetter.getLength();

            String s=new String(bs,offset,length);
            System.out.println(s);
        }
        ds.close();
}
}
