import java.util.Scanner;

public class SumOfSines {
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble(); // tính theo độ
        double goc = Math.PI * t / 180; // tính theo radian
        System.out.println(Math.sin(2 * goc) + Math.sin(3 * goc));
    }
}
