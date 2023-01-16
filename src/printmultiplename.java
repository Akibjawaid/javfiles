import java.util.Scanner;

public class printmultiplename {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String at = in.nextLine();
        System.out.println("enter no of times ");
        int aw = in.nextInt();

        int i =1;
        while(i<=aw){
            System.out.println(at);
            i++;

        }
    }
}
