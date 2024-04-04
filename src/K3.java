import java.util.Scanner;

public class K3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть загальну вагу, яку може зберігати склад: ");
        int maxWeight = scanner.nextInt();
        int currentWeight = 0;

        System.out.println("На складі доступно " + maxWeight + " кг металу.");

        while (currentWeight < maxWeight) {
            System.out.print("Введіть вагу металу, яку хочете здати на склад: ");
            int metalWeight = scanner.nextInt();

            if (metalWeight < 5) {
                System.out.println("Метал, що важить менше 5 кг не приймається.");
                continue;
            }

            if (currentWeight + metalWeight > maxWeight) {
                System.out.println("На складі недостатньо місця.");
                continue;
            }

            currentWeight += metalWeight;
            System.out.println("Метал прийнято. Залишилося місця: " + (maxWeight - currentWeight) + " кг.");
        }

        System.out.println("Склад заповнений.");
    }
}