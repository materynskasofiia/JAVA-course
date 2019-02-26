//package registrationform;

import java.util.regex.Pattern;

public class RegularExpressions {
    String regExName="[A-Z][a-z]+";
    String regExUAName="[А-Щ(ЮЯІЇҐ)][а-щ(ь-яіїґ]+";
    String regExLogin="\\w{6,}";
    boolean checkName(String regEx, String input){
        return Pattern.matches(regEx,input);
    }

}
