import java.math.BigDecimal;
import java.util.Scanner;

public class NonStop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int row = Integer.parseInt(input[0]);
//        int col = Integer.parseInt(input[1]);
//        long[][] matrix = new long[row][col];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                matrix[i][j] = (i + 1) * (j + 1);
//            }
//        }
        input = sc.nextLine().split(" ");
        double lukankaPrice = Double.parseDouble(input[0]);
        double rakiaPrice = Double.parseDouble(input[1]);
        input = sc.nextLine().split(" ");
        int customers = 0;
        BigDecimal money = new BigDecimal(0);
        while (!input[0].equals("Royal")){
            customers++;
            int currentRow = Integer.parseInt(input[0]);
            int currentCol = Integer.parseInt(input[1]);
            if (currentRow >= currentCol){
                double currentPrice = currentRow%2 == 1 ? rakiaPrice : lukankaPrice;
                for (int i = currentCol; i >= 0; i--) {
                    money = money.add(new BigDecimal((currentRow + 1) * (i + 1) * currentPrice));
                }
                for (int i = currentRow - 1; i >= 1 ; i--) {
                    currentPrice = i%2 == 1 ? rakiaPrice : lukankaPrice;
                    money = money.add(new BigDecimal(( i + 1) * currentPrice));
                }
            }
            else {
                double currentPrice;
                for (int i = currentRow; i >= 0 ; i--) {
                    currentPrice = i%2 == 1 ? rakiaPrice : lukankaPrice;
                    money = money.add(new BigDecimal((i + 1) * (currentCol + 1) * currentPrice));
                }
                currentPrice = lukankaPrice;
                for (int i = currentCol - 1; i >= 1; i--) {
                    money = money.add(new BigDecimal((i + 1) * 1 * currentPrice));
                }

            }
            input = sc.nextLine().split(" ");
        }
        String result = money.setScale(6, BigDecimal.ROUND_HALF_EVEN).toPlainString();
        System.out.println(result);
        System.out.println(customers);

    }
}
