import java.util.Scanner;

public class stringexample {
    public static void main(String[] args) {
        System.out.println("enter any msg");
        Scanner in  = new Scanner(System.in);
        String naam = in.nextLine();
        String msg = greet(naam);
        System.out.println("the message is = "+msg);

    }
    static String greet(String name){
        String msg = "hello"+ name;

        return msg;
    }
}
