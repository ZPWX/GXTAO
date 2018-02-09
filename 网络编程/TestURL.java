import java.net.*;
public class TestURL{
    public static void main(String[] args)throws Exception{
        URL url=new URL("url");
        URLConnection uc=url.openConnection();
        InputStream is=new uc.getInputStream();

        BufferedReader in=new BufferedReader(
                new InputStreamReader(is))；
            while(true){
            String str=in.readLine();
            if(str==null)break;
            System.out.println(str);
                }
        in.close();
    }
}
