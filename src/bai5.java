import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        double a = number.nextDouble();
        if (a % 3 == 0 && a % 5 != 0) {
            System.out.println("FIZZ");
        } else if (a % 5 == 0 && a % 3 != 0) {
            System.out.println("BUZZ");
        } else if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("FIZZBUZZ");
        }
    }
}
