package com.arifbekirduman.Week1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner scanner = new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz : ");
        n1 = scanner.nextInt();
        System.out.println("İkinci Sayıyı Giriniz : ");
        n2 = scanner.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz : ");
        select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma : " + (n1 * n2));
                break;
            case 4:
                if (n2 !=0){
                    System.out.println("Bölme : " + (n1 / n2));
                }else{
                    System.out.println("Bir sayı 0'a bölünemez");
                }
                 break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz");
                break;
        }

    }
}
