package controller;

import model.services.ServiceCenter;
import view.View;


import java.util.Locale;
import java.util.Scanner;

public class Controller {

    public void start(){
        ServiceCenter sc=new ServiceCenter();
        interactionWithUser();
        sc.userDataBase();
        sc.showAllTariffs();
        sc.checkNumberOfUsers();
        sc.showSortedTariffsByPrice();
        sc.filterByMinutesTextsAndInternetWithStandardFilters(ServiceCenter.filter1);
        sc.filterByMinutesTextsAndInternetWithStandardFilters(ServiceCenter.filter2);
    }

    private void interactionWithUser(){
        Scanner sc = new Scanner(System.in);
        View view=new View();
        while (true) {
            view.printMessage(View.CHOOSE_LANGUAGE);
            String str = sc.nextLine();

            switch (str){
                case "1":
                    Locale.setDefault(new Locale("en","US"));
                    return;

                case "2":
                    Locale.setDefault(new Locale("uk","UA"));
                    return;

                default:
                    view.printMessage(View.WRONG_INPUT);
                    break;
            }
        }
    }
}
