package fibonacci;

public class FibonacciRecursion {

    static int count = 2;

    public static void fibonacci(int prev2, int prev1) {
        if (count < 17) {
            int newFibo = prev2 + prev1;
            System.out.println(newFibo);
            
            prev2 = prev1;
            prev1 = newFibo;
            
            count += 1;
            fibonacci(prev2, prev1);
        } else {
            return;
        }

    }

    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        fibonacci(0, 1);
    }

}
