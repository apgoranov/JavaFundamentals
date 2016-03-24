import java.math.BigDecimal;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side of the rectangle: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second side of the rectangle: ");
        double b = sc.nextDouble();
        System.out.printf("The area is %.2f", CalcRecangleArea(a, b));
    }

    public static double CalcRecangleArea(double a, double b){
        return a*b;
    }
}
