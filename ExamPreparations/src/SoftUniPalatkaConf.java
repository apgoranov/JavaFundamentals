import java.util.Scanner;

public class SoftUniPalatkaConf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPeople = sc.nextInt();
        int loops = sc.nextInt();
        String buffer = sc.nextLine();
        int sleepingPlaces = 0;
        int numberOfMeals = 0;
        for (int i = 0; i < loops; i++) {
            String[] input = sc.nextLine().split(" ");
            if (input[0].equalsIgnoreCase("tents")){
                if (input[2].equalsIgnoreCase("normal")) {
                    sleepingPlaces += 2 * Integer.parseInt(input[1]);
                } else {
                    sleepingPlaces += 3 * Integer.parseInt(input[1]);
                }
            }else if(input[0].equalsIgnoreCase("rooms")){
                if (input[2].equalsIgnoreCase("single")){
                    sleepingPlaces += Integer.parseInt(input[1]);
                }else if (input[2].equalsIgnoreCase("double")){
                    sleepingPlaces+= 2 * Integer.parseInt(input[1]);
                }
                else {
                    sleepingPlaces += 3 * Integer.parseInt(input[1]);
                }
            }else {
                if (input[2].equalsIgnoreCase("musaka")){
                    numberOfMeals += 2 * Integer.parseInt(input[1]);
                }
            }

        }
        if (numberOfPeople <= sleepingPlaces){
            System.out.println("Everyone is happy and sleeping well. Beds left: " + (sleepingPlaces - numberOfPeople));
        }else System.out.println("Some people are freezing cold. Beds needed: " + (numberOfPeople - sleepingPlaces));

        if (numberOfMeals >= numberOfPeople){
            System.out.println("Nobody left hungry. Meals left: " + (numberOfMeals - numberOfPeople));
        } else{
            System.out.println("People are starving. Meals needed: " + (numberOfPeople - numberOfMeals));
        }
    }
}
