import java.util.Scanner;

public class swapnew {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = in.nextInt();
        System.out.println("enter the second number");
        int b = in.nextInt();
        System.out.println("values before Swapping = "+a + " " +b);
        System.out.print("value after swapping = ");
        swap(a,b);
    }
    static void swap(int a ,int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(+a + " " + b);
    }

}
