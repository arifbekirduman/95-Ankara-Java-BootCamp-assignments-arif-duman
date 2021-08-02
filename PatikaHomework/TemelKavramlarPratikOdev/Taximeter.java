package com.arifbekirduman.Week1;

import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        final double PER_KM = 2.20;
        final int MINIMUM_AMOUNT = 20;
        final int START_PRICE = 10;

        int km, total;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz : ");
        km = scanner.nextInt();
        scanner.close();

        total = (int) ((km * PER_KM) + START_PRICE);

        total = Math.max(total, MINIMUM_AMOUNT);

        System.out.println("Toplam tutar = " + total);

    }
}
