public class Main {

    public static void fire(){
        System.out.println("Help!");
    }
    public static void main(String [] arg){
        Switcher sw=new Switcher();
        Lamp lamp=new Lamp();
        Radio radio=new Radio();
        sw.addConsumer(lamp);
        sw.addConsumer(radio);

        sw.addConsumer(
                new ElectricityConsumer() {
                    @Override
                    public void electricityOn() {
                        System.out.println("Too many users, it can start the fire");
                    }
                }
        );
        sw.addConsumer(() -> System.out.println("Too many users, it can start the fire"));
        sw.addConsumer(Main::fire);
        sw.switchOn();
    }
}
