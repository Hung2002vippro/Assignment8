package assignment8;

import java.util.*;

public class Split {

    public static String[] splitWords(String str) {
        ArrayList<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                if (word.length() > 0) {
                    words.add(word.toString());
                    word.setLength(0);
                }
            } else {
                word.append(c);
            }
        }
        if (word.length() > 0) {
            words.add(word.toString());
        }

        return words.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String input = "Java is a versatile programming language";

        String[] wordsArray = splitWords(input);

        System.out.println("Chuoi ban dau: " + input);
        System.out.println("Mang: " + Arrays.toString(wordsArray));
    }
}
