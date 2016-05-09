import java.util.Scanner;

public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        System.out.print("Enter a single String so it can be split: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        int longestLenght = 1;
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            int lenght = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].equals(arr[j - 1])){
                    lenght++;
                }
                else {
                    break;
                }
            }
            if(lenght > longestLenght){
                longestLenght = lenght;
                position = i;
            }
        }
        for (int i = position; i < position + longestLenght; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
