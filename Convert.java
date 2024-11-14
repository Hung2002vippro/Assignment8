
package assignment8;
import java.util.*;
public class Convert {
    public static String swapCase(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch)); 
            } else {
                result.append(ch); 
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi muon kiem tra: ");
        String input = scanner.nextLine();
        String output = swapCase(input);
        System.out.println("Chuoi sau khi bien doi: " + output);
    }
}
