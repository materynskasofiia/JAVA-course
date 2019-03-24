package model.services;

import model.tariffs.*;
import model.user.User;
import view.View;

import java.util.*;

public class ServiceCenter {

    //int minMinutes, int maxMinutes, int minTexts, int maxTexts, int minGBOfInternet, int maxGBOfInternet
    public static final int[] filter1={500, 1500, 150, 400, 10, 12};
    public static final int[] filter2={1000, 2000, 200, 400, 6, 9};
    private List<MobileTariff> listOfTariffs=new ArrayList();

    public List<MobileTariff> getList() {
        return listOfTariffs;
    }

    public void createListOfAllAvailableTariffs(){
        Arrays.stream(Tariffs.values()).forEach((t)->listOfTariffs.add(new OperationsWithTariffs().createTariff(t)));
    }

    public ServiceCenter(){
        OperationsWithTariffs o=new OperationsWithTariffs();
        createListOfAllAvailableTariffs();

    }

    public int userDataBase(){
        int n = User.getNumberOfUsersToAdd();
        for(int i=0; i<n; i++){
            new User(Tariffs.values()[(int)(Math.random()*Tariffs.values().length)]);
        }
        return n;
    }

    public void showAllTariffs(){
        View v=new View();
        listOfTariffs.forEach((i) -> v.printMessage(i.toString(Locale.getDefault().getLanguage())));
    }

    public void checkNumberOfUsers(){
        new View().printMessage("\nNumber of users: "+
                (MobileTariff.numberOfUsers-listOfTariffs.size())+'\n');
    }

    public void showSortedTariffsByPrice(){
        listOfTariffs.stream().sorted(Comparator.comparingDouble(MobileTariff::getPrice)).
                forEach((l)->new View().printMessage(l.toString(Locale.getDefault().getLanguage())));
    }

    public void filterByMinutesTextsAndInternet(int minMinutes, int maxMinutes,
                                                int minTexts, int maxTexts,
                                                int minGBOfInternet, int maxGBOfInternet){
        View view=new View();
        view.printRange(minMinutes, maxMinutes, minTexts, maxTexts, minGBOfInternet, maxGBOfInternet);
        listOfTariffs.stream().filter((t)->(t.getMinutesInCountry()>=minMinutes && t.getMinutesInCountry()<=maxMinutes)
                && (t.getTextMessages()>=minTexts && t.getTextMessages()<=maxTexts)
                &&(t.getGBOfInternet()>=minGBOfInternet && t.getGBOfInternet()<=maxGBOfInternet))
        .forEach((p)->view.printMessage(p.toString(Locale.getDefault().getLanguage())));
    }

    public void filterByMinutesTextsAndInternetWithStandardFilters(int[] filter){
        filterByMinutesTextsAndInternet(filter[0], filter[1], filter[2], filter[3], filter[4], filter[5]);
    }
}
