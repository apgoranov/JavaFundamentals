import java.util.Scanner;

public class ConvertFromBase7ToDec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int baseSeven = sc.nextInt();
        String result = Integer.toString(Integer.parseInt(Integer.toString(baseSeven), 7), 10);
        System.out.print("The number in decimal numeral system is: " + result);
    }
}
