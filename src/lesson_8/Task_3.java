package lesson_8;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        System.out.println("-- Program for adding --");
        Scanner scanner = new Scanner(System.in);
        result(scanner);
    }

    static void result (Scanner scanner){
        int a = 0;
        int number=0;

        System.out.println("Enter number");
        while (a<2){
            if (scanner.hasNextInt()){
                number += scanner.nextInt();
                a++;
            }else {
                System.out.println("Please, enter an integer number");
                scanner.nextLine();
            }

        }
        System.out.println("Result is " + number);
    }
}
