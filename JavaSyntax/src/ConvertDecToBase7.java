import java.util.Scanner;

public class ConvertDecToBase7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int dec = sc.nextInt();
        String result = Integer.toString(dec, 7);
        System.out.print("The number in 7 based numeral system is: " + result);

    }
}
