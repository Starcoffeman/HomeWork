package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1: Четное или нечетное число
        System.out.println("Введите целое число:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }

        System.out.println("Введите три целых числа:");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int minimum = Math.min(firstNumber, Math.min(secondNumber, thirdNumber));
        System.out.println("Минимальное: " + minimum);

        // Задача 3: Таблица умножения на 5
        System.out.println("Таблица умножения на 5 :");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        // Задача 4: Сумма чисел от 1 до N
        System.out.println("Введите число N :");
        int n = scanner.nextInt();
        int sum = n * (n + 1) / 2;
        System.out.println("Сумма от 1 до N: " + sum);

        // Задача 5: Число Фибоначчи
        System.out.println("Введите число N :");
        n = scanner.nextInt();
        System.out.println("Первые N чисел Фибоначчи:");
        int firstFibonacci = 0;
        int secondFibonacci = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(firstFibonacci + " ");
            int nextFibonacci = firstFibonacci + secondFibonacci;
            firstFibonacci = secondFibonacci;
            secondFibonacci = nextFibonacci;
        }
        System.out.println();

        // Задача 6: Проверка простого числа
        System.out.println("Введите число:");
        number = scanner.nextInt();
        boolean isPrime = number > 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Простое");
        } else {
            System.out.println("Не простое");
        }

        // Задача 7: Обратный порядок чисел
        System.out.println("Введите число N:");
        n = scanner.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 8: Сумма четных чисел
        System.out.println("Введите два числа A и B :");
        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();
        sum = 0;
        for (int i = Math.min(firstInput, secondInput); i <= Math.max(firstInput, secondInput); i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма четных чисел: " + sum);

        // Задача 9: Реверс строки
        System.out.println("Введите строку :");
        scanner.nextLine();
        String input = scanner.nextLine();
        String reversedInput = new StringBuilder(input).reverse().toString();
        System.out.println(reversedInput);

        // Задача 10: Количество цифр в числе
        System.out.println("Введите число :");
        number = Math.abs(scanner.nextInt());
        int digitCount = String.valueOf(number).length();
        System.out.println("Количество цифр: " + digitCount);

        // Задача 11: Факториал числа
        System.out.println("Введите число N :");
        n = scanner.nextInt();
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Факториал: " + factorial);

        // Задача 12: Сумма цифр числа
        System.out.println("Введите число :");
        number = Math.abs(scanner.nextInt());
        sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Сумма цифр: " + sum);

        // Задача 13: Палиндром
        System.out.println("Введите строку :");
        input = scanner.nextLine();
        reversedInput = new StringBuilder(input).reverse().toString();
        if (input.equals(reversedInput)) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }

        // Задача 14: Найти максимальное число в массиве
        System.out.println("Введите размер массива:");
        n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int maximum = Arrays.stream(array).max().getAsInt();
        System.out.println("Максимальное число: " + maximum);

        // Задача 15: Сумма всех элементов массива
        int totalSum = Arrays.stream(array).sum();
        System.out.println("Сумма элементов массива: " + totalSum);

        // Задача 16: Количество положительных и отрицательных чисел
        long positiveCount = Arrays.stream(array).filter(x -> x > 0).count();
        long negativeCount = Arrays.stream(array).filter(x -> x < 0).count();
        System.out.println("Положительных: " + positiveCount + ", Отрицательных: " + negativeCount);

        // Задача 17: Простые числа в диапазоне
        System.out.println("Введите два числа A и B :");
        firstInput = scanner.nextInt();
        secondInput = scanner.nextInt();
        System.out.println("Простые числа в диапазоне:");
        for (int i = Math.min(firstInput, secondInput); i <= Math.max(firstInput, secondInput); i++) {
            if (i > 1 && isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Задача 18: Подсчет гласных и согласных
        System.out.println("Введите строку :");
        input = scanner.nextLine().toLowerCase();
        int vowelCount = 0;
        int consonantCount = 0;
        for (char character : input.toCharArray()) {
            if ("aeiouаеёиоуыэюя".indexOf(character) >= 0) {
                vowelCount++;
            } else if (Character.isLetter(character)) {
                consonantCount++;
            }
        }
        System.out.println("Гласных: " + vowelCount + ", Согласных: " + consonantCount);

        // Задача 19: Перестановка слов в строке
        System.out.println("Введите строку :");
        input = scanner.nextLine();
        String[] words = input.split(" ");
        Collections.reverse(Arrays.asList(words));
        System.out.println(String.join(" ", words));

        // Задача 20: Число Армстронга
        System.out.println("Введите число :");
        number = scanner.nextInt();
        int temporaryNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        int armstrongSum = 0;
        while (temporaryNumber > 0) {
            armstrongSum += Math.pow(temporaryNumber % 10, numberOfDigits);
            temporaryNumber /= 10;
        }
        if (number == armstrongSum) {
            System.out.println("Число Армстронга");
        } else {
            System.out.println("Не число Армстронга");
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
