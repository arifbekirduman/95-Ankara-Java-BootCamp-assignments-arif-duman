package com.arifbekirduman.Week1;

import java.util.Scanner;

public class CalculateCircleArea {
    public static void main(String[] args) {
        int r, centreAngle;
        int total = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz : ");
        r = scanner.nextInt();

        System.out.println("Dairenin merkez açısının ölçüsünü giriniz :");
        centreAngle = scanner.nextInt();

        scanner.close();

        total = (int) ((Math.PI * (r * r) * centreAngle) / 360);

        System.out.println("Dairenin alanı : " + total);


    }
}
