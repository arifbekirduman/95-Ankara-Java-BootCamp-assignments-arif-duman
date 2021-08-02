package com.arifbekirduman.Week1;

import java.util.Scanner;

public class TermGrade {
    public static void main(String[] args) {
        int firstExam, finalExam;
        int totalGrade;
        String letterGrade;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vize notunu giriniz : ");
        firstExam = scanner.nextInt();
        System.out.println("Final notunu giriniz : ");
        finalExam = scanner.nextInt();
        scanner.close();

        totalGrade = calculateGrade(firstExam, finalExam);

        letterGrade = calculateLetterGrade(totalGrade);

        showGrade(letterGrade,totalGrade);
    }

    public static void showGrade(String letterGrade, int totalGrade){
        System.out.println("Notunuz -> " + totalGrade);
        System.out.println("Harf Notunuz -> " + letterGrade);
    }

    public static int calculateGrade(int firstGrade, int secondGrade) {
        return (int) ((firstGrade * 0.3) + (secondGrade * 0.7));
    }
    public static String calculateLetterGrade(int totalGrade){
        if (totalGrade <= 20){
            return "FF";
        }
        else if(totalGrade <= 50){
            return "CB";
        }else if (totalGrade <= 70){
            return "BB";
        }
        else {
            return  "AA";
        }

    }

}
