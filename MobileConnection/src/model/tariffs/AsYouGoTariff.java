package model.tariffs;

public class AsYouGoTariff extends MobileTariff {
    int durationInDays;

    public AsYouGoTariff(String name, int durationInDays, int GBOfInternet, int textMessages,
                         int minutesInCountry, double price){
        super(name, GBOfInternet, textMessages, minutesInCountry, price);
        this.durationInDays=durationInDays;
    }
    public String toString(String language){
        if(language.equals("uk")) {
            return name + " на " + durationInDays + " днів включає " + GBOfInternet + " Гб інтернету, " +
                    textMessages + " текстових повідомлень, " + minutesInCountry + " хвилин за " + price + " фунтів ";
        }else{
            return name + " for " + durationInDays +" days includes " + GBOfInternet + " GB of data, " +
                    textMessages + " text messages, " + minutesInCountry + " minutes for " + price + " pounds ";
        }
    }
}
