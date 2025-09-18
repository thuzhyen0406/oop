/**
 *  
 */
import java.util.*;
 
 public class Introduction {
   public static void main(String[] args) {
   String fullName = "Nguyễn Thị Thu Huyền";
   String mSV = "24021523";
   String nameClass = "251_INT2204 1";
   String userName = "thuzhyen0406";
   String email = "24021523@vnu.edu.vn";
   
   System.out.println(fullName + '\t' + mSV + '\t' + nameClass + '\t' + userName + '\t' + email);
   
   for (int i = 9; i >= 2; i--) {
     System.out.println(i + " bottles of beer on the wall, " + i +" bottles of beer.");
     System.out.println("Take one down and pass it around, " + (i-1) + (i - 1 == 1 ? " bottle" : "bottles") 
             +  " of beer on the wall.");   
     }
     System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
        System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
        System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
        System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
   }
   
 }