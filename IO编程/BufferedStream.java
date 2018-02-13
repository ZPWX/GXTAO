import java.io.*;
public class BufferedStream{
    public static void main(String[] args)throws Exception{
        FileOutputStream fos=new FileOUtputStream("1.txt");//
        BufferedOutputStream out=new BufferedStream(fos);
        out.write('A');
        //out.close();//关流
        out.flush();//清空缓冲区

//***********PrintStream*************//
        FileOutputStream fos=new FileOutputStream("1.dat");
        //BufferedOutputStream bo=new BufferedStream(fos);
        //DataOUtputStream out=new DataOutputStream(bo);

        PrintStream out=new PrintStream(fos);
        
    }
}
