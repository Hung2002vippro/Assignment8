package assignment8;

import java.util.*;

public class LongestWord {

    public static String findLongestWord(String str) {
        if (str == null || str.trim().isEmpty()) {
            return "";
        }

        String[] words = str.trim().split("\\s+"); 
        String longest = words[0]; 

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        String input = "Tim tu dai nhat trong chuoi.";
        String longestWord = findLongestWord(input);
        System.out.println("Tu dai nhat trong chuoi la: " + longestWord);
    }
}
