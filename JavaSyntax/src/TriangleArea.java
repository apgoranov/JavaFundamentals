import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        System.out.println("You Know what you have to enter: ");
        Scanner sc = new Scanner(System.in);
        int aX = sc.nextInt();
        int aY = sc.nextInt();
        int bX = sc.nextInt();
        int bY = sc.nextInt();
        int cX = sc.nextInt();
        int cY = sc.nextInt();
        double area = Math.abs((aX*(bY - cY) + bX*(cY - aY) + cX*(aY - bY))/2.0);
        if (area == 0){
            System.out.println("Area: 0");
        }
        else{System.out.printf("Area: %.2f", area);}

    }
}
