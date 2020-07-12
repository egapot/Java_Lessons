package lesson_10;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-- The program for changing vowels on '-' --");

        String text = scanner.nextLine();

        System.out.println(replaceVowels(text));
    }

    static String replaceVowels(String text) {

        char textArray[] = text.toCharArray();
        char vowelArray[] = { 'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'Y', 'U',};

        for (int i = 0; i < textArray.length; i++) {

            for (int j = 0; j < vowelArray.length; j++) {

                if (textArray[i] == vowelArray[j]) {
                    textArray[i] = '-';
                }
            }
        }

        String newText = new String(textArray);
        return newText;
    }
}
