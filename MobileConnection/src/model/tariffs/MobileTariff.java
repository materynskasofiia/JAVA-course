package model.tariffs;

public abstract class MobileTariff {
    static public int numberOfUsers;
    String name;
    int minutesInCountry;
    int textMessages;
    int GBOfInternet;
    double price;

    MobileTariff(String name, int GBOfInternet, int textMessages, int minutesInCountry, double price) {
        this.name = name;
        this.GBOfInternet = GBOfInternet;
        this.textMessages = textMessages;
        this.minutesInCountry = minutesInCountry;
        this.price = price;
        numberOfUsers += 1;
    }

    public double getPrice() {
        return price;
    }

    public int getMinutesInCountry(){
        return minutesInCountry;
    }

    public int getTextMessages(){
        return textMessages;
    }

    public int getGBOfInternet(){
        return GBOfInternet;
    }

    public String toString(String language) {
        return null;
    }
}
