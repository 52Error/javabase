package project01;

import java.util.Scanner;

public class num5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double GRAVITY = 9.81;
        System.out.println("Введите нчальную скорость (м/с): ");
        double initial = scanner.nextDouble();
        System.out.println("Введите угол броска (градусы): ");
        double angle = scanner.nextDouble();
        //Преревод угла из градусов в радианы
        double angleRad = Math.toRadians(angle);
        //расчёт времени полёта
        double flightTime = (2 * initial * Math.sin(angleRad)) / GRAVITY;
        System.out.println("Время полёта тела: " + flightTime);
        System.out.println("Введите момент времени для расчёта координат: ");
        double time = scanner.nextDouble();
        if (time > flightTime){
            System.out.println("время превышает время полёта");
        } else {
            double x = initial * Math.cos(angleRad) * time;
            double y = initial * Math.sin(angleRad) * time - (GRAVITY * time * time)/2;
            System.out.println("Координаты тела: ");
            System.out.println("По x: " + x);
            System.out.println("По y: " + y);
        }

    }
}
