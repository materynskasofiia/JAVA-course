package model.user;

import model.services.OperationsWithTariffs;
import model.tariffs.Tariffs;

public class User {
    public static final int MAX_NUMBER_OF_USERS=200;
    private Tariffs tariff;

    public User(Tariffs tariff){
        OperationsWithTariffs o=new OperationsWithTariffs();
        o.createTariff(tariff);
        this.tariff=tariff;
    }

    public User(){

    }

    public static int getNumberOfUsersToAdd(){
        return (int)(Math.random()*(MAX_NUMBER_OF_USERS+1));
    }

    public void changeTariff(Tariffs tariff){
        this.tariff=tariff;
    }

    public Tariffs getTariff() {
        return tariff;
    }
}
