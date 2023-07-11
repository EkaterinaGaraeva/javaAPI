package ru.geekbrains.javaAPI.homeworks.homework4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

// 3. В калькулятор (урок 1 и 2) добавьте возможность отменить последнюю операцию.
public class Task3 {
    static Scanner scanner = new Scanner(System.in);
    static Stack<int[]> stackOfNumbers = new Stack<>();
    static Stack<String> stackOfOperations = new Stack<>();

    public static void main(String[] args) {
        boolean f = true;
        File file = new File("src/main/java/ru/geekbrains/javaAPI/homeworks/homework2/jsonTask4.json");
        while (f) {
            System.out.println("Введите операцию (+ - * /) для вычисления, q для выхода или d для отмены последней операции: ");
            String operation = scanner.nextLine();
            if (operation.equals("q")) {
                System.out.println("Завершение работы");
                f = false;
            } else if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
                stackOfOperations.add(operation);
                System.out.println("Введите первое число: ");
                int number1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Введите второе число: ");
                int number2 = Integer.parseInt(scanner.nextLine());
                int[] numbers = {number1, number2};
                stackOfNumbers.add(numbers);
//                for (int[] num : stackOfNumbers) {
//                    System.out.printf("%d, %d\n", num[0], num[1]);
//                }
                menu(operation, number1, number2, file);
            } else if (operation.equals("d")) {
                stackOfNumbers.pop();
                stackOfOperations.pop();
                menu(stackOfOperations.peek(), stackOfNumbers.peek()[0], stackOfNumbers.peek()[1], file);
            } else {
                System.out.println("Некорректная операция");
            }
        }
    }

    static void menu (String operation, int num1, int num2, File file) {
        StringBuilder sb = new StringBuilder("");
        switch (operation) {
            case "+" -> System.out.println(addition(num1, num2, file, sb));
            case "-" -> System.out.println(subtraction(num1, num2, file, sb));
            case "*" -> System.out.println(multiplication(num1, num2, file, sb));
            case "/" -> System.out.println(division(num1, num2, file, sb));
            default -> System.out.println("Некорректная операция");
        }
    }

    static String addition(int num1, int num2, File file, StringBuilder sb) {
//        System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
        sb.append(num1);
        sb.append(" + ");
        sb.append(num2);
        sb.append(" = ");
        sb.append(num1 + num2);
        sb.append("\n");
        String str = sb.toString();
        log(str, file);
        return str;
    }

    static String subtraction(int num1, int num2, File file, StringBuilder sb) {
//        System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
        sb.append(num1);
        sb.append(" - ");
        sb.append(num2);
        sb.append(" = ");
        sb.append(num1 - num2);
        sb.append("\n");
        String str = sb.toString();
        log(str, file);
        return str;
    }

    static String multiplication(int num1, int num2, File file, StringBuilder sb) {
//        System.out.printf("%d * %d = %d\n", num1, num2, num1*num2);
        sb.append(num1);
        sb.append(" * ");
        sb.append(num2);
        sb.append(" = ");
        sb.append(num1 * num2);
        sb.append("\n");
        String str = sb.toString();
        log(str, file);
        return str;
    }

    static String division(int num1, int num2, File file, StringBuilder sb) {
//        System.out.printf("%d / %d = %.2f\n", num1, num2, (float)num1/(float)num2);
        sb.append(num1);
        sb.append(" / ");
        sb.append(num2);
        sb.append(" = ");
        sb.append(num1 / num2);
        sb.append("\n");
        String str = sb.toString();
        log(str, file);
        return str;
    }

    static void log(String str, File file) {
        try (FileWriter wr = new FileWriter(file, true)) {
            wr.write(str);
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
}
