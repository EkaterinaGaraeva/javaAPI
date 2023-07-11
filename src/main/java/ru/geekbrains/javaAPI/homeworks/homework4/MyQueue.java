package ru.geekbrains.javaAPI.homeworks.homework4;

import java.util.LinkedList;

// 2 *. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
// Это задание повышенной сложности, для решения задачи потребуется
// создать класс-обертку над LinkedList, например:
//
// class MyQueue {
//    private LinkedList elements = new LinkedList();
//
//    public MyQueue() { }
//    public MyQueue(LinkedList linkedList) {
//        this.elements = linkedList;
//    }
//
//        .........
//
// }
class MyQueue {
    private LinkedList elements = new LinkedList();

    public MyQueue() { }
    public MyQueue(LinkedList linkedList) {
        this.elements = linkedList;
    }

    public void enqueue(Integer integer) {
        elements.addLast(integer);
    }

    public void enqueue(String string) {
        elements.addLast(string);
    }

    public Object dequeue() {
        return elements.pollFirst();
    }

    public Object first() {
        return elements.peekFirst();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Object element : elements) {
            sb.append(element);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(5);
        myQueue.enqueue(15);
        myQueue.enqueue(25);
        myQueue.enqueue(35);
        System.out.printf("Первоначальная очередь: %s\n", myQueue);
        System.out.printf("Первый элемент: %s\n", myQueue.first());
        System.out.printf("Первый элемент с удалением: %s\n", myQueue.dequeue());
        System.out.printf("Очередь после удаления элемента: %s\n", myQueue);
        System.out.printf("Первый элемент: %s\n", myQueue.first());
        System.out.printf("Первый элемент с удалением: %s\n", myQueue.dequeue());
        System.out.printf("Очередь после удаления элемента: %s\n", myQueue);
    }
}
