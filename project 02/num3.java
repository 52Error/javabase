import java.util.Scanner;

public class num3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите ваш вес в кг: ");
        double weight = scanner.nextDouble();
        
        System.out.print("Введите ваш рост в метрах: ");
        double height = scanner.nextDouble();
        
        double bmi = weight / (height * height);
        
        System.out.printf("Ваш ИМТ: %.2f%n", bmi);
        
        if (bmi <= 16) {
            System.out.println("Выраженный дефицит массы тела");
        } else if (bmi <= 18.5) {
            System.out.println("Дефицит массы тела");
        } else if (bmi <= 25) {
            System.out.println("Норма");
        } else if (bmi <= 30) {
            System.out.println("Избыточная масса тела (предожирение)");
        } else if (bmi <= 35) {
            System.out.println("Ожирение 1-й степени");
        } else if (bmi <= 40) {
            System.out.println("Ожирение 2-й степени");
        } else {
            System.out.println("Ожирение 3-й степени");
        }
        
        scanner.close();
    }
}