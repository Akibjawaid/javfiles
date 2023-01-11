import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner  in = new Scanner(System.in);
        int n = in.nextInt();
        int ans =0;
        while(n>0){
            int rem = n % 10;
            n = n / 10;
            ans = ans * 10  + rem;


        }
        System.out.println(ans);

    }
}