package students.tatjana_topcilina.lesson4.level2.task6;

import java.util.Scanner;

public class TwoNumbers2 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please, enter first number");
            int number1 = scan.nextInt();
            System.out.println("Please, enter second number");
            int number2 = scan.nextInt();

            if (number1 > number2) {
                System.out.println("The smaller number is" + number2);
            }
            if (number2 > number1) {
                System.out.println("The smaller number is" + number1);
            }

        }
    }
