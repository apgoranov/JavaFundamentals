import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[][] matrix = new int[Integer.parseInt(input[0])][Integer.parseInt(input[1])];
        for (int i = 0; i < Integer.parseInt(input[0]); i++) {
            for (int j = 0; j < Integer.parseInt(input[1]); j++) {
                matrix[i][j] = 1 + i * (Integer.parseInt(input[1])) + j;
            }
        }
        int min = 0;
        String command = sc.nextLine();
        while (!command.equals("Nuke it from orbit")){
            input = command.split(" ");
            int row = Integer.parseInt(input[0]);
            int col = Integer.parseInt(input[1]);
            int radius = Integer.parseInt(input[2]);
            if (row >= 0 && col >= 0){
                matrix[row][col] = 0;
            }
            if (row >= 0 && row < matrix[0].length){
                for (int i = col - radius >= 0? col - radius: 0; i < (col + radius < matrix[1].length ? col + radius: matrix[1].length); i++) {
                    matrix[row][i] = 0;
                }
            }
            if (col >= 0 && col < matrix[1].length){
                for (int i = row - radius >= 0? row - radius: 0; i < (row + radius < matrix[0].length ? row + radius: matrix[0].length); i++) {
                    matrix[i][col] = 0;
                }
            }

//            for (int i = 0; i < matrix[0].length; i++) {
//                for (int j = 0; j < matrix[1].length; j++) {
//                    System.out.print(matrix[i][j] + " ");
//                }
//                System.out.println();
//            }





            command = sc.nextLine();
        }
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                if (matrix[i][j]!= 0){
                    if (j == matrix[1].length - 1){
                        System.out.print(matrix[i][j]);
                        break;
                    }
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
