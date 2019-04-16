import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        f0();
        f1();
        f2();
       Child child=new Child();
        System.out.println(child.x);
        Parent parent=new Child();
        System.out.println(parent.x);
        Parent parent1=new Parent();
        System.out.println(parent1.x);
    }
    public static void f0() throws EOFException {}
    public static void f1() throws FileNotFoundException {}
    public static void f2() throws InterruptedException {}


}
class Parent{
    int x=0;
}

class Child extends Parent{
    int x=1;
}