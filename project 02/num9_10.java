import java.util.Scanner;

public class num9_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] dailyExpenses = new double[7];
        String[] days = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        
        boolean running = true;
        
        while (running) {
            System.out.println("\n=== Финансовое приложение ===");
            System.out.println("1. Внести расходы за день");
            System.out.println("2. Показать общую сумму расходов");
            System.out.println("3. Конвертировать в доллары");
            System.out.println("4. Конвертировать в евро");
            System.out.println("5. Выход");
            System.out.print("Выберите опцию: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    enterExpenses(scanner, dailyExpenses, days);
                    break;
                case 2:
                    showTotalExpenses(dailyExpenses, days);
                    break;
                case 3:
                    convertToDollars(dailyExpenses);
                    break;
                case 4:
                    convertToEuros(dailyExpenses);
                    break;
                case 5:
                    running = false;
                    System.out.println("Выход из приложения.");
                    break;
                default:
                    System.out.println("Неверный выбор!");
            }
        }
        
        scanner.close();
    }
    
    public static void enterExpenses(Scanner scanner, double[] expenses, String[] days) {
        System.out.println("\nВыберите день недели:");
        for (int i = 0; i < days.length; i++) {
            System.out.println((i + 1) + ". " + days[i]);
        }
        
        System.out.print("Ваш выбор: ");
        int dayChoice = scanner.nextInt() - 1;
        
        if (dayChoice >= 0 && dayChoice < days.length) {
            System.out.print("Введите расходы за " + days[dayChoice] + ": ");
            expenses[dayChoice] = scanner.nextDouble();
            System.out.println("Расходы за " + days[dayChoice] + " сохранены!");
        } else {
            System.out.println("Неверный выбор дня!");
        }
    }
    
    public static void showTotalExpenses(double[] expenses, String[] days) {
        double total = 0;
        System.out.println("\n=== Расходы за неделю ===");
        
        for (int i = 0; i < expenses.length; i++) {
            System.out.println(days[i] + ": " + expenses[i] + " SEK");
            total += expenses[i];
        }
        
        System.out.println("Общая сумма расходов: " + total + " SEK");
    }
    
    public static void convertToDollars(double[] expenses) {
        final double USD_RATE = 0.095; // Пример курса
        double total = getTotalExpenses(expenses);
        double inDollars = total * USD_RATE;
        System.out.printf("Общие расходы: %.2f SEK = %.2f USD%n", total, inDollars);
    }
    
    public static void convertToEuros(double[] expenses) {
        final double EUR_RATE = 0.087; // Пример курса
        double total = getTotalExpenses(expenses);
        double inEuros = total * EUR_RATE;
        System.out.printf("Общие расходы: %.2f SEK = %.2f EUR%n", total, inEuros);
    }
    
    public static double getTotalExpenses(double[] expenses) {
        double total = 0;
        for (double expense : expenses) {
            total += expense;
        }
        return total;
    }
}