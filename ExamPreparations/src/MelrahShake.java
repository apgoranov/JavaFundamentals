import java.util.Scanner;

public class MelrahShake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String pattern = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        while(true){
            int firstIndex = sb.indexOf(pattern);
            int secondIndex = sb.lastIndexOf(pattern);
            if (firstIndex != secondIndex){
                sb.delete(firstIndex, firstIndex + pattern.length());
                sb.delete(secondIndex - pattern.length(), secondIndex);
                System.out.println("Shaked it.");
            }
            else {
                break;
            }
            StringBuilder sbPattern = new StringBuilder();
            sbPattern.append(pattern);
            sbPattern.delete(pattern.length()/2, pattern.length()/2 + 1);
            pattern = sbPattern.toString();
            if (sb.length() < pattern.length() || pattern.length() == 0){
                break;
            }
        }
        System.out.println("No shake.");
        System.out.println(sb.toString());
    }
}
