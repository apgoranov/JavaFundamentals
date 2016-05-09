import java.util.Scanner;

public class CalculateN {
    public static void main(String[] args) {
        System.out.print("Enter the factoriel number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("The factoriel is: " + Factoriel(input));
    }
    public static int Factoriel(Integer input){
        if (input == 0){
            return 1;
        }
        else {
            return input*Factoriel(input - 1);
        }
    }

}

