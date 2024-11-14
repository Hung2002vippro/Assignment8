package assignment8;

import java.util.*;

public class Count {

    public static int Count(String a, char c) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == c) {
                count++;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi muon kiem tra: ");
        String chuoi = scanner.nextLine();
        System.out.print("Nhap ky tu muon kiem tra: ");
        char ch = scanner.next().charAt(0);
        int dem = Count(chuoi, ch);
        System.out.println("So lan ky tu xuat hien trong chuoi la: " + dem);
    }

}
