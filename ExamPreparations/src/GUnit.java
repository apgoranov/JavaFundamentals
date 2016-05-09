import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GUnit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern pattern = Pattern.compile("([A-Z][\\w]+).+?([A-Z][\\w]+).+?([A-Z][\\w]+)");
        String input = sc.nextLine();
        Map<String, HashMap<String, List<String>>> clases = new HashMap<String, HashMap<String, List<String>>>();
        while(!input.equals("It's testing time!")){
            Matcher matcher = pattern.matcher(input);
            while(matcher.find()){
                if (matcher.group(1).length() < 2 || matcher.group(2).length() < 2 || matcher.group(3).length() < 2){
                    break;
                }
                if (clases.get(matcher.group(1)) == null){
                    clases.put(matcher.group(1), new HashMap<>());
                    clases.get(matcher.group(1)).put(matcher.group(2), new ArrayList<String>());
                    clases.get(matcher.group(1)).get(matcher.group(2)).add(matcher.group(3));
                }
                else if (clases.get(matcher.group(1)).get(matcher.group(2)) == null){
                    clases.get(matcher.group(1)).put(matcher.group(2), new ArrayList<String>());
                    clases.get(matcher.group(1)).get(matcher.group(2)).add(matcher.group(3));
                }
                else if (clases.get(matcher.group(1)).get(matcher.group(2)).contains(matcher.group(3))){
                        continue;
                }
                else {
                    clases.get(matcher.group(1)).get(matcher.group(2)).add(matcher.group(3));
                }
                System.out.println(matcher.group(1));
                System.out.println(matcher.group(2));
                System.out.println(matcher.group(3));
            }
            input = sc.nextLine();
        }
        System.out.println("gasf");







    }
}
