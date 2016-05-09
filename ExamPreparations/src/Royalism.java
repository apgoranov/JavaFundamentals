import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by AGoranov on 08-May-16.
 */
public class Royalism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        long numberOfRoyalist = 0;
        List<Integer> royalist = new ArrayList<Integer>();
        List<Integer> nonRoyalist = new ArrayList<Integer>();
        for (int i = 0; i < input.length; i++) {
            long sum = 0;
            char[] arr = input[i].toCharArray();
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }
            if (sum > 26){
                sum = sum % 26;
            }
            if (sum == 18){
                royalist.add(i);
            }
            else nonRoyalist.add(i);
        }
        if (royalist.size() >= nonRoyalist.size()){
            System.out.println("Royalists - " + royalist.size());
            for (int i = 0; i < royalist.size(); i++) {
                System.out.println(input[royalist.get(i)]);
            }
            System.out.println("All hail Royal!");
        }
        else {
            for (int i = 0; i < nonRoyalist.size(); i++) {
                System.out.println(input[nonRoyalist.get(i)]);
            }
            System.out.println("Royalism, Declined!");
        }
    }
}
