package project01;

import java.util.Scanner;

public class num6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество торпед");
        int n = scanner.nextInt();
        System.out.println("Введите вероятность попадания торпед: ");
        double p = scanner.nextDouble();
        System.out.println("Введите вероятность затопления корабля: ");
        double p1 = scanner.nextDouble();
        double q = (1 - p) * (1 - p1);
        double probability;
        if (q == 1) {
            probability = p * p1 * n;
        } else {
            probability = p * p1 * ((1 - Math.pow(q, n)) / (1 - q));
        }
        System.out.println("Вероятность затопления корабля и подводной лодки: " + probability);
        System.out.println("В процентах: " + probability * 100);
    }
}
