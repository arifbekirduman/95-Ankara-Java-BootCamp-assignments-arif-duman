package com.arifbekirduman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public abstract class FlightReservationBase {
    private int seatCapacity;
    private boolean[] seats;

    public void setReservation(String message){
        Scanner scanner = new Scanner(System.in);
        String userInput = "c";
        while (userInput.equals("c")){
            System.out.println(message);
            if (!getAirplaneStatus()){
                System.out.println("Malesef uçak dolu,rezervasyon alamıyoruz!");
            }
            int userInputBusinessOrEconomy , userInputSelectedSeat;

            System.out.println("Business class uçmak için 0'a basınız,ekonomi class uçmak için 1'e basınız :");
            userInputBusinessOrEconomy = scanner.nextInt();

            boolean userInputIsSeatCorrect = true;
            while (userInputIsSeatCorrect){
                if (userInputBusinessOrEconomy == 0){
                    boolean businessStatus = showBusinessSeats();
                    if (!businessStatus){
                        String userInputBusinessFull = scanner.next();
                        if (userInputBusinessFull.equals("e")){
                            showEconomySeats();
                        }
                        else {
                            break;
                        }
                    }
                }
                else if(userInputBusinessOrEconomy == 1){
                    boolean economyStatus = showEconomySeats();
                    if (!economyStatus){
                        String userInputEconomyFull = scanner.next();
                        if (userInputEconomyFull.equals("b")){
                            showBusinessSeats();
                        }
                        else {
                            break;
                        }
                    }

                }
                else {
                    System.out.println("Yanlış seçin yaptınız!");
                    return;
                }
                userInputSelectedSeat = scanner.nextInt();

                if (userInputBusinessOrEconomy == 0){
                    userInputIsSeatCorrect = checkBusinessSeat(userInputSelectedSeat-1);
                }else {
                    userInputIsSeatCorrect = checkEconomySeat(userInputSelectedSeat-1);
                }

                if (!userInputIsSeatCorrect){
                    System.out.println("Koltuk no: " + userInputSelectedSeat + " adınıza rezerve edildi!\n İyi uçuşlar!");
                    getSteas()[userInputSelectedSeat-1] = false;
                }
                else {
                    System.out.println("Yanlış koltuk seçtiniz!");
                }
            }



            System.out.println("Devam etmek için c'ye, çıkmak için herhangi başka bir tuşa basınız:");
            userInput = scanner.next();

        }
    }

    public boolean checkBusinessSeat(int userInputSelectedSeat) {
        List<Integer> businessSeats = getBusinessStatus();
        boolean userInputIsSeatCorrect = true;
        for (int i = 0; i < businessSeats.size(); i++) {
            if (businessSeats.get(i) == userInputSelectedSeat){
                userInputIsSeatCorrect = false;
            }
        }
        return userInputIsSeatCorrect;
    }

    public boolean checkEconomySeat(int userInputSelectedSeat) {
        List<Integer> economySeats = getEconomyStatus();
        boolean userInputIsSeatCorrect = true;
        System.out.println("economy size - > " + economySeats.size());
        for (Integer businessSeat : economySeats) {
            if (businessSeat == userInputSelectedSeat){
                userInputIsSeatCorrect = false;
            }
        }
        return userInputIsSeatCorrect;
    }

    public List<Integer> getEconomyStatus(){
        List<Integer> economyStatus = new ArrayList<>();
        for(int i = 5 ; i < seats.length ; i++){
            if (seats[i])
                economyStatus.add(i);
        }
        return economyStatus;
    }

    public List<Integer> getBusinessStatus(){
        List<Integer> businessStatus = new ArrayList<>();
        for (int i = 0 ; i <= 4 ;i++){
            if (seats[i]){
                businessStatus.add(i);
            }
        }
        return businessStatus;
    }

    public boolean getAirplaneStatus(){
        boolean status = false;
        for (int i = 0 ; i < seats.length ;i++){
            if (seats[i]){
                status = true;
            }
        }
        return status;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        if (seatCapacity >= 10) {
            this.seatCapacity = seatCapacity;
            setSteas(initSeatsArray(seatCapacity));
        }
        else{
            this.seatCapacity = 10;
            setSteas(initSeatsArray(seatCapacity));
            System.out.println("Koltuk sayısı hatalı otamatik olarak 10 yapıldı.");
        }
    }

    public boolean[] getSeats() {
        return seats;
    }

    public void setSeats(boolean[] seats) {
        this.seats = seats;
    }

    public boolean[] initSeatsArray(int capacity){
        boolean[] tempSeats = new boolean[seatCapacity];
        Arrays.fill(tempSeats, true);
        return tempSeats;
    }

    public boolean showBusinessSeats(){
        List<Integer> businessSeats = getBusinessStatus();
        if (businessSeats.size() > 0) {
            System.out.println("Aşağıdaki boş koltuklardan birini seçiniz:");
            for (int i : businessSeats) {
                System.out.print((i + 1) + " ");
            }
            return true;
        }
        else {
            System.out.println("Business class koltuklarda yer yoktur.\n " +
                    "Çıkmak için herhangi bir tuşa basınız. \n " +
                    "Ekonomi almak için e ye basınız :");
            return false;
        }
    }

    public boolean showEconomySeats(){
        List<Integer> economySeats = getEconomyStatus();
        if (economySeats.size() > 0) {
            System.out.println("Aşağıdaki boş koltuklardan birini seçiniz:");
            for (int i : economySeats) {
                System.out.print((i + 1) + " ");
            }
            return true;
        }
        else {
            System.out.println("Business class koltuklarda yer yoktur.\n " +
                    "Çıkmak için herhangi bir tuşa basınız. \n " +
                    "Business almak için b ye basınız :");
            return false;
        }
    }
}
