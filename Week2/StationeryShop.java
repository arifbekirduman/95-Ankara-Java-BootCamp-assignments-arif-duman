package com.arifbekirduman;

import java.util.*;

public class StationeryShop {

    public static void main(String[] args) {
        /**
         * Bir kırtasiye dükkanına mal geliyor.
         * Kırtasiyeci kalem, silgi gibi malzemelerin kaydını sisteme girecek.
         * soru 1: Toplam kaç adet mal aldı.
         * soru 2: Hangi maldan kaç adet aldı.
         * soru 3: Kaç çeşit malı var.
         */


        HashMap<String, Integer> productArr = new HashMap<>();
        int totalProduct = 0;


        while (true) {
            String productValue = setProduct();
            if (productValue.equals("çıkış")) {
                break;
            }
            if (productArr.getOrDefault(productValue,-1) == -1){
                productArr.put(productValue,1);
            }
            else {
                productArr.replace(productValue,productArr.get(productValue) + 1);
            }
        }

        System.out.println("Hangi maldan kaç adet aldı");
        Iterator it = productArr.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            totalProduct +=(int) pair.getValue();
            System.out.println(pair.getKey() + " => " + pair.getValue());
        }
        System.out.println("Toplam ürün adedi\n" + totalProduct);
        System.out.println("Ürün Çeşitliliği\n" + productArr.size());

    }

    public static String setProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(Çıkmak için çıkış yazın) \nÜrün bilgisini giriniz : ");
        return scanner.nextLine();
    }


}
