package Lamp;

public class Lamp {
    boolean isOn;
    void turnon(){
        isOn =true;
        System.out.println("Light on? " + isOn);
    }

    public static void main(String[] args) {
        Lamp led = new Lamp();
        led.turnon();
    }
}
