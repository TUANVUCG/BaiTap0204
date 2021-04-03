import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        float a = number.nextFloat();
        float b = number.nextFloat();
        float c = number.nextFloat();
        if(a<b+c&&b<a+c&&c<a+b){
            System.out.println("Đây là 3 cạnh của một tam giác");
        }else{
            System.out.println("Đây không phải là 3 cạnh của một tam giác");
        }
    }
}
