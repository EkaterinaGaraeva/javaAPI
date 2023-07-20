package ru.geekbrains.javaAPI.homeworks.homework5;

import java.util.HashMap;
import java.util.List;

// Задание
//
// Написать простой класс Телефонный Справочник (с помощью HashMap),
// который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add()
// можно добавлять записи, а с помощью метода get()
// искать номер телефона по фамилии.
// Следует учесть, что под одной фамилией может быть несколько
// телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.
//
// ***Желательно не добавлять лишний функционал (дополнительные поля
// (имя, отчество, адрес),
// взаимодействие с пользователем через консоль и т.д).
// Консоль использовать только для вывода результатов проверки
// телефонного справочника.
public class Task1_1 {
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Иванов");
    }

    public static void addInPhoneBook() {
        phoneBook.put("Иванов", List.of("+7(000)000-00-00", "+7(111)111-11-11"));
        phoneBook.put("Петров", List.of("+7(222)222-22-22", "+7(333)333-33-33"));
        phoneBook.put("Белов", List.of("+7(444)444-44-44", "+7(555)555-55-55"));
        phoneBook.put("Светлова", List.of("+7(666)666-66-66", "+7(777)777-77-77"));
    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}
