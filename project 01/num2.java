package project01;

import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = input.nextInt();
        if (age < 0) {
            if (age <= 7) {
                System.out.println("Вот вам детский билет");
            } else if (age <= 17){
                System.out.println("Вот вам подростковый билет");

            } else if (age <= 61){
                System.out.println("Вот вам взрослый билет");

            } else {
                System.out.println("Вот вам пенсионный билет");
            }
        }
    }
}
