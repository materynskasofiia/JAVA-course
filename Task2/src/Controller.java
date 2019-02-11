import java.util.Scanner;


/**
 *Controller
 *
 * @version 1   09.02.2019
 * @author Sofiia Materynska
 */
public class Controller {

    private Model model;

    private View view;

    private int inputNumber;

    private boolean guessed=false;

    private int numberOfAttempts=0;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void userFunction() {
        Scanner sc = new Scanner(System.in);
        model.setIntNumber();
        printMessageWithRange((View.TRY_TO_GUESS + View.CHOOSE), View.DASH);

        while(!guessed){
            inputCheck(sc);
            check();
        }
    }

    public void inputCheck(Scanner sc){

        while(!sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT+View.TRY_AGAIN );
            sc.next();
        }
        rangeCheck(sc.nextInt(), sc);
    }

    public void rangeCheck(int number, Scanner sc) {

        if(number>model.getTopBorderOfRange() || number<model.getBottomBorderOfRange()) {
            view.printMessage(View.WRONG_RANGE + View.TRY_AGAIN);
            printMessageWithRange(View.CHOOSE, View.DASH);
            inputCheck(sc);
        }else {
            inputNumber = number;
        }
    }

    public void check() {

        if (inputNumber == model.getIntNumber()) {
            view.printMessage(View.CONGRATS, model.getIntNumber());
            view.printMessage(View.INCLUSIVE);
            view.printMessage(View.STATISTIC, numberOfAttempts);
            guessed = true;
        } else {
            changeBorder();
        }
    }

    public void changeBorder(){
        if(inputNumber>model.getIntNumber()) {
            model.setTopBorderOfRange(inputNumber);
        }else {
            model.setBottomBorderOfRange(inputNumber);
        }
        numberOfAttempts++;
        printMessageWithRange(View.RANGE, View.DASH);
    }

    public void printMessageWithRange(String message1, String message2){
        view.printMessage(message1, model.getBottomBorderOfRange());
        view.printMessage(message2, model.getTopBorderOfRange());
        view.printMessage(View.INCLUSIVE);
    }
}
