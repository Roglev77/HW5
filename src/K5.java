import java.util.Random;
import java.util.Scanner;

public class K5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Масив: " + java.util.Arrays.toString(array));

        System.out.print("Введіть число: ");
        int number = scanner.nextInt();

        boolean isFound = false;
        for (int num : array) {
            if (num == number) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("Число " + number + " є у масиві.");
        } else {
            System.out.println("Числа " + number + " немає у масиві.");
        }
    }
}