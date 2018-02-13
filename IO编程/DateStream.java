import java.io.*;
public class DateStream{
    public static void main(String[] args){
        //写
        long l=123456789L;
        OutputStream os=new FileOutputStream("1.dat");
        DataOutputStream out=new DataOutputStream(os);
        out.writeLong(l);
        out.close();

        //读
        InputStream is=new FileInputStream("1.dat");
        DataInputStream in=new DataInputStream(is);
        long l2=in.readLong();
        in.close();
        System.out.pritnln(l2);
    }
}
