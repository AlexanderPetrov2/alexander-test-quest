import java.util.Scanner;

public class Main {
    public static String calc(String input) {
        Calculator calculator = new Calculator(input);
        return String.valueOf(calculator.calculate());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите уравнение: ");
            String input = scanner.nextLine();
            try {
                String result = calc(input);
                System.out.println("Результат: " + result);
            } catch (RuntimeException e) {
                System.out.println("Ошибка: " + e.getMessage());
                break;
            }
        }
    }
}
