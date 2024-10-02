interface NumericTest {
    boolean test(int n);
}

public class LambdaDemo {
    public static void main(String[] args) {
        NumericTest iseven = (n) -> (n % 2) == 0;
        if (iseven.test(2)) {
            System.out.println("given number is even");
        } else {
            System.out.println("given number is odd");
        }

    }
}
