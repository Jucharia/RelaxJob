package ru.netology.javaqa.javaqamvn.services;

public class RestWorkService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0;// количество денег на счету
        int addExpenses = 3;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / addExpenses;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
