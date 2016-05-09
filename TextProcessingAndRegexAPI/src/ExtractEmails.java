import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "(\\b[\\w]+[.?-?_?[\\w]]*)@([\\w]+-?[.\\w]*\\b)";
        System.out.print("Enter the String as a single line: ");
        String input = sc.nextLine();
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
