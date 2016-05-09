import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        System.out.print("Enter a single String: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern p = Pattern.compile("(\\b[A-Z][a-zA-Z]*[A-Z]\\b)");
        Matcher m = p.matcher(input);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
