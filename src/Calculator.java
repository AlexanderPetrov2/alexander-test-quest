import java.util.Scanner;

class Calculator {
    int num1;
    int num2;
    char operation;

    Calculator(String input) {
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            throw new RuntimeException("Неверный формат");
        }
        try {
            num1 = Integer.parseInt(parts[0]);
            num2 = Integer.parseInt(parts[2]);
            operation = parts[1].charAt(0);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Неверный формат чисел");
        }
        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
            throw new RuntimeException("Введите числа от 1 до 10");
        }
    }

    int calculate() {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                throw new RuntimeException("Неверная операция");
        }
    }
}