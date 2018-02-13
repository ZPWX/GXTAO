public class Interface3{
    public static void main(String[] args){
        Animal a=new Snoopy();
        Dog d=(Dog)a;
        Person p=(Person)a;
    }
}
class Animal{}
class Dog extends Animal{
    //public abstract void m();
}
interface Person{
    //int m();
}
class Snoopy extends Dog implements Person{
    //public void m(){}
    //public int m(){return 0;}
}
