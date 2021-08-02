package com.arifbekirduman.Week1;

import java.text.DecimalFormat;

public class Greengrocer {

    public static void main(String[] args) {
        final double  PEAR_PRICE = 2.14;
        final double  APPLE_PRICE = 3.67;
        final double  TOMATO_PRICE = 1.11;
        final double  BANANA_PRICE = 0.95;
        final double  EGGPLANT_PRICE = 5.0;
        double[] productPrice = {
                PEAR_PRICE,
                APPLE_PRICE,
                TOMATO_PRICE,
                BANANA_PRICE,
                EGGPLANT_PRICE
        };

        String[] productMessages = {
                "Armut kaç kilo ? :" ,
                "Elma Kaç Kilo ? :",
                "Domates Kaç Kilo ? :",
                "Muz Kaç Kilo ? :",
                "Patlıcan Kaç Kilo ? :"
        };

        int productWeight = 0;
        double totalPrice = 0;

        for(int i = 0 ; i < productMessages.length ; i++){
            productWeight = FibonacciNumber.getNumber(productMessages[i]);
            totalPrice += productWeight * productPrice[i];
        }
        System.out.println("Toplam Tutar : "+new DecimalFormat("##.##").format(totalPrice));





    }
}
