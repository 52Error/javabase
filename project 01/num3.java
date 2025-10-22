package project01;

public class num3 {
    public static void main(String[] args) {
        int score = (int)(Math.random()*100) + 1;
        if (score >= 90) {
            System.out.println("Отлично");
        } else if (score >= 60) {
            System.out.println("Хорошо");
        } else if (score >= 40) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }
}
