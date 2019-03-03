package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
         int n = 40;
         int first = 0 ;
         int second = 1;
         int fibo;
        System.out.println(first+ " " + second);

        for ( int i = 3; i <= n; i ++) {
            fibo = first + second;

            System.out.println(fibo);
            first = second;
            second = fibo;
        }

    }
}
