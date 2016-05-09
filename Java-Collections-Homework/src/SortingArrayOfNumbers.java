import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortingArrayOfNumbers {
    public static void main(String[] args) {
        System.out.print("Enter the number n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arrList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            arrList.add(sc.nextInt());
        }
        System.out.println(arrList);
        Collections.sort(arrList);
        System.out.println(arrList);
//        int[] arrOfNNumbers = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Enter the next number: ");
//            arrOfNNumbers[i] = sc.nextInt();
//        }
//        System.out.print("The numbers you've entered are:");
//        for (int i = 0; i < n; i++) {
//            System.out.print(" " + arrOfNNumbers[i]);
//        }
//        System.out.println();
//        for (int i = 0; i < n - 1; i++) {
//            int minPosition = i;
//            int min = arrOfNNumbers[i];
//            for (int j = i + 1; j < n; j++) {
//                if (min > arrOfNNumbers[j]){
//                    minPosition = j;
//                    min = arrOfNNumbers[j];
//                }
//            }
//            min = arrOfNNumbers[i];
//            arrOfNNumbers[i] = arrOfNNumbers[minPosition];
//            arrOfNNumbers[minPosition] = min;
//        }
//        System.out.print("The sorted array is: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(" " + arrOfNNumbers[i]);
//        }
    }
}
