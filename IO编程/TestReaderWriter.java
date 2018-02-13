import java.io.*;
public class TestReaderWriter{
    public static void main(String[] args)throws Exception{
    OutputStream fos=new FileOutputStream("poem.txt");
    Writer ow=new OutputStreamWriter(fos);//创建节点流
    PrintWriter out=new PrintWriter(ow);//封装过滤流
    out.println("我是流氓我怕谁");//写数据
    out.close();//关闭流


    InputStream fis=new FileOutputStream("poem.txt");
    Reader fr=new InputStreamReader(fis);
    BufferedReader in=new BufferedReader(fr);
    while(true){
        String str=in.readLine();//readLine();阻塞方法
        if(str==null)break;
            System.out.pritnln(str);
    }
    in.close();

    }
}
