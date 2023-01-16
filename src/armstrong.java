public class armstrong {
    public static void main(String[] args) {
       // Scanner in = new Scanner(System.in);
        //System.out.println("enter any number to check");
       // int a = in.nextInt();
        for(int i = 100;i < 1000;i++){
            if(isarms(i)){
                System.out.println(i + " ");
            }
        }
        }
        static boolean isarms(int a){
        int original = a;
        int sum = 0;
        while(a>0){
            int rem = a %10;
            a = a / 10;
            sum = sum + rem*rem*rem;
        }
        return sum==original;
        }
    }



