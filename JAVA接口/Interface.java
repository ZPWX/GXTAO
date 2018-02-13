public class Interface{
    public static void main(String[] args){
        MyClass mc=new MyClass();
        IA a=mc;
        IB b=mc;
        IC c=mc;
        ID d=mc;
        ClassE e=mc;
        a.m1();
        a.m2();

        b.m3();

        c.m4();

        d.m3();
        d.m4();
        d.m5();

        e.m6();
    }
}


abstract class ClassA{
    public static final int A=10;
    public static final double B=2.5;
    public abstract void m1();
    public abstract void m2();
    public ClassA(){}
}
interface IA{
    int A=10;
    double B=2.5;
    void m1();
    void m2();
}
interface IB{
    void m3();
}
interface IC{
    void m4();
}
interface ID extends IB,IC{
    void m5();
}
abstract class ClassE{
    public abstract void m6();
}
class MyClass extends ClassE implements IA,ID{
    public void m1(){}
    public void m2(){}
    public void m3(){}
    public void m4(){}
    public void m5(){}
    public void m6(){}
}
