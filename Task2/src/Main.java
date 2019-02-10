/**
 *Main
 *
 * @version 1   09.02.2019
 * @author Sofiia Materynska
 */
public class Main {

    public static void main(String[] args) {

        View view=new View();
        Model model=new Model();
        Controller controller=new Controller(model, view);
        controller.userFunction();
    }
}
