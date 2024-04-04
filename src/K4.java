import java.util.Scanner;

public class K4 {
    public static void main(String[] args) {
        String[] names = {"Петя", "Маша", "Олена", "Федя", "Саша", "Антон", "Гліб"};
        int[] times = {10, 12, 14, 16, 18, 20};
        String[] places = {"школу", "магазин", "церкву", "тренажерний зал", "кіно", "поліклініку"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть індекси елементів:");

        int nameIndex = scanner.nextInt();
        int timeIndex = scanner.nextInt();
        int placeIndex = scanner.nextInt();

        if (nameIndex >= 0 && nameIndex < names.length &&
                timeIndex >= 0 && timeIndex < times.length &&
                placeIndex >= 0 && placeIndex < places.length) {

            String name = names[nameIndex];
            int time = times[timeIndex];
            String place = places[placeIndex];

            System.out.println(name + " буде йти в " + place + " о " + time + " годині.");
        } else {
            System.out.println("Неправильний індекс.");
        }
    }
}