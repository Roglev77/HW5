import java.util.Scanner;

public class K1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = "";

        System.out.println("Введіть слова. Щоб завершити, введіть STOP.");

        while (true) {
            String word = scanner.next();
            if (word.equalsIgnoreCase("STOP")) {
                break;
            }
            words += word + " ";
        }

        System.out.println("Пропозиція: " + words.toString());
    }
}