import java.util.Scanner;

public class Controller {


    public void getInput(){
        while(true) {
            View.printMessage("Press 'e' to exit\nPress 'c' to begin registration\n");
            Scanner sc=new Scanner(System.in);
            switch (sc.next()) {
                case "e": return;
                case "c":
                    getRegistraionInput();
                    break;
            }
        }
    }

    public void getRegistraionInput() {
        Model m=new Model();
        RegularExpressions c = new RegularExpressions();
        m.setName(setCharacteristic("Enter your name\n",c.regExUAName));
        m.setSurname(setCharacteristic("Enter your surname\n",c.regExUAName));
        m.setByFather(setCharacteristic("Enter your name by father\n",c.regExUAName));
        m.setLogin(setCharacteristic("Enter your login( at least 6 characters)\n",c.regExLogin));
       loginCheck(m);
       View v=new View();
       v.showResult(m);
    }

    public void loginCheck(Model m){
        try {
            m.checkIfRight();
        }
        catch(RepeatedLogin r) {
            RegularExpressions c = new RegularExpressions();
            m.setLogin(setCharacteristic("Enter another login, this one is taken( at least 6 characters)\n",c.regExLogin));
            loginCheck(m);
        }
    }

    public String setCharacteristic(String message, String regEx){
        View.printMessage(message);
        String tmp;
        Scanner sc = new Scanner(System.in);
        RegularExpressions c = new RegularExpressions();
        while (!c.checkName(regEx, tmp=sc.next())) {
            View.wrongInput();
        }
        return tmp;
    }
}
