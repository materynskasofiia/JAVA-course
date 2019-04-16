//package registrationform;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Model {
    String regExName="[A-Z][a-z]+";

    boolean checkField(String regEx, String input){
        return Pattern.matches(regEx,input);
    }

}
