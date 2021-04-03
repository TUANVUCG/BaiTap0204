import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        double a = number.nextDouble();
        double b = number.nextDouble();
        double c = number.nextDouble();
        if(a*a==b*b+c*c||b*b==a*a+c*c||c*c==b*b+a*a){
            System.out.println("Đây là 3 cạnh của một tam giác vuông");
        }
    }
}
