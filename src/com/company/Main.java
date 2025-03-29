package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int num1 = scanner.nextInt();

        String sym;


        while (true) {

            System.out.println("Введите математическую операцию - (+,-,*,/)");
            sym = scanner.next();

            if (Objects.equals(sym,"+") || Objects.equals(sym,"-") || Objects.equals(sym, "*") || Objects.equals(sym, "/")) {
                break;
            } else {
                System.out.println("\n"+"Нельзя ввести такой символ! <<" +sym+ ">>" +"\n");
            }
        }


        int num2;

        while (true) {

            System.out.println("Введите второе число:"+"\n");
            num2 = scanner.nextInt();

            if (!Objects.equals(sym,"/" ) || num2 != 0) {
                break;
            } else {
                System.out.println("Ошибка: нелься делить на ноль! ");
            }
        }

        if (sym.equals("+")) {
            int summa = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + summa);
        } else if (sym.equals("-")) {
            int difference = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + difference);
        } else if (sym.equals("*")) {
            int multiply = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + multiply);
        } else {
            double division = (double) num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + division);
        }
        scanner.close();
    }
}
