import java.io.*;
public class TestOutputStream{
    public static void main(String[] args)throws Exception{
    OutputStream os=new FileOutputStream("1.txt",true);//true,是否追加
    os.write('A');
    }
}
