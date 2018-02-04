import java.io.*;
public class TestInputStream{
    public static void main(String[] args){
        InputStream is=new FileInputStream("1.txt");
//************* 第一种读方法**********//
        /*
        while(true)
        {
            int i=is.read();
            //if(is.read()==-1)break; //读两次打印一次
            if(i==-1)break;//读一次打印一次
            else System.outprint((char)i);
        }
        System.out.println();
        */
//***************第二种读方法**********//
        /*
        byte[] bs=new byte[6];
        while(true){
            int i=is.read(bs);
            if(i==-1)break;
            for(byte b:bs){
                System.out.println((char)b+);
            }
            System.out.println(i);
        }
        */
//*************第三种读方法**********//
        /*byte[] bs=new byte[8];
        while(true){
            int i=is.read(bs,2,4);
            if(i==-1)break;
            for(byte b:bs){
                System.out.print((char)b+"");
            }
            System.out.println(i);
        }
        */
        is.close();

    }
}
