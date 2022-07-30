import java.util.Scanner;

public class HasNext {
    static Scanner scan = new Scanner(System.in);
    public static char getOperation() {
        char operation;
        if (scan.hasNext()) {
            operation = scan.next().charAt(0);
        }else {
            System.out.println("Something wrong with operation! Try again.");
            scan.next();
            operation = getOperation();
        }

     return operation;
    }
   static public int getOp() {
        int x = 0;
            if (scan.hasNextInt()) {
                x = scan.nextInt();
            } else {
                System.out.println("Enter correct number");
                scan.next();
                x= getOp();
            }

        return x;

    }
}
