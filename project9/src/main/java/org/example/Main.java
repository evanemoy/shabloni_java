package org.example;


//Создать приложение, которое выводит какое-то сообщение в консоль.
//Создать Gradle Task, который создает jar-файл приложения, переносит его в
//отдельную папку, в которой хранится Dockerfile для jar, а затем создает Docker
//контейнер из данного jar-файла и запускает его.

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}