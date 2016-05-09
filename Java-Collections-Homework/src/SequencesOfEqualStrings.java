import java.lang.reflect.Array;
import java.util.*;

public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        System.out.print("Enter a single String so it can be split: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<String> arrList = new ArrayList<String>();
        arrList.addAll(Arrays.asList(input.split(" ")));
        int countLongest = 0;
        int index = 0;
        for (int i = 0; i < arrList.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < arrList.size(); j++) {
                if (arrList.get(i).equals(arrList.get(j))){
                    count++;
                }
                else {
                    break;
                }
            }
            for (int j = i; j < i + count; j++) {
                System.out.print(arrList.get(j) + " ");
            }
            System.out.println();

            if (count > countLongest){
                countLongest = count;
                index = i;
            }
            if (count > 1){
                i += count - 1;
            }
        }

        System.out.print("Longest sequence of equal strings is: ");
        for (int i = index; i < index + countLongest; i++) {
            System.out.print(arrList.get(i) + " ");
        }
        
//        String[] arr = input.split(" ");
//        for (int i = 0; i < arr.length; i++) {
//            int count = 1;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j].equals(arr[i])){
//                    count++;
//                }
//                else {
//                    break;
//                }
//            }
//
//            for (int j = i; j < i + count; j++) {
//                System.out.print(arr[j] + " ");
//            }
//            System.out.println();
//            if (count > 1){
//                i += count - 1;
//            }
//
//        }
    }
}
