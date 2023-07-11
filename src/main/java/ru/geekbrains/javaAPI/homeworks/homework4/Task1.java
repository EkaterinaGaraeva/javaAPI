package ru.geekbrains.javaAPI.homeworks.homework4;

import java.util.LinkedList;
import java.util.Random;

//1. Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.
public class Task1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        LinkedList<Integer> linkedList = new LinkedList<>();
        int size = rnd.nextInt(5, 11);
        for (int i = 0; i < size; i++) {
            linkedList.add(rnd.nextInt(-100, 100));
        }
        System.out.printf("Первоначальный список %s\n", linkedList);
        for (int j = size - 1; j >= 0; j--) {
            linkedList.addLast(linkedList.remove(j));
        }
        System.out.printf("Перевернутый список %s\n", linkedList);
    }
}
