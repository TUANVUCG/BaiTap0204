import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a : ");
        double a = number.nextDouble();
        System.out.println("Enter b : ");
        double b = number.nextDouble();
        System.out.println("Enter c : ");
        double c = number.nextDouble();
        if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == b * b + a * a) {
            System.out.println("Đây là 3 cạnh của một tam giác vuông");
        }else {
            System.out.println("Đây không phải 3 cạnh của một tam giác vuông");
        }
    }
}
