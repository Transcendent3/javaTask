package lesson1.api;

// Вывести все простые числа от 1 до 1000

public class task2 {
    public static void main(String[] args) {

        for (int i = 2; i <= 1000; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}
