package assignment8;

import java.util.*;

public class Palindrome {

    public static boolean Palindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String chuoi = scanner.nextLine();

        if (Palindrome(chuoi)) {
            System.out.println("\"" + chuoi + "\" la chuoi hoi van.");
        } else {
            System.out.println("\"" + chuoi + "\" khong phai la chuoi hoi van.");
        }
    }

}
