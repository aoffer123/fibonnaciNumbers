
import java.util.Scanner;

public class fibonnaciNumbers {

static int fib(int n) {
    if (n==0||n==1)
        return 0;
    else if (n==2)
        return 1; 
    return fib(n-1) + fib(n-2);
}


    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        sc.close();

        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
                System.out.println(fib(n));
            
            }catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + "must be an integer.");
                System.exit(1);
            }
        }

       System.out.println(fib(n));  
        
    }
}