package model.tariffs;

public enum Tariffs {

    //name, minutes, texts, GDOfData, price, duration of contract in months
    CONTRACT_TARIFF_1("Rocket pack 1", 2000, 200, 10, 25., 12),
    CONTRACT_TARIFF_2("Rocket pack 2", 1500, 150, 8, 15., 18),
    CONTRACT_TARIFF_3("Rocket pack 3", 1000, 150, 7, 10., 24),

    //name, minutes, texts, GDOfData, price, duration in days of order
    PAY_AS_YOU_GO_1("Pay as you go light", 2000, 200, 10, 18., 30),
    PAY_AS_YOU_GO_2("Pay as you go medium", 1500, 200, 8, 15., 30),
    PAY_AS_YOU_GO_3("Pay as you go maximum", 1000, 150, 6, 12., 30),

    //name, minutes, texts, GDOfData, price, minutes abroad, texts abroad
    INTERNATIONAL_TARIFF_1("International 1", 1500, 200, 10, 18., 500, 200),
    INTERNATIONAL_TARIFF_2("International 2", 1500, 150, 9, 16., 400, 150),
    INTERNATIONAL_TARIFF_3("International 3", 1500, 200, 8, 14., 300, 100);

    private String name;
    private int minutes;
    private int texts;
    private int gbOfData;
    private double price;
    private int specialForParticular;
    private int specialForParticular2;

    Tariffs(String name, int minutes, int texts, int gbOfData, double price, int specialForParticular) {
        this.name=name;
        this.minutes=minutes;
        this.texts=texts;
        this.gbOfData=gbOfData;
        this.price=price;
        this.specialForParticular=specialForParticular;
    }

    Tariffs(String name, int minutes, int texts, int gbOfData, double price,
            int specialForParticular, int specialForParticular2) {
        this.name=name;
        this.minutes=minutes;
        this.texts=texts;
        this.gbOfData=gbOfData;
        this.price=price;
        this.specialForParticular=specialForParticular;
        this.specialForParticular2=specialForParticular2;
    }

    public String getName() {
        return name;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getTexts() {
        return texts;
    }

    public int getGbOfData() {
        return gbOfData;
    }

    public double getPrice() {
        return price;
    }

    public int getSpecialForParticular() {
        return specialForParticular;
    }

    public int getSpecialForParticular2() {
        return specialForParticular2;
    }
}
