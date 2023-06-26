package ru.geekbrains.javaAPI.homeworks.homework1;
import java.util.Scanner;

//3) Реализовать простой калькулятор
public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean f = true;
        while (f) {
            System.out.println("Введите операцию (+ - * /) для вычисления или q для выхода: ");
            String operation = scanner.nextLine();
            if (operation.equals("q")) {
                System.out.println("Завершение работы");
                f = false;
            } else {
                System.out.println("Введите первое число: ");
                int number1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Введите второе число: ");
                int number2 = Integer.parseInt(scanner.nextLine());
                switch (operation) {
                    case "+" -> addition(number1, number2);
                    case "-" -> subtraction(number1, number2);
                    case "*" -> multiplication(number1, number2);
                    case "/" -> division(number1, number2);
                    default -> System.out.println("Некорректная операция");
                }
            }
        }
    }

    static void addition(int num1, int num2) {
        System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
    }

    static void subtraction(int num1, int num2) {
        System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
    }

    static void multiplication(int num1, int num2) {
        System.out.printf("%d * %d = %d\n", num1, num2, num1*num2);
    }

    static void division(int num1, int num2) {
        System.out.printf("%d / %d = %.2f\n", num1, num2, (float)num1/(float)num2);
    }
}
