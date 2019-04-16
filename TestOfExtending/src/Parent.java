public class Parent {
    int x;
    Parent( int x){
        this.x=x;
        System.out.println("Parent constructor " + x);
    }
    Parent(){
        System.out.println("Parent constructor ");
    }
    void testFunction(){
        System.out.println("Parent function");
    }
    static void staticFunction(){
        System.out.println("Static parent function");
    }
}
