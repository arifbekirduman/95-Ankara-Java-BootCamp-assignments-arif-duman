package com.arifbekirduman;

import java.util.Scanner;

public class CalculateAverage {

    public static void main(String[] args) {
        String[] lessons = {"Matematik" , "Fizik", "Kimya","Türkçe","Tarih","Müzik"};
	    int totalPoint=0;

	    for (int i = 0 ; i < lessons.length ; i++){
            totalPoint += getPoint(lessons[i]);
        }

	    String result = (totalPoint/lessons.length) >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("Derslerin ortalaması : " + (totalPoint/lessons.length) + "->" + result);

    }
    public static int getPoint(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message + " ders notunuzu giriniz :");
        return scanner.nextInt();
    }
}
