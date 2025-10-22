public class num2 {
    public static void main(String[] args) {
        int totalFloors = 10;
        int apartmentsPerFloor = 5;

        for (int floor = 1; floor <= totalFloors; floor++) {
            for (int apartment = 1; apartment <= apartmentsPerFloor; apartment++) {
                System.out.println("Floor " + floor + ", apartment: " + apartment + " - Document_ascertainment!");
            }
        }
    }
}