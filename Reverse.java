package assignment8;

import java.util.*;

public class Reverse {

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String original = scanner.nextLine();
        String reversed = reverseString(original);
        System.out.println("Chuoi sau khi dao nguoc: " + reversed);
    }

}
