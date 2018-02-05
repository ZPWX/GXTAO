import java.lang.*;
public class TestString{
    public static void main(String[] args)throws Exception{
        String str="郭小涛";
        byte[] bs1=str.getBytes("GBK");
        String str2=new String(bs1,"GBK");
        System.out.println(str);
        System.out.println(str2);
    }
}
