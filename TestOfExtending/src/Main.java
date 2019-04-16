public class Main {
    public static void main(String [] args){
        Child ch=new Child(8);
        ch.testFunction();
        ch.staticFunction();
        Parent p=new Child(7);
        p.testFunction();
        ch.testFunction();
        p.staticFunction();
        Parent pr=new Parent(6);
        pr.testFunction();
        pr.staticFunction();
        }
}
