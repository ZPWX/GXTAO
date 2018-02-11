public class TestStaticImport{
    public static void main(String[] args){
        /*java.util.List i=new java.util.ArrayList();
        String[] s1={};
        method(s1);
        String[] s2={"zhang3"};
        method(s2);
        String[] s3={"li4","wang5"}
        method(s3);*/
        method();
        method("zhang3");
        method("li4","wang5");
        method("china","japan","Korea");
    }
    static void method(String...str){
        System.out.println(str.length);
    }
}
