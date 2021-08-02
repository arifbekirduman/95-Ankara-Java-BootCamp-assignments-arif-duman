package com.arifbekirduman.Week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CinemaBoxOffice {
    public static void main(String[] args) {

        final int TICKET_PRICE = 20;
        List<String> movieList;
        int age = -1;
        int selectedMovie = -1;
        double ticketPrice =0;
        Scanner scanner = new Scanner(System.in);

        movieList = setMovieList();

        while (age == -1){
            age  = getCustomerInput("Lütfen yaşınızı giriniz : " ,scanner);

            if (age == -1)
                System.out.println("Sayı girmeniz beklenmektedir!");
        }

        while (selectedMovie == -1){
            selectedMovie = getCustomerInput("Korku filmlerinde %10 indirim vardır.\n" + getFilmList((ArrayList<String>) movieList) +
                            "\nSeçeceğiniz filmi sayı olarak giriniz : "
                    ,scanner);
            if (selectedMovie == -1)
                System.out.println("sayı girmeniz beklenmektedir");
        }

        if (age <= 18){
            ticketPrice = TICKET_PRICE - (TICKET_PRICE * 0.10);
        }else if(age <= 25){
            ticketPrice += TICKET_PRICE -(TICKET_PRICE * 0.05);
        }
        else{
            ticketPrice = TICKET_PRICE;
        }

        if (isItScaryMovie(movieList.get(selectedMovie - 1))){
            ticketPrice -= ticketPrice * 0.10;
        }

        System.out.println("Sinema biletiniz " + ticketPrice + "TL'dir.");

    }

    private static boolean isItScaryMovie(String str) {
        System.out.println(str.split(":")[1]);
        if (str.split(":")[1].equals("Korku")){
            return true;
        }
        else return false;

    }

    public static int getCustomerInput(String message, Scanner scanner) {
        System.out.println(message);
        if (!scanner.hasNextInt()) {
            scanner.next();
            return -1;
        } else {
            return scanner.nextInt();
        }
    }
    public static String getFilmList(ArrayList<String> movieList){
        String strMovieList = "";
        for (int i = 0; i < movieList.size(); i++) {
            if (i + 1 != movieList.size()){
                strMovieList += (i+1)+"-"+movieList.get(i) +"\n";
            }

            else strMovieList += (i+1)+ "-" + movieList.get(i);
        }
        return strMovieList;
    }


    public static ArrayList<String> setMovieList() {
        ArrayList<String> movieList = new ArrayList<>();
        movieList.add("Hızlı ve Öfkeli 9-Tür:Aksiyon");
        movieList.add("Hababam Sınıfı Yaz Oyunları-Tür:Komedi");
        movieList.add("Ehrimen Kanlı Yol -Tür:Korku");

        return movieList;
    }

}
