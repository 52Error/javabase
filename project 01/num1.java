package project01;

import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число от 1 до 12: ");
        int mounth = input.nextInt();
        if (mounth > 0 || mounth < 13) {
            if (mounth == 2 || mounth == 1 || mounth == 12) {
                System.out.println("Зима");
            }
            if (mounth == 3 || mounth == 4 || mounth == 5) {
                System.out.println("Весна");
            }
            if (mounth == 6 || mounth == 7 || mounth == 8) {
                System.out.println("Лето");
            }
            if (mounth == 9 || mounth == 10 || mounth == 11) {
                System.out.println("Осень");
            }
        }
    }
}
