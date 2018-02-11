public class TestThread{
    public static void main(String[] args){
    Thread t1=new ThreadA();//創建線程對象
    //t.start();//創建線程
    //t.stop();//停止線程
    Runnable target=new Target(t1);
    Thread t2=new Thread(target);//實現Runnable方法

    t1.start();
    t2.start();
    }
}
class ThreadA extends Thread{
    public void run(){//覆蓋
        for(int i=1;i<=100;i++){
            System.out.println("$$$"+i);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Target implements Runnable{
    private Thread t;
    public Target(Thread t){
        this.t=t;
    }
    public void run(){
    
        for(int i=1;i<=100;i++){
        System.out.println("###"+i);
        try{
            if(i==50)t.join();
            Thread.sleep(80);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        }
    }
}

