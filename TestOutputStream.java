//利用输入流向文件中写数据
//data:2.4.2018
//author:GXTAO
import java.io.*;
public class TestOutputStream{
    public static void main(String[] args)throws Exception{
        String str="Hello World!";
        OutputStream os=new FileOutputStream("1.txt",true);//true,是否追加
        byte[] bs=str.getBytes();//把字符串转成数组
        os.write('A');
        os.close();//关闭数据流，释放资源
    }
}

