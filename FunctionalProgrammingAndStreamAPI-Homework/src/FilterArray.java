import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilterArray {
    public static void main(String[] args) {
        System.out.print("Enter an array as a single string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");

        Arrays.stream(arr).filter(w -> w.length()>3).forEach(e -> System.out.println(e + " "));
    }
}
