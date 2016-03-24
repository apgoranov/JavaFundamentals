import java.util.*;
import static java.util.Collections.*;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> result = new ArrayList<Integer>();
        if (n > m){
            for (int i = m; i <= n; i++) {
                result.add(i);
            }
        }
        else{
            for (int i = n; i <= m; i++) {
                result.add(i);
            }
        }


        Collections.shuffle(result);
        System.out.println(result);

    }
}
