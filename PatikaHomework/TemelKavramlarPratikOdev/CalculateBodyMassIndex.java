package com.arifbekirduman.Week1;

import java.util.Scanner;

public class CalculateBodyMassIndex {
    public static void main(String[] args) {
        double weight , length;
        double total = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        length = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        weight = scanner.nextDouble();

        total = weight / (length * length);

        System.out.println("Vücut Kitle İndeksiniz : " + total);
    }
}
