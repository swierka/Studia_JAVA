package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Podaj a, b, c: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a == 0) {
            if (b != 0) {
                double x = -c / b;
                System.out.println("x = " + x);
            } else {
                if (c == 0) System.out.println("Tożsamość");
                else System.out.println("Sprzeczność");
            }
        } else {
            double d = b * b - 4 * a * b;
            if (d > 0) {
                double p = Math.sqrt(d);
                double x1 = (-b - p) / (2 * a);
                double x2 = (-b + p) / (2 * a);
                System.out.println("x1 = " + x1 + "; x2 = " + x2);
            } else if (d == 0) {
                double x = -b / (2 * a);
                System.out.println("x1 = x2 = " + x);
            } else System.out.println("Brak pierwiastków");
        }
    }
}
