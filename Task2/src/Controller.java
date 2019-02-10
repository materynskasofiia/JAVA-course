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

    private int topBorderOfRange=100;

    private int bottomBorderOfRange=0;

    private boolean guessed=false;

    private int numberOfAttempts=0;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void userFunction() {
        Scanner sc = new Scanner(System.in);
        model.setIntNumber((int)(Math.random()*(topBorderOfRange+1)));
        view.printMessage(View.TRY_TO_GUESS + View.CHOOSE, bottomBorderOfRange);
        view.printMessage(" - ", topBorderOfRange);
        view.printMessage("");

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

        if(number>topBorderOfRange || number<bottomBorderOfRange) {
            view.printMessage(View.WRONG_RANGE + View.TRY_AGAIN);
            view.printMessage(View.CHOOSE, bottomBorderOfRange);
            view.printMessage(" - ", topBorderOfRange);
            view.printMessage("");
            inputCheck(sc);
        }else {
            inputNumber = number;
        }
    }

    public void check() {

        if (inputNumber == model.getIntNumber()) {
            view.printMessage(View.CONGRATS, model.getIntNumber());
            view.printMessage("");
            view.printMessage(View.STATISTIC, numberOfAttempts);
            guessed = true;
        } else {
            changeBorder();
        }
    }

    public void changeBorder(){
        if(inputNumber>model.getIntNumber()) {
            topBorderOfRange = inputNumber;
        }else {
            bottomBorderOfRange = inputNumber;
        }
        numberOfAttempts++;
        view.printMessage(View.RANGE, bottomBorderOfRange);
        view.printMessage(" - ", topBorderOfRange);
        view.printMessage("");
    }
}
