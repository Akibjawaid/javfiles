import java.util.*;

public class funcoverloading {
    public static void main(String[] args) {
        System.out.println("enter any number");

        Scanner in = new Scanner(System.in);
        Scanner sc= new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("enter the second number");
        int b = in.nextInt();
        System.out.println("enter the third number");
        int c = in.nextInt();
        int ans = sum(a,b);
        System.out.println("the answer is "+ans);
        int ans1 = sum(a,b,c);
        System.out.println("the second answer is "+ans1);

        System.out.println("enter any the name ");
        String ay = sc.nextLine();

        String ans2 = name(ay);
        System.out.println(ans2);


    }
    static int sum(int a ,int b){
        return a + b;

    }
    static int sum(int a, int b, int c){
        return a + b + c;
    }
    static String name(String naam){
        return naam;

    }

}
