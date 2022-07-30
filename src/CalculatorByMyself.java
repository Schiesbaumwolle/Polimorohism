import java.nio.CharBuffer;
import java.util.Scanner;
public class CalculatorByMyself {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        System.out.println("First number");
        int d = HasNext.getOp();
        System.out.println("Operation");
        char operation = HasNext.getOperation() ;
        System.out.println("Second number");
        int d1 = HasNext.getOp();
        System.out.println( MathOperation.calc(d,d1,operation));

    }
}
