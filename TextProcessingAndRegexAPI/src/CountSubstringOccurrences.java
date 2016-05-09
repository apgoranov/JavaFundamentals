import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String as a single line: ");
        String input = sc.nextLine().toLowerCase();
        System.out.print("Enter the substring to look for: ");
        String searchingSubstring = sc.nextLine().toLowerCase();
        int index = 0;
        int count = 0;
        while (index >=0){
            if (input.indexOf(searchingSubstring, index) >= 0){
                count++;
                index = input.indexOf(searchingSubstring, index) + 1;
            }
            else {
                break;
            }
        }
        System.out.println("The substring appears " + count + " times in the string.");

        Pattern pattern = Pattern.compile(searchingSubstring);
        Matcher matcehr = pattern.matcher(input);
        int countWithRegex = 0;
        while (matcehr.find()){
            countWithRegex++;
        }

        System.out.println("Count with Regex (it doesn work properly): " + countWithRegex);
    }
}
