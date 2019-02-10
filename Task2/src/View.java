/**
 *View
 *
 * @version 1   09.02.2019
 * @author Sofiia Materynska
 */
public class View {

    public static final String TRY_TO_GUESS="Try to guess a number that was chosen by the computer. ";

    public static final String CHOOSE="Enter an integer number from this range ";

    public static final String RANGE="The range now is ";

    public static final String WRONG_INPUT="You entered an inappropriate symbol. ";

    public static final String WRONG_RANGE="You entered a number that is out of the range. ";

    public static final String TRY_AGAIN="Please, try again.";

    public static final String CONGRATS="Congratulations! You guessed the number ";

    public static final String STATISTIC="The number of attempts before the right one ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessage(String message, int number){
        System.out.print(message + number);
    }
}
