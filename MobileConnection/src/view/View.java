package view;

import java.util.Locale;

public class View {
    public static final String CHOOSE_LANGUAGE="Enter \'1\' to choose english, натисніть \'2\' щоб вибати українську";
    public static final String WRONG_INPUT="Wrong input! Try again";

    public void printMessage(String string){
        System.out.println(string);
    }

    public void printRange(int minMinutes, int maxMinutes, int minTexts, int maxTexts, int minGBOfInternet, int maxGBOfInternet){
        if(Locale.getDefault().getLanguage().equals("uk")){
            System.out.println("\nФільтр по діапазонах: " + minMinutes + "-" + maxMinutes + " хвилин, " +
                    minTexts + "-" + maxTexts + " повідомлень, " + minGBOfInternet + "-" + maxGBOfInternet + " Гб інтренету\n");
        } else {
            System.out.println("\nFilter in range: " + minMinutes + "-" + maxMinutes + " minutes, " +
                    minTexts + "-" + maxTexts + " texts, " + minGBOfInternet + "-" + maxGBOfInternet + " Gb of internet\n");
        }
    }
}
