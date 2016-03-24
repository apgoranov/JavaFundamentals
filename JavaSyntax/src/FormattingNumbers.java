import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the int: ");
        int integer = scanner.nextInt();
        System.out.print("Enter the first float: ");
        float firstFloat = scanner.nextFloat();
        System.out.print("Enter the secont float: ");
        float secondFloat = scanner.nextFloat();
        String hex = Integer.toHexString(integer).toUpperCase();
        String bin = Integer.toBinaryString(integer);
        if (bin.length() < 10){
            for (int i = 0; i < 10 - bin.length(); i++) {
                bin = "0" + bin;
            }
        }
        System.out.printf("|%1$-10s|%2$10s|%3$10.2f|%4$-10.3f|", hex,bin, firstFloat, secondFloat);
    }
}
