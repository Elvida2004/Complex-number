package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Complex z1 = new Complex(5, 3);
        Complex z2 = new Complex(2, 1);

// Выводим их на экран.
        System.out.println("z1 = " + z1.str());
        System.out.println("z2 = " + z2.str());

// Выполняем операции.

        Complex z_sum = z1.add(z2);
        Complex z_diff = z1.sub(z2);
        Complex z_mul = z1.mul(z2);
        Complex z_div = z1.div(z2);
        double z_mod = z1.modulus();
        boolean z_eq = z1.is_equal(z2);

// Выводим результаты.

        System.out.println("z1 + z2 = " + z_sum.str());
        System.out.println("z1 - z2 = " + z_diff.str());
        System.out.println("z1 * z2 = " + z_mul.str());
        System.out.println("z1 / z2 = " + z_div.str());
        System.out.println("Модуль z1 и z2 = " + z_mod);
        System.out.println("Сравнение z1 и z2 = " + z_eq);

    }
}