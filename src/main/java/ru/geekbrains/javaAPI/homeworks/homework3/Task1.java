package ru.geekbrains.javaAPI.homeworks.homework3;

import java.util.ArrayList;
import java.util.Random;

import static java.util.Collections.max;
import static java.util.Collections.min;

// Задание
// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение
public class Task1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int size = rnd.nextInt(10, 21);
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(-100, 100));
        }
        System.out.printf("Первоначальный список %s\n", arr);
        removeEvenNumbers(arr);
        findValues(arr);
    }

    static void removeEvenNumbers(ArrayList<Integer> array) {
        int i = 0;
        while (i < array.size()) {
            if (array.get(i) % 2 == 0) {
                array.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.printf("Список с удаленными четными числами %s\n", array);
    }

    static void findValues(ArrayList<Integer> array) {
        int max = max(array);
        int min = min(array);
        int maxItem = array.get(0);
        int minItem = array.get(0);
        int sumItems = 0;
        for (int item : array) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
            sumItems += item;
        }
        float average = (float)sumItems/array.size();
        System.out.printf("Максимальный элемент при помощи max %s\n", max);
        System.out.printf("Максимальный элемент %s\n", maxItem);
        System.out.printf("Минимальный элемент при помощи min %s\n", min);
        System.out.printf("Минимальный элемент %s\n", minItem);
        System.out.printf("Сумма элементов %s\n", sumItems);
        System.out.printf("Среднее арифметическое %s\n", average);
    }
}
