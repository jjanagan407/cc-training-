import java.util.*;

public class Function{

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int result = add(10, 20);
        System.out.println("Sum = " + result);
    }
}

