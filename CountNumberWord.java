
package assignment8;
import java.util.*;
public class CountNumberWord {
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        String input = "vi du dem tu.";
        int wordCount = countWords(input);
        System.out.println("So tu trong chuoi: " + wordCount);
    }
    
}
