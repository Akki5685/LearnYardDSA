package Arrays;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n < 2)
            return n;
        
        int a=0,b=1,c = 1;

        for (int i=1; i< n ;i++){
            c=a+b;
            a=b;
            b=c;

        }
        return c;
    }

    public static void main(String[] args) {
        int n = 5; // Example input
        int result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result); // Output should be 55
    }
}
