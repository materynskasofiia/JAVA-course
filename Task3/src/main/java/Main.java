import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    /*   // StringBuilder str1= new StringBuilder("abc");
        String str1="abc";
        int n=1000;
        for(int i=0; i<n; i++)
            str1+="abc";
            //str1=str1.append("abc");
        System.out.println(str1);*/
        Model m=new Model();
        Scanner sc=new Scanner(System.in);
        System.out.println(m.checkField("[A-Z][a-z]+",sc.next()));
    }
}
