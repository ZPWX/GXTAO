//利用输入流向文件中写数据
//data:2.4.2018
//author:GXTAO
import java.io.*;
public class TestOutputStream{
    public static void main(String[] args){
        String str="Hello World!";
        OutputStream os=null;
        try{
        os=new FileOutputStream("1.txt",true);//true,是否追加
        byte[] bs=str.getBytes();//把字符串转成数组
        os.write(bs);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                if(os!=null)os.close();
            }catch(IOException e){
        //os.close();//关闭数据流，释放资源
            }
            }
    }

}

