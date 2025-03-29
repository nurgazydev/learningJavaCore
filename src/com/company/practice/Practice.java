package com.company.practice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите возраст для входа:");

        int age;

        while (true) {
            age = scanner.nextInt();
            if (age < 18) {
                System.out.println("доступ запрещен!" + "\n");
                System.out.println("Введите возраст для входа |");
            } else {
                System.out.println("Какую сумму хотите поменять на доллары");
                double rubl = scanner.nextInt();

                    double dollar = rubl / 90;
                    System.out.println(rubl + " рубль = " + dollar + " доллара");
                    break;
            }
        }
    }
}
