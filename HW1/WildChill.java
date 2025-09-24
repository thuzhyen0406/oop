import java.util.Scanner;

public class WildChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble(); // nhiệt độ tính bằng F
        double v = sc.nextDouble(); // tốc độ gió
        double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16); // cảm giác gió lạnh
        System.out.println(w);
    }
}
