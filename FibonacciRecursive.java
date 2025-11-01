public class FibonacciRecursive {
    // Recursive method to find nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: fib(0)=0, fib(1)=1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
        }
    }

    public static void main(String[] args) {
        int count = 10; // Print first 10 Fibonacci numbers
        System.out.println("Fibonacci Series up to " + count + " terms:");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}