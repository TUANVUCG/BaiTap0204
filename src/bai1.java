import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double a = number.nextDouble();
        if (a > 0) {
            System.out.println("This is integer");
        } else if (a < 0) {
            System.out.println("This is negative integer");
        }
    }
}