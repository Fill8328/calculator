package fill.jma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void choseOperation() throws IOException {
        int i = 0;
        while (i < 1) {
            System.out.println("Write number");
            System.out.print("a = ");
            double a = EnterNum.enterNum();
            System.out.println("Hello! What are you want do? + - * / ?");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String operations = String.valueOf(reader.readLine());
            System.out.println("Write number");
            System.out.print("b = ");
            double b = EnterNum.enterNum();
            switch (operations) {
                case ("+"):
                    System.out.println("you chose Summ");
                    System.out.println("result Summ is " + summ(a,b));
                    ++i;
                    break;
                case ("-"):
                    System.out.println("you chose Subtraction");
                    System.out.println("result Subtraction is " + subtraction(a,b));
                    ++i;
                    break;
                case ("*"):
                    System.out.println("you chose Multiplication");
                    System.out.println("result Multiplication is " + multiplication(a,b));
                    ++i;
                    break;
                case ("/"):
                    System.out.println("you chose Division");
                    System.out.println("result Division is " + division(a,b));
                    ++i;
                    break;
                default:
                    System.out.println("Please chose: + - * /");

            }
        }
    }

    public static double division(double a, double b) {
        double result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Infinity");
        }
        return result;
    }

    public static double multiplication(double a, double b) {
        double result = a * b;
        return result;
    }

    public static double subtraction(double a, double b) {
        double result = a - b;
        return result;
    }

    public static double summ(double a, double b) {
        double result = a + b;
        return result;
    }

}
