// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class palindrome {

   public static void checkPalindrome(String s1, String s2) {
      if (s1.compareTo(s2) == 0) {
         System.out.println(s1 + " " + s2 + " are same");
      } else {
         System.out.println(s1 + " " + s2 + " are not same");
      }

   }

   public static void main(String[] var0) throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter First String: ");
      String s1 = sc.nextLine();
      System.out.print("Enter Second String: ");
      String s2 = sc.nextLine();
      checkPalindrome(s1, s2);
      sc.close();
   }
}
