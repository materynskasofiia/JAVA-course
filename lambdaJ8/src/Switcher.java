import java.util.ArrayList;
import java.util.List;

public class Switcher {

    private List<ElectricityConsumer> consumerList = new ArrayList();

    public void addConsumer(ElectricityConsumer electricityConsumer){
        consumerList.add(electricityConsumer);
    }

    public void removeConsumer(ElectricityConsumer electricityConsumer){
        consumerList.remove(electricityConsumer);
    }

    public void switchOn(){
        System.out.println("Switcher is turned on");
        for(ElectricityConsumer c: consumerList){
            c.electricityOn();
        }
    }
}
