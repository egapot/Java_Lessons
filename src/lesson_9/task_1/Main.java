package lesson_9.task_1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static void menu() {
        System.out.println ();
        System.out.println ("Enter 1 to check if the entered month exists");
        System.out.println ("Enter 2 to display all months with the same time of year");
        System.out.println ("Enter 3 to display all months with the same number of days");
        System.out.println ("Enter 4 to display all months with fewer days");
        System.out.println ("Enter 5 to display all months with more days");
        System.out.println ("Enter 6 to display the next season");
        System.out.println ("Enter 7 to display the previous season");
        System.out.println ("Enter 8 to display all months with an even number of days");
        System.out.println ("Enter 9 to display all months with an odd number of days");
        System.out.println ("Enter 0 to check whether the number of days in the entered month is even");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Months[] arrayMonths = Months.values();
        Seasons[] arraySeasons = Seasons.values();
        menu();
        int number = 10;
           try {
               number = scanner.nextInt();
               if (number>9 | number<0){
                   throw new WrongInputConsoleParametersException("Enter a number from 0 to 9!");
               }
           }catch (InputMismatchException ex){

               try {
                   throw new WrongInputConsoleParametersException("Enter a number");
               } catch (WrongInputConsoleParametersException e) {
                   System.err.println(e.getMessage());
               }
           }catch (WrongInputConsoleParametersException exx){
               System.err.println(exx.getMessage());
           }

            switch (number) {

                case 1: {
                    System.out.println ("=== The program to check the existence of the entered month ===");
                    System.out.println ("Enter month:");
                    String month1 = scanner.next ();

                    boolean flag = isMonthExists (arrayMonths, month1);

                    if (flag == true) {
                        System.out.println ("The entered month exists!");
                    } else
                        System.out.println ("There is no such month!");

                    break;
                }

                case 2: {
                    System.out.println ("=== Output program for all months with the season entered ===");
                    System.out.println ("Enter the time of year:");
                    String season2 = scanner.next ();

                    boolean flag = false;

                    for (Months months : arrayMonths) {
                        if (months.getSeason().name().equalsIgnoreCase(season2)) {
                            flag = true;
                        }
                    }

                    if (flag == true) {
                        System.out.println ("Season" + season2 + "in the following months:");

                        for (Months months2: arrayMonths) {
                            if (months2.getSeason (). toString (). equalsIgnoreCase (season2)) {
                                System.out.println (months2);
                            }
                        }
                    }

                    if (flag == false)
                        System.out.println ("There are no such months!");

                    break;
                }

                case 3: {
                    System.out.println ("=== Output program for all months with the number of days entered ===");
                    System.out.println ("Enter the number of days:");
                    int numberOfDays3 = scanner.nextInt ();

                    boolean flag = false;

                    for (Months months : arrayMonths) {
                        if (months.getNumberOfDays() == numberOfDays3) {
                            flag = true;
                        }
                    }

                    if (flag == true) {
                        System.out.println ("Number of days" + numberOfDays3 + "in the following months:");

                        for (Months months2: arrayMonths) {
                            if (months2.getNumberOfDays () == numberOfDays3) {
                                System.out.println (months2);
                            }
                        }
                    }

                    if (flag == false)
                        System.out.println ("There are no such months!");

                    break;
                }

                case 4: {
                    System.out.println ("=== Program for output of all months with the number of days less than entered ===");
                    System.out.println ("Enter the number of days:");
                    int numberOfDays4 = scanner.nextInt();

                    boolean flag = false;

                    for (Months months : arrayMonths) {
                        if (months.getNumberOfDays() == numberOfDays4 && numberOfDays4 >= 30) {
                            flag = true;
                        }
                    }

                    if (flag == true) {
                        System.out.println ("Number of days less" + numberOfDays4 + "in the following months:");

                        for (Months months2: arrayMonths) {
                            if (months2.getNumberOfDays () <numberOfDays4) {
                                System.out.println (months2);
                            }
                        }
                    }

                    if (flag == false)
                        System.out.println ("There are no such months!");

                    break;
                }

                case 5: {
                    System.out.println ("=== Output program for all months with more days entered ===");
                    System.out.println ("Enter the number of days:");
                    int numberOfDays5 = scanner.nextInt ();

                    boolean flag = false;

                    for (Months months : arrayMonths) {
                        if (months.getNumberOfDays() == numberOfDays5 && numberOfDays5 <= 30) {
                            flag = true;
                        }
                    }

                    if (flag == true) {
                        System.out.println ("Number of days more" + numberOfDays5 + "in the following months:");

                        for (Months months2: arrayMonths) {
                            if (months2.getNumberOfDays ()> numberOfDays5) {
                                System.out.println (months2);
                            }
                        }
                    }

                    if (flag == false)
                        System.out.println ("There are no such months!");

                    break;
                }

                case 6: {
                    System.out.println ("=== Next Season Output Program ===");
                    System.out.println ("Enter the time of year:");
                    String season6 = scanner.next ();

                    boolean flag = false;

                    for (Seasons seasons : arraySeasons) {
                        if (seasons.name().equalsIgnoreCase(season6)) {
                            flag = true;
                        }
                    }

                    if (flag == true) {
                        System.out.println ("Next time of year:");

                        Seasons seasons2 = Seasons.valueOf (firstUpperCase (season6.toLowerCase ()));
                        int i = seasons2.ordinal ();

                        if (i == (arraySeasons.length - 1)) {
                            i = 0;
                            System.out.println (arraySeasons [i]);
                        } else {
                            System.out.println (arraySeasons [i + 1]);
                        }
                    }

                    if (flag == false)
                        System.out.println ("There is no such time of year!");

                    break;
                }

                case 7: {
                    System.out.println ("=== Previous Season Output Program ===");
                    System.out.println ("Enter the time of year:");
                    String season7 = scanner.next ();

                    boolean flag = false;

                    for (Seasons seasons : arraySeasons) {
                        if (seasons.name().equalsIgnoreCase(season7)) {
                            flag = true;
                        }
                    }

                    if (flag == true) {
                        System.out.println ("Previous time of year:");

                        Seasons seasons2 = Seasons.valueOf (firstUpperCase (season7.toLowerCase ()));
                        int i = seasons2.ordinal ();

                        if (i == 0) {
                            i = (arraySeasons.length - 1);
                            System.out.println (arraySeasons [i]);
                        } else {
                            System.out.println (arraySeasons [i - 1]);
                        }
                    }

                    if (flag == false)
                        System.out.println ("There is no such time of year!");

                    break;
                }

                case 8: {
                    System.out.println ("=== Even-numbered months output program ===");
                    for (Months months : arrayMonths) {
                        if (months.getNumberOfDays() % 2 == 0) {
                            System.out.println(months);
                        }
                    }

                    break;
                }

                case 9: {
                    System.out.println ("=== Program for displaying months with an odd number of days ===");

                    for (Months months : arrayMonths) {
                        if (months.getNumberOfDays() % 2 != 0) {
                            System.out.println(months);
                        }
                    }

                    break;
                }

                case 0: {
                    System.out.println ("=== Parity checker for the number of days in the entered month ===");
                    System.out.println ("Enter month:");
                    String month0 = scanner.next ();
                    boolean flag = isMonthExists(arrayMonths, month0);

                    if (flag == true) {
                        Months month = Months.valueOf(firstUpperCase(month0.toLowerCase()));

                        if (month.getNumberOfDays ()% 2 == 0) {
                            System.out.println ("Number of days per month" + month0 + "-" + month.getNumberOfDays ()
                                    + ". This number is even");
                        } else {
                            System.out.println ("Number of days per month" + month0 + "-" + month.getNumberOfDays ()
                                    + ". This number is odd");
                        }
                    }

                    if (flag == false)
                        System.out.println ("There is no such month!");

                    break;
                }


            }

    }

    static boolean isMonthExists(Months[] arrayMonths, String month) {
        boolean flag = false;

        for (Months months : arrayMonths) {
            if (months.name().equalsIgnoreCase(month)) {
                flag = true;
            }
        }

        return flag;
    }

    static String firstUpperCase(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        } else {
            return string.substring(0, 1).toUpperCase() + string.substring(1);
        }
    }

}
