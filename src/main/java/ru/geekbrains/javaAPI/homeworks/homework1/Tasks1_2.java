package ru.geekbrains.javaAPI.homeworks.homework1;

import java.util.Scanner;

public class Tasks1_2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean f = true;
        while (f) {
            System.out.println("Укажите номер задачи: ");
            System.out.println("1 - Задача 1");
            System.out.println("2 - Задача 2");
            System.out.println("0 - Завершение работы приложения");

            int no = Integer.parseInt(scanner.nextLine());

            switch (no) {
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 0:
                    System.out.println("Завершение работы");
                    f = false;
                    break;
                default:
                    System.out.println("Некорректный номер задачи");
                    break;
            }
        }
    }

//    1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    static void task1() {
        System.out.print("Введите число: ");
        int number = Integer.parseInt(scanner.nextLine());
//        int triangularNumber = 0;
//        int factorial = 1;
//        for (int i = 0; i <= number; i++) {
//            triangularNumber += i;
//        }
        System.out.printf("Треугольное число Tn = %d\n", triangularNumber(number));
//        for (int j = 1; j <= number; j++) {
//            factorial *= j;
//        }
        System.out.printf("Факториал числа n! = %d\n", factorial(number));
    }

    static Integer triangularNumber(int num) {
        int trNumber = num;
        if (num == 0) {
            return trNumber;
        } else {
            return trNumber + triangularNumber(--num);
        }
    }

    static Integer factorial(int num) {
        int fact = num;
        if (num == 1) {
            return fact;
        } else {
            return fact * factorial(--num);
        }
    }

//    2) Вывести все простые числа от 1 до 1000
    static void task2() {
        for (int i = 2; i < 1000; i++) {
            boolean f = true;
            for (int j = 2; j < i/2; j++) {
                if (i % j == 0) {
                    f = false;
                    break;
                }
            }
            if (f) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println();
    }
}
