import java.math.BigDecimal;
import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double firstResult = (Math.pow(((Math.pow(a, 2)+ Math.pow(b, 2))/(Math.pow(a, 2) - Math.pow(b, 2))),
                ((a + b + c)/Math.sqrt(c))));
        double secondResult = (Math.pow((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3)),(a - b)));
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", firstResult, secondResult,
                Math.abs((a + b + c)/ 3.0 - (firstResult + secondResult) / 2.0));
    }
}
