package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

    }

    // Задача 1
    public static int findMax(int a, int b) throws Exception {
        if (a == b) {
            throw new Exception("Числа равны");
        }
        return Math.max(a, b);
    }

    // Задача 2: Калькулятор деления
    public static double divideNumbers(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return a / b;
    }

    // Задача 3: Конвертация строки в число
    public static int convertStringToNumber(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Некорректное число");
        }
    }

    // Задача 4: Проверка возраста
    public static void checkAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Некорректный возраст");
        }
    }

    // Задача 5: Нахождение квадратного корня
    public static double findSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Отрицательное число");
        }
        return Math.sqrt(number);
    }

    // Задача 6: Вычисление факториала
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Задача 7: Проверка массива на нули
    public static void checkArrayForZeros(int[] array) {
        for (int number : array) {
            if (number == 0) {
                throw new IllegalArgumentException("Массив содержит нули");
            }
        }
    }

    // Задача 8: Возведение числа в степень
    public static double power(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Степень не может быть отрицательной");
        }
        return Math.pow(base, exponent);
    }

    // Задача 9: Обрезка строки
    public static String truncateString(String str, int length) {
        if (length > str.length()) {
            throw new IllegalArgumentException("Длина превышает длину строки");
        }
        return str.substring(0, length);
    }

    // Задача 10: Поиск элемента в массиве
    public static int findElementInArray(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        throw new NoSuchElementException("Элемент не найден");
    }

    // Задача 11: Конвертация числа в двоичную систему
    public static String toBinary(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число должно быть положительным");
        }
        return Integer.toBinaryString(number);
    }

    // Задача 12: Проверка делимости
    public static boolean isDivisible(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return a % b == 0;
    }

    // Задача 13: Чтение элемента списка
    public static String getElementFromList(List<String> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Индекс вне границ");
        }
        return list.get(index);
    }

    // Задача 14: Проверка сложности пароля
    public static void checkPasswordStrength(String password) {
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Слабый пароль");
        }
    }

    // Задача 15: Проверка корректности даты
    public static void validateDate(String date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate.parse(date, formatter);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Неверный формат даты");
        }
    }

    // Задача 16: Конкатенация строк
    public static String concatenateStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Одна из строк равна null");
        }
        return str1 + str2;
    }

    // Задача 17: Остаток от деления
    public static int getRemainder(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return a % b;
    }

    // Задача 18: Квадратный корень
    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Отрицательное число");
        }
        return Math.sqrt(number);
    }

    // Задача 19: Конвертация температуры
    public static double convertTemperature(double celsius) {
        final double ABSOLUTE_ZERO = -273.15;
        if (celsius < ABSOLUTE_ZERO) {
            throw new IllegalArgumentException("Температура ниже абсолютного нуля");
        }
        return celsius * 9 / 5 + 32;
    }

    // Задача 20: Проверка строки на пустоту
    public static void checkStringNotEmpty(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Строка пуста или равна null");
        }
    }
}

