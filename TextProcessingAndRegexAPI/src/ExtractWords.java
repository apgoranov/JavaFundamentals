import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String input = sc.nextLine();
        Pattern pattern =Pattern.compile("([a-zA-Z]+)");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }

    }
}
