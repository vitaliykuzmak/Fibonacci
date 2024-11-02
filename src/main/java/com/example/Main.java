package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n = 6;  // Змінюйте значення, щоб перевірити інші числа Фібоначчі

        System.out.println("Ітераційний метод: " + Fibonacci.fibonacciIterative(n));
        System.out.println("Рекурсивний метод: " + Fibonacci.fibonacciRecursive(n));
        System.out.println("Метод динамічного програмування: " + Fibonacci.fibonacciDP(n));
    }
}
