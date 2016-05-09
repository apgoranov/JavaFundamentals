import java.util.Scanner;
import java.util.stream.Stream;

public class SortArray {
    public static void main(String[] args) {
        System.out.print("Enter the numbers separated by a single space: ");
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        System.out.print("Enter Ascending or Descending: ");
        String command = sc.next();
        Stream.of(input).map(t -> Integer.parseInt(t)).sorted((t1,t2) -> command.equals("Ascending")? t1.compareTo(t2):t2.compareTo(t1))
                .forEach(e -> System.out.print(e + " "));
    }
}
