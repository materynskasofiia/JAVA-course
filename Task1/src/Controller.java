import java.util.Scanner;

public class Controller {

    public static final String KEY_WORD_1="Hello";
    public static final String KEY_WORD_2="world";


    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void userFunction() {
        checkWord(view.FIRST_QUESTION, view.REPEAT_QUESTION , KEY_WORD_1);
        model.createFinalPhrase(" ");
        checkWord(view.SECOND_QUESTION, view.REPEAT_QUESTION , KEY_WORD_2);
        model.createFinalPhrase("!");
        view.printMessage(model.getFinalPhrase());
    }

    public void checkWord(String phraseToShow, String phraseToRepeat, String wordToBe){
        view.printMessage(phraseToShow);
        Scanner sc = new Scanner(System.in);
        String word=sc.nextLine();
        while(!word.equals(wordToBe))
        {
            view.printMessage(phraseToRepeat);
            word=sc.nextLine();
        }
        model.createFinalPhrase(word);
    }
}
