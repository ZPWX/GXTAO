import java.io.*;
public class TestObjectStream2{
    public static void main(String[] args)throws Exception{
        Student s1=new Student("zhang3",18,100);;
        Student s2=new Student("li4",20,80);

        FileOutputStream fos=new FileOutputStream("student.dat");
        ObjectOutputStream out=new ObjectOutputStream(fos);
        out.writeObject(s);


        s.setAge(19);
        Student s2=(Student)s.clone();
        out.writeObject(s2);
        out.close();


        FileInputStream fis=new FileInputStream("student.dat");
        ObjectInputStream in=new ObjectInputStream(fis);
        Student o1=(Student)in.readObject();
        Student o2=(Student)in.readObject();
        in.close();

        System.out.println(o1);
        System.out.println(o2);
    }
}
class System implements Serializable,Cloneable{
    private String name;
    private int age;
    private transient double score;
    public Student(String name,int age,double score){
        this.name=name;
        this.age=age;
        this.score=score;
    }
    public String toString(){
        return "Student name="+name+"age="+age+"score="+score;
    }
    public void setName(String name){
        this.name=name;

    }
    public void setAge(int age){
        this.age=age;
    }
    public void setScore(double score){
        this.score=score;
    }
    public Object clone(){
        try{
        return super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
        }
}
