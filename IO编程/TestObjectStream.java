import java.io.*;
public class TestObjectStream{
public static void main(String[] args)throws Exception{
    Student s1=new Student("zhang3",18,100);
    Student s2=new Student("li4",20,80);

    FileOutputStream fos=new FileOutputStream("student.dat");
    ObjectOutputStream out=new ObjectOutputStream(fos);
    out.writeObject(s1);
    out.writeObject(s2);
    out.close();
    
    FileInputStream fis=new FileInputStream("Student.dat");
    ObjectInputStream in=new ObjectInputStream(fis);
    Student o1=(Student)in.readObject();
    Student o2=(Student)in.readObject();
    in.close();

    System.out.println(o1);
    System.out.println(o2);
    }
}
class Student implements Serializable{
    private String name;
    private int age;
    private transient double score;//transient 修饰属性，临时属性
    public Student(String name,int age,double score){
        this.name=name;
        this.age=age;
        this.score=score;
    }
    public String toString(){
        return "Student name="+name+"age="+age+"=score="+score;
    }
}
