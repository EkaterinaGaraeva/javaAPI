package ru.geekbrains.javaAPI.homeworks.homework2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// 4) К калькулятору из предыдущего ДЗ добавить логирование.
public class Task4{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean f = true;
        File file = new File("src/main/java/ru/geekbrains/javaAPI/homeworks/homework2/jsonTask4.json");
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
                StringBuilder sb = new StringBuilder("");
                switch (operation) {
                    case "+" -> System.out.println(addition(number1, number2, file, sb));
                    case "-" -> System.out.println(subtraction(number1, number2, file, sb));
                    case "*" -> System.out.println(multiplication(number1, number2, file, sb));
                    case "/" -> System.out.println(division(number1, number2, file, sb));
                    default -> System.out.println("Некорректная операция");
                }
            }
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
