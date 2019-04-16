public class Child extends Parent {
    //int x;
    Child(int x){
        super(x);
        System.out.println("Child constructor" + this.x);
    }
    void testFunction(){
        System.out.println("Child function" + x);
    }
    static void staticFunction(){
        System.out.println("Static child function");
    }
}
