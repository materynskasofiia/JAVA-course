public class Lamp implements ElectricityConsumer{

    public void lightOn(){
        System.out.println("Lamp is turned on");
    }
    @Override
    public void electricityOn() {
        lightOn();
    }
}
