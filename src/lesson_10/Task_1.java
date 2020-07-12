package lesson_10;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        System.out.println("-- Test palindrome program -- ");
        Scanner scanner = new Scanner(System.in);
        palindromeTest(testText(scanner));
    }

    public static String testText (Scanner scanner){
        String text = null;
        try {
            if (!scanner.hasNext("(.*)[1234567890.,](.*)")) {
                if (scanner.hasNext(".....")) {
                    text = scanner.next();
                } else {
                    throw new Exception("Word must have 5 letters");
                }
            } else {
                throw new Exception("Word must have only letters");
            }
        }catch (Exception e) {
                e.printStackTrace();
        }
        return text;
    }

    public static void palindromeTest (String text){
        String reversText = null;

        StringBuilder builder = new StringBuilder();

        builder.append(text);
        reversText = String.valueOf(builder.reverse());

        if (text.equalsIgnoreCase(reversText)){
            System.out.println("Word: " + text + " is palindrome");
        }else  System.out.println("Word: " + text + " isn`t palindrome");
    }
}
