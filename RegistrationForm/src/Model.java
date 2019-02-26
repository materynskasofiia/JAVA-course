//package registrationform;

public class Model {
    private String name;
    private String surname;
    private String byFather;
    private String login;
    private String loginWrong="masha123";

    public String getName(){
        return  this.name;
    }
    public String getSurname(){
        return  this.surname;
    }
    public String getByFather(){
        return  this.byFather;
    }
    public String getLogin(){
        return  this.login;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public void setByFather(String byFather){
        this.byFather=byFather;
    }
    public void setLogin(String login){
        this.login=login;
    }
    public void checkIfRight() throws RepeatedLogin{
        if(login.equals(loginWrong)){
            throw new RepeatedLogin();
        }
    }
}
