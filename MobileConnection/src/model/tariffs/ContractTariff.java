package model.tariffs;


public class ContractTariff extends MobileTariff {
    private int contractDurationInMonths;

    public ContractTariff(String name, int contractDurationInMonths, int GBOfInternet,
                          int textMessages, int minutesInCountry, double price){
        super(name, GBOfInternet,textMessages, minutesInCountry, price);
        this.contractDurationInMonths=contractDurationInMonths;
        this.GBOfInternet=GBOfInternet;
        this.textMessages=textMessages;
        this.minutesInCountry=minutesInCountry;
    }

    public String toString(String language){
        if(language.equals("uk")) {
            return name + " на " + contractDurationInMonths + " місяців включає " + GBOfInternet + " Гб інтернету, " +
                    textMessages + " текстових повідомлень, " + minutesInCountry + " хвилин за " + price + " фунтів ";
        } else {
            return name + " for " + contractDurationInMonths + " months includes " + GBOfInternet + " GB of data, " +
                    textMessages + " text messages, " + minutesInCountry + " minutes for " + price + " pounds ";
        }
    }

}
