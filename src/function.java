import java.util.Scanner;

public class function {
    public static void main(String[] args) {
         int answer = sum2();
        System.out.println("the sum is = "+answer);
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("enter another number");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

}
