package lesson_8;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        System.out.println("-- Parity check program --");
        Scanner scanner = new Scanner(System.in);
        result(testInput(scanner));
    }

    static int testInput (Scanner scanner){
        boolean a = true;
        int number=0;
        System.out.println("Enter number");

        while (a){
            if (scanner.hasNextInt()){
                a = false;
               number = scanner.nextInt();
            }else {
                System.out.println("Please, enter an integer number");
                scanner.next();
            }

        }
        return  number;
    }

    static void result (int number){
        if (number % 2 == 0){
            System.out.println("Your`s number is even");
        }else {
            System.out.println("Your`s number is odd");
        }

    }
}
