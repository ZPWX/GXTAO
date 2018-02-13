import java.lang.*;
import java.sql.*;
import java.io.*;
public class TestException{
    public static void main(String[] args) throws Throwable{
        int a=Integer.parseInt(args[0]);
        System.out.println("main 1");
        ma(a);
        System.out.println("main 2");
    }
        static void ma(int a){
            try{
            System.out.println("ma 1");
            mb(a);
            System.out.println("ma 2");
            }
            catch(Exception e){
                //System.out.println("Catch Exception"+e.getMessage);
            e.printStackTrace();
            }

            finally{
                 System.out.println("run Finally");
            }
            /*catch(IOException e){
              System.out.println("Catch IOEXception");
            }
            catch(SQLException e){
                System.out.println("Catch SQLException");
            }*/
            System.out.println("ma 3");
        }
       /*catch(SQLException){
            System.out.println("Catch SQLException");
        }*/
        static void mb(int a) throws IOException,SQLException{
            System.out.println("mb 1");
            mc(a);
            System.out.println("mb 2");
        }
        static void mc(int a) throws FileNotFoundException,EOFException,SQLException,MyException{
            try{
                System.out.println("mc 1");
            if(a==0) throw new NullPointerException();
            if(a==1) throw new FileNotFoundException();
            if(a==2) throw new EOFException();
            if(a==3) throw new SQLException();
            if(a==4) throw new MyException("myException");
            System.out.println("mc 2");
            }
            finally{
            System.out.println("mc 3");
            }
        }
}
class MyException extends Exception{
    public MyException(){}
    public MyException(String message){
        super(message);//把message参数传给父类Exception
         
    }
}
