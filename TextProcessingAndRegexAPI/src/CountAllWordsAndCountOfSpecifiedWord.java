import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountAllWordsAndCountOfSpecifiedWord {
    public static void main(String[] args) {
        System.out.print("Enter a single String so it can be split: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.print("Enter the word to search for: ");
        String search = sc.nextLine();
        Pattern p = Pattern.compile("[a-zA-z]+");
        Matcher m = p.matcher(input);
        int count = 0;
        int words = 0;
        while(m.find()) {
            if (m.group().equalsIgnoreCase(search)){
                count++;
            }
            // System.out.println(m.group());
            words++;
        }
        System.out.println("The count of the word \"" + search + "\" is: " + count);
        System.out.println("The number of words in the entered text is: " + words);
    }
}
