import java.util.Random;

public class num1 {
    public static void main(String[] args) {
        Random random = new Random();
        int colorNumber = random.nextInt(3); // 0, 1 или 2
        
        System.out.print("Светофор показывает: ");
        
        switch (colorNumber) {
            case 0:
                System.out.println("Красный цвет");
                break;
            case 1:
                System.out.println("Зеленый цвет");
                break;
            case 2:
                System.out.println("Желтый цвет");
                break;
            default:
                System.out.println("Неизвестный цвет");
    
    
        }
    }
}