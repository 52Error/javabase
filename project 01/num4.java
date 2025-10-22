package project01;

public class num4 {
    public static void main(String[] args) {
        double initial = 20.0; // начальная скорость
        double time = 2.0; // время
        final double Gravity = 9.81; // ускорение свободного паления

        double height = initial * time - (Gravity * time * time)/2; // расчитываем высоту исходя из формул по физике
        System.out.println("Начальная скорость: " + initial + "м/с");
        System.out.println("Время: " + time + "c");
        System.out.println("Ускорение свободного падения: " + Gravity + "м/с2");
        System.out.println("Высота: " + height + "м");
    }
}
