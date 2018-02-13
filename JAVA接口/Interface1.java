public class Interface1{
    public static void main(String[] args){
        lamp l=new lamp();
        YellowLight yl=new YellowLight();
        l.setLight(yl);
        l.powerOn();

        RedLight rl=new RedLight();
        l.setLight(rl);
        l.powerOn();
    }
}
interface Light{
    public void on();
}
class lamp{
    private Light light=null;
    public void setLight(Light light){
        this.light=light;
    }
    public void powerOn(){
        light.on();
    }
}
class YellowLight implements Light{

    public void on(){
        System.out.println("YellowLight!!");
    }
}
class RedLight implements Light{
    public void on(){
        System.out.println("RedLight!!!");
    }
}
