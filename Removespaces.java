
package assignment8;
import java.util.*;
public class Removespaces {
   

    public static String removeSpaces(String str) {
        if (str == null || str.isEmpty()) {
            return str; 
        }

        return str.trim().replaceAll("\\s+", " ");
    }
     public static void main(String[] args) {
        String input = "   day   la  mot   vi du  voi   khoang trang   thua.   ";
        String result = removeSpaces(input);
        System.out.println("Chuoi sau khi xoa khoang trang thua: " + result );
    }
}
