import java.util.Random;
import java.util.Scanner;

public class num6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 3;
        
        System.out.println("Я загадал число от 1 до 100. У вас " + attempts + " попытки!");
        
        for (int i = 1; i <= attempts; i++) {
            System.out.print("Попытка " + i + ": ");
            int guess = scanner.nextInt();
            
            if (guess == secretNumber) {
                System.out.println("Поздравляю! Вы угадали число!");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Загаданное число меньше");
            }
            
            if (i == attempts) {
                System.out.println("Попытки закончились! Загаданное число было: " + secretNumber);
            }
        }
        
        scanner.close();
    }
}