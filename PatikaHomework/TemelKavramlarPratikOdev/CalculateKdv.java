package com.arifbekirduman;

import java.util.Scanner;

public class CalculateKdv {
    public static void main(String[] args) {
        int money = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kdvsi hesaplanacak parayı giriniz : ");
        money = scanner.nextInt();

        if (money <= 0){
            System.out.println("0 dan daha büyük bir değer girmelisiniz!");
            return;
        }
        else if(money < 1000){
            System.out.println("KDV'li Fiyat = " + ((money*0.18) + money));
            System.out.println("KDV tutarı = " + money*0.18);
        }
        else {
            System.out.println("KDV'li Fiyat = " + ((money*0.08) + money));
            System.out.println("KDV tutarı = " + money*0.08);
        }



    }
}
