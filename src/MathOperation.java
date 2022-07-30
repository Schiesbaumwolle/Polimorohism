import java.util.Scanner;

public class MathOperation  {
    static Scanner scanner = new Scanner(System.in);

    public static int calc(int d, int d1, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = d + d1;
                break;
            case '-':
                result = d - d1;
                break;
            case '*':
                result = d * d1;
                break;
            case '/':
                result = d / d1;
                break;
            default:
                System.out.println("Not correct symbol");
                result = calc(d,d1,HasNext.getOperation());

        }

        return result;
    }
}


