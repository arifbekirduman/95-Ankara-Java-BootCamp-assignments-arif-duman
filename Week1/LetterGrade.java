package com.arifbekirduman.Week1;

public class LetterGrade {
    public static void main(String[] args) {
        int score = 0;

        // i used getNumber static method of class FibonacciNumber
        score = FibonacciNumber.getNumber("Notunuzu giriniz : ");

        while (score < 0){
            System.out.println("0 dan büyük bir değer giriniz!");
            score = FibonacciNumber.getNumber("Notunuzu giriniz : ");
        }

        if(score <= 35){
            System.out.println("FF");
        }else if(score <= 50){
            System.out.println("DC");
        }else if(score<=70){
            System.out.println("BB");
        }else{
            System.out.println("AA");
        }

    }
}
