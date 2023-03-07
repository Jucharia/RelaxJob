package ru.netology.javaqa.javaqamvn.services;

public class Main {
    public static void main(String[] args) {
        int income = 90_000;
        int expenses = 30_000;
        int threshold = 140000;
        RestWorkService service = new RestWorkService();
        int answer = service.calculate(90_000, 30_000, 140_000);
        System.out.println(answer);
    }
}