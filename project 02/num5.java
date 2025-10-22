import java.util.Scanner;

public class num5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        
        String[][] questions = {
            {"Столица Франции?", "1. Лондон 2. Берлин 3. Париж", "3"},
            {"Сколько планет в Солнечной системе?", "1. 7 2. 8 3. 9", "2"},
            {"Самое большое млекопитающее?", "1. Слон 2. Синий кит 3. Жираф", "2"},
            {"Химическая формула воды?", "1. CO2 2. H2O 3. O2", "2"},
            {"Автор 'Войны и мира'?", "1. Достоевский 2. Толстой 3. Чехов", "2"},
            {"Год основания Москвы?", "1. 1147 2. 1247 3. 1347", "1"},
            {"Самый большой океан?", "1. Атлантический 2. Индийский 3. Тихий", "3"},
            {"Сколько часов в сутках?", "1. 12 2. 24 3. 36", "2"},
            {"Первый элемент таблицы Менделеева?", "1. Кислород 2. Водород 3. Гелий", "2"},
            {"Сколько континентов на Земле?", "1. 5 2. 6 3. 7", "3"}
        };
        
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Вопрос " + (i + 1) + ": " + questions[i][0]);
            System.out.println(questions[i][1]);
            System.out.print("Ваш ответ: ");
            String answer = scanner.nextLine();
            
            if (answer.equals(questions[i][2])) {
                System.out.println("Правильно!");
                score++;
            } else {
                System.out.println("Неправильно! Правильный ответ: " + questions[i][2]);
            }
            System.out.println();
        }
        
        System.out.println("Викторина завершена! Ваш результат: " + score + "/10");
        scanner.close();
    }
}