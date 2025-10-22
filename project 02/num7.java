import java.util.Scanner;

public class num7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите количество тарелок: ");
        int plates = scanner.nextInt();
        
        System.out.print("Введите количество моющего средства: ");
        double detergent = scanner.nextDouble();
        
        double detergentPerPlate = 0.5;
        
        for (int i = 1; i <= plates; i++) {
            if (detergent >= detergentPerPlate) {
                detergent -= detergentPerPlate;
                System.out.printf("Помыта тарелка %d. Осталось средства: %.2f%n", i, detergent);
            } else {
                System.out.println("Средство закончилось! Не могу помыть тарелку " + i);
                break;
            }
        }
        
        System.out.printf("Работа завершена. Осталось средства: %.2f%n", detergent);
        scanner.close();
    }
}
