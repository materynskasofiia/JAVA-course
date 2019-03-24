package model.tariffs;

public class InternationalTariff extends MobileTariff {
    int minutesAbroad;
    int textsAbroad;

    public InternationalTariff(String name, int minutesAbroad, int textsAbroad, int GBOfInternet, int textMessages,
                               int minutesInCountry, double price) {
        super(name, GBOfInternet, textMessages, minutesInCountry, price);
        this.minutesAbroad = minutesAbroad;
        this.textsAbroad = textsAbroad;
    }

    public String toString(String language) {
        if (language.equals("uk")) {
            return name + "  включає " + minutesAbroad + " хвилин за кордон " + textsAbroad + " текстових повідомлень за кордон " +
                        GBOfInternet + " Гб інтернету, " + textMessages + " текстових повідомлень, " + minutesInCountry +
                        " хвилин за " + price + " фунтів ";
        } else {
            return name + " includes " + minutesAbroad + " minutes abroad " + textsAbroad + " text messages abroad " +
                        GBOfInternet + " GB of data, " + textMessages + " text messages, " + minutesInCountry +
                        " minutes for " + price + " pounds ";
        }
    }
}
