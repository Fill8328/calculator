package fill.jma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChoseOperation {
    public static void choseOperation() throws IOException {
        int i = 0;
        while (i < 1) {
            System.out.println("Hello! What are you want do? + - * / ?");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String operations = String.valueOf(reader.readLine());
            switch (operations) {
                case ("+"):
                    System.out.println("you chose Summ");
                    System.out.println("result Summ is " + Summ.summ());
                    ++i;
                    break;
                case ("-"):
                    System.out.println("you chose Subtraction");
                    System.out.println("result Subtraction is " + Subtraction.subtraction());
                    ++i;
                    break;
                case ("*"):
                    System.out.println("you chose Multiplication");
                    System.out.println("result Multiplication is " + Multiplication.multiplication());
                    ++i;
                    break;
                case ("/"):
                    System.out.println("you chose Division");
                    System.out.println("result Division is " + Division.division());
                    ++i;
                    break;
                default:
                    System.out.println("Please chose: + - * /" + i);

            }
        }

    }
}
