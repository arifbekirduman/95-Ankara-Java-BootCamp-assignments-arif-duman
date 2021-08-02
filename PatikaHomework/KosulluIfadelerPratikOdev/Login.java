package com.arifbekirduman.Week1;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String userName , password;
        String forgotPassword;
        String newPassword;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız : ");
        userName = scanner.nextLine();

        System.out.println("Şifreniz : ");
        password = scanner.nextLine();

        if (userName.equals("patika") && password.equals("1234")){
            System.out.println("Giriş Yaptınız!");
            return;
        }
        else {
            System.out.println("Bilgileriniz Yanlış!");

            System.out.println("Şifrenizi unuttuysanız şifrenizi yenilemek için yenile yazınız. ");
            forgotPassword = scanner.nextLine();

            if (forgotPassword.equals("yenile")){
                System.out.println("Yeni şifrenizi giriniz. !");
                newPassword = scanner.nextLine();

                if (newPassword.equals("1234")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else {
                    password = newPassword;
                    System.out.println("Şifre Oluşturuldu.");
                }

            }else{
                System.out.println("Programdan Çıkılıyor!");
            }
        }


    }

}
