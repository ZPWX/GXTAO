public class Interface2{
    public static void main(String[] args){
        Light light=new Light();
  
        RedBulb bulb1=new RedBulb();
        
        light.setBulb(bulb1);
        light.powerOn();
        
        YellowBulb bulb12=new YellowBulb();
        light.setBulb(bulb12);
        light.powerOn();

    }
}
class Light{
    private Bulb bulb;
    public void setBulb(Bulb bulb){
        this.bulb=bulb;
    }
    public void powerOn(){
        bulb.shine();
    }
}
interface Bulb{
    void shine();
}
class RedBulb implements Bulb{
    public void shine(){
        System.out.println("RedLight!!");
    }
}
class YellowBulb implements Bulb{
            public void shine(){
                System.out.println("YellowLight!!!");
            }
}
