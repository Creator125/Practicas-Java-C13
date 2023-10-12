package fibonacci;

public class Fibonacci {
    static int fibonacci(int n){
        int f = 0;
        int f0 = 1;
        int f1 = 1;
        
        while(n > 1){
            n--;
            f = f0 + f1;
            f0 = f1;
            f1 = f;
        }
        return f;
    }
    
    public static final void main(final String[] args) {
        System.out.println(fibonacci(2));
    }
    
}
