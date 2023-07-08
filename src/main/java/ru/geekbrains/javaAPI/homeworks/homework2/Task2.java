package ru.geekbrains.javaAPI.homeworks.homework2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// 2) Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.
public class Task2 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 2};
        printArray(arr);
        File file = new File("src/main/java/ru/geekbrains/javaAPI/homeworks/homework2/jsonTask2.json");
        for (int i = arr.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            printArray(arr);
            writeJson(arr, file);
        }
        printArray(arr);
    }

    static void printArray(int[] array) {
        for (int a : array) {
            System.out.printf("%d ", a);
        }
        System.out.println();
    }

    static void writeJson(int[] array, File file) {
        StringBuilder sb = new StringBuilder("");
        for (int a : array) {
            sb.append(a);
            sb.append(" ");
        }
        sb.append("\n");
        String str = sb.toString();
        try (FileWriter wr = new FileWriter(file, true)) {
            wr.write(str);
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
}
