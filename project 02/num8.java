
import java.util.ArrayList;
import java.util.Scanner;

public class num8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> movies = new ArrayList<>();
        final int MAX_MOVIES = 30;
        
        System.out.println("Введите фильмы для просмотра (максимум " + MAX_MOVIES + "). " +
                         "Для завершения введите 'выход'");
        
        while (movies.size() < MAX_MOVIES) {
            System.out.print("Фильм " + (movies.size() + 1) + ": ");
            String movie = scanner.nextLine();
            
            if (movie.equalsIgnoreCase("выход")) {
                break;
            }
            
            movies.add(movie);
        }
        
        System.out.println("\nВаш список фильмов для просмотра:");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println((i + 1) + ". " + movies.get(i));
        }
        
        System.out.println("Всего фильмов: " + movies.size());
        scanner.close();
    }
}