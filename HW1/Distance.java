import java.util.Scanner;

public class Distance {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        double result = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println(result);
    }
}
