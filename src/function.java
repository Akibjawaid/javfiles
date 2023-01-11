import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("enter another number");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum is = "+sum);
    }

}
