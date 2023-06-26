package ru.geekbrains.javaAPI.homeworks.homework1;
import java.util.Scanner;

//4) (дополнительное задание) Задано уравнение вида q + w = e,
// q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса,
// например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
public class Task4 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите уравнение вида q + w = e (q, w, e >= 0)");
        System.out.println("Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69");
        System.out.print("-> ");
        String equation = scanner.nextLine();
        equation = equation.replace("+ ", "");
        equation = equation.replace("= ", "");
//        System.out.println(equation);
        String[] equationArr = equation.split(" ");
        String q = equationArr[0];
//        System.out.println(q);
        String w = equationArr[1];
//        System.out.println(w);
        String e = equationArr[2];
//        System.out.println(e);
        int count = q.length() - q.replace("?", "").length() + w.length() - w.replace("?", "").length() +
                + e.length() - e.replace("?", "").length();
//        System.out.println(count);
        switch (count) {
            case 1:
                if (q.indexOf("?") == 0) {
                    int b = Character.getNumericValue(q.charAt(1));
                    int c = Character.getNumericValue(w.charAt(0));
                    int d = Character.getNumericValue(w.charAt(1));
                    int f = Character.getNumericValue(e.charAt(0));
                    int g = Character.getNumericValue(e.charAt(1));
                    int a = (f * 10 + g - c * 10 - d - b) / 10;
                    System.out.printf("%d%d + %d%d = %d%d\n", a, b, c, d, f, g);
                } else if (q.indexOf("?") == 1) {
                    int a = Character.getNumericValue(q.charAt(0));
                    int c = Character.getNumericValue(w.charAt(0));
                    int d = Character.getNumericValue(w.charAt(1));
                    int f = Character.getNumericValue(e.charAt(0));
                    int g = Character.getNumericValue(e.charAt(1));
                    int b = f * 10 + g - a * 10 - c * 10 - d;
                    System.out.printf("%d%d + %d%d = %d%d\n", a, b, c, d, f, g);
                } else if (w.indexOf("?") == 0) {
                    int a = Character.getNumericValue(q.charAt(0));
                    int b = Character.getNumericValue(q.charAt(1));
                    int d = Character.getNumericValue(w.charAt(1));
                    int f = Character.getNumericValue(e.charAt(0));
                    int g = Character.getNumericValue(e.charAt(1));
                    int c = (f * 10 + g - a * 10 - b - d) / 10;
                    System.out.printf("%d%d + %d%d = %d%d\n", a, b, c, d, f, g);
                } else if (w.indexOf("?") == 1) {
                    int a = Character.getNumericValue(q.charAt(0));
                    int b = Character.getNumericValue(q.charAt(1));
                    int c = Character.getNumericValue(w.charAt(0));
                    int f = Character.getNumericValue(e.charAt(0));
                    int g = Character.getNumericValue(e.charAt(1));
                    int d = f * 10 + g - a * 10 - b - c * 10;
                    System.out.printf("%d%d + %d%d = %d%d\n", a, b, c, d, f, g);
                } else if (e.indexOf("?") == 0) {
                    int a = Character.getNumericValue(q.charAt(0));
                    int b = Character.getNumericValue(q.charAt(1));
                    int c = Character.getNumericValue(w.charAt(0));
                    int d = Character.getNumericValue(w.charAt(1));
                    int g = Character.getNumericValue(e.charAt(1));
                    int f = (a * 10 + b + c * 10 +d - g) / 10;
                    System.out.printf("%d%d + %d%d = %d%d\n", a, b, c, d, f, g);
                } else if (e.indexOf("?") == 1) {
                    int a = Character.getNumericValue(q.charAt(0));
                    int b = Character.getNumericValue(q.charAt(1));
                    int c = Character.getNumericValue(w.charAt(0));
                    int d = Character.getNumericValue(w.charAt(1));
                    int f = Character.getNumericValue(e.charAt(0));
                    int g = a * 10 + b + c * 10 + d - f * 10;
                    System.out.printf("%d%d + %d%d = %d%d\n", a, b, c, d, f, g);
                } else {
                    System.out.println("Решений нет");
                }
                break;
            case 2:
                if ((q.indexOf("?") == 0) && (w.indexOf("?") == 1) && (!e.contains("?"))) {
                    int b = Character.getNumericValue(q.charAt(1));
                    int c = Character.getNumericValue(w.charAt(0));
                    int f = Character.getNumericValue(e.charAt(0));
                    int g = Character.getNumericValue(e.charAt(1));
                    int a = ((f * 10 + g) - (c * 10 + b)) / 10;
                    int d = ((f * 10 + g) - (c * 10 + b)) % 10;
                    System.out.printf("%d%d + %d%d = %d%d\n", a, b, c, d, f, g);
                } else if ((q.indexOf("?") == 1) && (w.indexOf("?") == 0) && (!e.contains("?"))) {
                    int a = Character.getNumericValue(q.charAt(0));
                    int d = Character.getNumericValue(w.charAt(1));
                    int f = Character.getNumericValue(e.charAt(0));
                    int g = Character.getNumericValue(e.charAt(1));
                    int b = ((f * 10 + g) - (a * 10 + d)) / 10;
                    int c = ((f * 10 + g) - (a * 10 + d)) % 10;
                    System.out.printf("%d%d + %d%d = %d%d\n", a, b, c, d, f, g);
                } else if ((q.indexOf("?") == 0) && (!w.contains("?")) && (e.indexOf("?") == 1)) {
                    int b = Character.getNumericValue(q.charAt(1));
                    int c = Character.getNumericValue(w.charAt(0));
                    int d = Character.getNumericValue(w.charAt(1));
                    int f = Character.getNumericValue(e.charAt(0));
                    int a = (f - c) - (b + d) / 10;
                    int g = (b + d) % 10;
                    System.out.printf("%d%d + %d%d = %d%d\n", a, b, c, d, f, g);
                } else if ((q.indexOf("?") == 1) && (!w.contains("?")) && (e.indexOf("?") == 0)) {
                    int a = Character.getNumericValue(q.charAt(0));
                    int c = Character.getNumericValue(w.charAt(0));
                    int d = Character.getNumericValue(w.charAt(1));
                    int g = Character.getNumericValue(e.charAt(1));
                    int f = 0;
                    int b = 0;
                    if (g < d) {
                        f = a + c - 1;
                        b = g + 10 - d;
                    } else {
                        f = a + c;
                        b = g - d;
                    }
                    System.out.printf("%d%d + %d%d = %d%d\n", a, b, c, d, f, g);
                } else if ((!q.contains("?")) && (w.indexOf("?") == 0) && (e.indexOf("?") == 1)) {
                    int a = Character.getNumericValue(q.charAt(0));
                    int b = Character.getNumericValue(q.charAt(1));
                    int d = Character.getNumericValue(w.charAt(1));
                    int f = Character.getNumericValue(e.charAt(0));
                    int c = (f - a) - (b + d) / 10;
                    int g = (b + d) % 10;
                    System.out.printf("%d%d + %d%d = %d%d\n", a, b, c, d, f, g);
                } else if ((!q.contains("?")) && (w.indexOf("?") == 1) && (e.indexOf("?") == 0)) {
                    int a = Character.getNumericValue(q.charAt(0));
                    int b = Character.getNumericValue(q.charAt(1));
                    int c = Character.getNumericValue(w.charAt(0));
                    int g = Character.getNumericValue(e.charAt(1));
                    int f = 0;
                    int d = 0;
                    if (g < b) {
                        f = a + c - 1;
                        d = g + 10 - b;
                    } else {
                        f = a + c;
                        d = g - b;
                    }
                    System.out.printf("%d%d + %d%d = %d%d\n", a, b, c, d, f, g);
                } else if ((q.indexOf("?") == 0) && (q.indexOf("?", 1) == 1) && (!w.contains("?")) && (!e.contains("?"))) {
                    int c = Character.getNumericValue(w.charAt(0));
                    int d = Character.getNumericValue(w.charAt(1));
                    int f = Character.getNumericValue(e.charAt(0));
                    int g = Character.getNumericValue(e.charAt(1));
                    int a = ((f * 10 + g) - (c * 10 + d)) / 10;
                    int b = ((f * 10 + g) - (c * 10 + d)) % 10;
                    System.out.printf("%d%d + %d%d = %d%d\n", a, b, c, d, f, g);
                } else if ((!q.contains("?")) && (w.indexOf("?") == 0) && (w.indexOf("?", 1) == 1) && (!e.contains("?"))) {
                    int a = Character.getNumericValue(q.charAt(0));
                    int b = Character.getNumericValue(q.charAt(1));
                    int f = Character.getNumericValue(e.charAt(0));
                    int g = Character.getNumericValue(e.charAt(1));
                    int c = ((f * 10 + g) - (a * 10 + b)) / 10;
                    int d = ((f * 10 + g) - (a * 10 + b)) % 10;
                    System.out.printf("%d%d + %d%d = %d%d\n", a, b, c, d, f, g);
                } else if ((!q.contains("?")) && (!w.contains("?")) && (e.indexOf("?") == 0) && (e.indexOf("?", 1) == 1)) {
                    int a = Character.getNumericValue(q.charAt(0));
                    int b = Character.getNumericValue(q.charAt(1));
                    int c = Character.getNumericValue(w.charAt(0));
                    int d = Character.getNumericValue(w.charAt(1));
                    int f = ((a * 10 + b) + (c * 10 + d)) / 10;
                    int g = ((a * 10 + b) + (c * 10 + d)) % 10;
                    System.out.printf("%d%d + %d%d = %d%d\n", a, b, c, d, f, g);
                } else {
                    System.out.println("Решений нет");
                }
                break;
            case 3:
                System.out.println("Решений нет");
                break;
        }
    }
}
