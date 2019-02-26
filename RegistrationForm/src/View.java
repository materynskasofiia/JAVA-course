
public class View {

public static void printMessage(String message){
    System.out.print(message);
}

public void showResult(Model m){
    printMessage("Your data was processed\nYour name: " + m.getName() +
            "\nYour surname: " + m.getSurname() + "\nYour name by father: " +
            m.getByFather() + "\nYour login: " + m.getLogin() + '\n');
}

public static void wrongInput(){
    printMessage("Try again!\n");
    }


}
