public class TestFinally{
    public static void main(String[] args){
    System.out.println(method(2));
    System.out.println(method(0));
    }
    static int method(int a){
        try{
            return 6/a;
        }
        catch(Exception e){
            return 0;
            }
        finally{
            System.out.println("hhe");
            }
      }
}
