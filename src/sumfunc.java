import java.util.Scanner;
public class sumfunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any number");
        int a = in.nextInt();
        System.out.println("enter second number");
        int b = in.nextInt();

        int ans = sum(a,b);
        System.out.println("the sum is = "+ ans);

    }
    static int sum(int a ,int b){
        int sum = a + b;
        return sum;
    }
}
