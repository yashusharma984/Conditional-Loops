import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input from user till user does not press x or x
        int ans = 0;
        System.out.print("enter the first number : " );
        int num1 = sc.nextInt();
        System.out.print("enter the second number : ");
        int num2 = sc.nextInt();
        while (true) {
            // take the operator as input
            System.out.print("enter the operation to perform : ");
          char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '%' || op == '/') {
                // give input
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                } else if (op == 'x' || op == 'X') {
                    break;
                }
            } else {
                System.out.println("invalid operator");
            }
            System.out.println( " Final Answer here " + ans);
        }
    }
}
