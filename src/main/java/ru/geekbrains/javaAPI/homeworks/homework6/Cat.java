package ru.geekbrains.javaAPI.homeworks.homework6;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//Задание
//Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
// Поместите в него некоторое количество объектов.
//Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
// Убедитесь, что все они сохранились во множество.
//Создайте метод
//public boolean equals(Object o)
//Пропишите в нём логику сравнения котов по параметрам, хранимым в полях.
// То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
//Создайте метод
//public int hashCode()
//который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
//Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
public class Cat {
    private int id;
    private int age;
    private int weight;
    private String name;
    private String color;

    public Cat(int id, int age, int weight, String name, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return id == cat.id && age == cat.age && weight == cat.weight && Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, weight, name, color);
    }

    @Override
    public String toString() {
        return "Cat {" +
                "id=" + id +
                ", age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat(1, 2, 4, "Barsik", "gray"));
        cats.add(new Cat(1, 2, 4, "Barsik", "gray"));
        cats.add(new Cat(2, 3, 5, "Umka", "white"));
        cats.add(new Cat(3, 1, 3, "Murzik", "black"));
        cats.add(new Cat(3, 1, 3, "Murzik", "black"));
        System.out.println("HashSet");
        for (Cat i : cats) {
            System.out.println(i);
        }
    }
}
