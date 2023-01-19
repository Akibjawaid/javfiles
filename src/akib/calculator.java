package akib;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("Calculator ");
            System.out.println("enter 'X' to exit or 'C' to continue the operation");
            char f = in.next().charAt(0);
            if(f=='x'||f=='X'){
                System.out.println("Exiting program.. Bbyee!!");
                break;
            }
            else if (f=='c'||f=='C'){
                System.out.println("enter first number");
            int b = in.nextInt();
            System.out.println("enter the second number");
            int c = in.nextInt();
            System.out.println("enter the operation you want to execute");
        System.out.println("+" + "-" + "*" + "/");
            char a = in.next().charAt(0);

            switch (a) {
                case '+':
                    System.out.println("the sum is = " + (b + c));
                    break;
                case '-':
                    System.out.println("the substraction is = " + (b - c));
                    break;
                case '*':
                    System.out.println("the multiplication is = " + (b * c));
                    break;
                case '/':
                    if(a!=0) {
                        System.out.println("the divison is = " + (b / c) +  "the remainder is = " + (b % c));
                        break;
                    }
                    else {
                        System.out.println("cannot divide by zero");
                    }
                default:
                    System.out.println("invalid input");
            }
            }
            }
        }
    }

