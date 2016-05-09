import java.math.BigDecimal;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniDefenseSystem {
    public static void main(String[] args) {
        String regex = "([A-Z]{1}[a-z]+).*?([A-Z]{1}[a-z]*[A-Z]{1}).*?([\\d]*)[L]";
        Pattern pattern = Pattern.compile(regex);
        String input = "";
        Scanner sc = new Scanner(System.in);
        long alchohol = 0;
//        BigDecimal result = new BigDecimal("0");
        while (!input.equals("OK KoftiShans")){
            input = sc.nextLine();
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()){
                System.out.println(matcher.group(1) + " brought " + matcher.group(3) + " liters of " + matcher.group(2).toLowerCase() + "!");
                alchohol += Long.parseLong(matcher.group(3));
            }
        }
//        result.add(BigDecimal.valueOf(alchohol));
//        result.divide(new BigDecimal("100"));
        Double d = alchohol / 1000.00;
        System.out.printf("%.3f softuni liters", d);
    }
}
