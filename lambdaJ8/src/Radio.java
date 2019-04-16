public class Radio  implements ElectricityConsumer{
    public void radioOn(){
        System.out.println("Radio is turned on");
    }


    @Override
    public void electricityOn() {
        radioOn();
    }
}
