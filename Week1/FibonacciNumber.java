package com.arifbekirduman.Week1;

import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {
        int count = getNumber("Notunuzu Giriniz :");

        while (count <= 0){
            System.out.println("N sayısını 0 dan daha büyük bir sayı giriniz!");
            count = getNumber("Notunuzu Giriniz : ");
        }
        int x1 = 0,x2 = 1,x3=0;
        if(count > 2){
            System.out.println("*****RESULT*****");
            System.out.println("0\n1");
        }

        else if(count == 1){
            System.out.println("*****RESULT*****");
            System.out.println("0");
        }

        for(int i = 2 ; i < count ; i++){
            x3 = x2 + x1 ;
            System.out.println(x3);
            x1 = x2;
            x2 = x3;
        }
    }
    public static int getNumber(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        if (!scanner.hasNextInt()){
            System.out.println("Bir sayı girmeniz gerekmektedir!");
            return -1;
        }
        return scanner.nextInt();
    }
}
