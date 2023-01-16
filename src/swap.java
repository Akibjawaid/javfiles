
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter 1st number");
        int a = in.nextInt();
        System.out.println("enter 2nd number");
        System.out.println();
        int b = in.nextInt();
      swapping(a,b);


    }

     static void swapping(int num1 , int num2) {
        int temp = num1;
        num1=num2;
        num2=temp;
         System.out.println("the swapped no is = " + num1 +" " + num2);

     }
}
