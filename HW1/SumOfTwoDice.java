import java.util.Random;
import java.util.Scanner;

public class SumOfTwoDice {
      public static void main(String[] args) {
        /*
        * tổng của hai số nguyên ngẫu nhiên 
         */
        Random rd = new Random();
        int so1 = rd.nextInt(1,7); // chạy từ 1 -> 6;
        int so2 = rd.nextInt(1, 7);
        int sum = so1 + so2;
        System.out.println(sum);
    }
}
