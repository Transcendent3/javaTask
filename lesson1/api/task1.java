package lesson1.api;

import java.util.Scanner;

/**
 * task1
 */
// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение
// чисел от 1 до n)

public class task1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("Введите номер треугольного числа, которое необходимо вывести: ");
        int n = in.nextInt();
        System.out.println(t(n));
    }

    static int t(int n) {
        return n * (n + 1) / 2;
    }
}