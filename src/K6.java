import java.util.Arrays;
import java.util.Random;

public class K6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayRandom = new int[45];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = random.nextInt(101) - 50;
        }

        System.out.println("Масив довільних чисел: " + Arrays.toString(arrayRandom));

        int min = arrayRandom[0];
        int max = arrayRandom[0];

        for (int i = 1; i < arrayRandom.length; i++) {
            if (arrayRandom[i] < min) {
                min = arrayRandom[i];
            }
            if (arrayRandom[i] > max) {
                max = arrayRandom[i];
            }
        }

        System.out.println("Мінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);
    }
}