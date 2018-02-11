public class TestSynchronized{
    public static void main(String[] args){
        Stack s=new Stack();
        /*s.push('C');
        s.print();
        s.pop();
        s.print();*/

        Thread t1=new PushThread(s);
        Thread t2=new PopThread(s);
        t1.start();
        t2.start();
    }
}
class Stack{
    private char[] data={'A','B',' ',' ',' '};
    private int index=2;
    public void push(char c){
        System.out.println(c+"PUSHED!");
        data[index]=c;
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e){}
        index++;
    }
    public void pop(){
        index--;
        System.out.println(data[index]+"poped!");
        data[index]='';

    }
    public void print(){
        for(char c:data){
             System.out.print(c+" ");
        }
        System.out.println();
    }
}
class PushThread extends Thread{
    Stack s;
    public PushThread(Stack s){
        this.s;
    }
    public void run(){
        s.push('C');
    }
}
class PopThread extends Thread{
    Stack s;
    public PopThread(Stack s){
        this.s=s;
    }
    public void run(){
        s.pop();
    }
}
