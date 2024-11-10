package ru.mirea.practice.u23k1158;

import java.util.Random;
import java.util.Scanner;

public final class Guess {
    private Guess() {

    }

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(21) + 1;
        int count = 3;
        System.out.println("Угадай число от 1 до 21, у тебя три попытки, я принимаю на вход целые числа");
        try (Scanner scanner = new Scanner(System.in)) {
            while (count > 0) {
                int userNumber = 0;
                boolean isValid = false;
                while (!isValid) {
                    System.out.print("Введите число: ");
                    if (scanner.hasNextInt()) {
                        userNumber = scanner.nextInt();
                        isValid = true;
                    } else {
                        System.out.println("Неправильный ввод. Введите целое число.");
                        scanner.next();
                    }
                }

                count -= 1;
                if (userNumber > randomNumber) {
                    System.out.println("Введённое число больше загаданного, у вас осталось" + count + "попыток");
                } else if (userNumber < randomNumber) {
                    System.out.println("Введённое число меньше загаданного" + count + "попыток");
                } else {
                    System.out.println("Введённое число равно " + randomNumber);
                    break;
                }

                if (count == 0) {
                    System.out.println("Вы не угадали ахаха. Загаданное число было " + randomNumber);
                }
            }
        }
    }
}