package com.arifbekirduman;

import java.util.Scanner;

public class CalculateTriangleArea {
    public static void main(String[] args) {
        int triangle1 = 0, triangle2 = 0 , triangle3 = 0;
        int u;
        double result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. ücgenin kenarını giriniz :");
        triangle1 = scanner.nextInt();
        System.out.println("2. ücgenin kenarını giriniz :");
        triangle2 = scanner.nextInt();
        System.out.println("3. ücgenin kenarını giriniz :");
        triangle3 = scanner.nextInt();

        u = (triangle1 + triangle2 + triangle3) / 2;
        System.out.println("u-nun degeri ->" + u );
        System.out.println("1 - " + (u - triangle1) + "-2-" + (u - triangle2) + "-3-" +(u -triangle3) );
        result =Math.sqrt(u * (u - triangle1) * (u - triangle2) * (u -triangle3));

        System.out.println("Ucgenin alanı : " + result);

    }

}
