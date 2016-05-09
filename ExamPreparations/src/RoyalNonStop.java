import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RoyalNonStop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String input = sc.nextLine();
        List<String> spades = new ArrayList<String>();
        List<String> clubs = new ArrayList<String>();
        List<String> diamonds = new ArrayList<String>();
        List<String> hearts = new ArrayList<String>();
        Pattern pattern = Pattern.compile("([0-9]{1,2}[a-z]{1}|[A-Z]{1}[a-z]{1})");
        BigInteger countFlushes = new BigInteger("0");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(sc.nextLine());
        }
        input = sb.toString();
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            switch (matcher.group()) {
                // spades
                case "10s": if (spades.size() == 0){
                    spades.add(matcher.group());
                }
                else spades.clear();
                    break;
                case "Js": if (spades.size() == 1 && spades.contains("10s")){
                    spades.add(matcher.group());
                }
                else spades.clear();
                    break;
                case "Qs":if (spades.size() == 2 && spades.contains("Js")){
                    spades.add(matcher.group());
                }
                else spades.clear();
                    break;
                case "Ks":if (spades.size() == 3 && spades.contains("Qs")){
                    spades.add(matcher.group());
                }
                else spades.clear();
                    break;
                case "As":if (spades.size() == 4 && spades.contains("Ks")){
                    System.out.println("Royal Flush Found - Spades");
                    countFlushes = countFlushes.add(BigInteger.valueOf(1));
                    spades.clear();
                }
                else spades.clear();
                    break;

                //clubs
                case "10c":if (clubs.size() == 0){
                    clubs.add(matcher.group());
                }
                else clubs.clear();
                    break;
                case "Jc":if (clubs.size() == 1 && clubs.contains("10c")){
                    clubs.add(matcher.group());
                }
                else clubs.clear();
                    break;
                case "Qc":if (clubs.size() == 2 && clubs.contains("Jc")){
                    clubs.add(matcher.group());
                }
                else clubs.clear();
                    break;
                case "Kc":if (clubs.size() == 3 && clubs.contains("Qc")){
                    clubs.add(matcher.group());
                }
                else clubs.clear();
                    break;
                case "Ac":if (clubs.size() == 4 && clubs.contains("Kc")){
                    System.out.println("Royal Flush Found - Clubs");
                    countFlushes = countFlushes.add(BigInteger.valueOf(1));
                    clubs.clear();
                }
                else clubs.clear();
                    break;
                //diamonds
                case "10d":if (diamonds.size() == 0){
                    diamonds.add(matcher.group());
                }
                else diamonds.clear();
                    break;
                case "Jd": if (diamonds.size() == 1 && diamonds.contains("10d")){
                    diamonds.add(matcher.group());
                }
                else diamonds.clear();
                    break;
                case "Qd":if (diamonds.size() == 2 && diamonds.contains("Jd")){
                    diamonds.add(matcher.group());
                }
                else diamonds.clear();
                    break;
                case "Kd":if (diamonds.size() == 3 && diamonds.contains("Qd")){
                    diamonds.add(matcher.group());
                }
                else diamonds.clear();
                    break;
                case "Ad":if (diamonds.size() == 4 && diamonds.contains("Kd")){
                    System.out.println("Royal Flush Found - Diamonds");
                    countFlushes = countFlushes.add(BigInteger.valueOf(1));
                    diamonds.clear();
                }
                else diamonds.clear();
                    break;

                //hearts
                case "10h":if (hearts.size() == 0){
                    hearts.add(matcher.group());
                }
                else hearts.clear();
                    break;
                case "Jh":if (hearts.size() == 1 && hearts.contains("10h")){
                    hearts.add(matcher.group());
                }
                else hearts.clear();
                    break;
                case "Qh":if (hearts.size() == 2 && hearts.contains("Jh")){
                    hearts.add(matcher.group());
                }
                else hearts.clear();
                    break;
                case "Kh":if (hearts.size() == 3 && hearts.contains("Qh")){
                    hearts.add(matcher.group());
                }
                else hearts.clear();
                    break;
                case "Ah":if (hearts.size() == 4 && hearts.contains("Kh")){
                    System.out.println("Royal Flush Found - Hearts");
                    countFlushes = countFlushes.add(BigInteger.valueOf(1));
                    hearts.clear();
                }
                else hearts.clear();
                    break;
                default:break;
            }
        }
        System.out.println("Royal's Royal Flushes - " + countFlushes + ".");
    }
}
