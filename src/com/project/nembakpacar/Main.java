package com.project.nembakpacar;

import java.util.Scanner;

// Remaking program and fix some bug and error from previous version
// Program ini di buat dengan tujuan mengasah lagi kemampuan si programmer dan mealtih problem solving.
// Program ini di buat oleh @AmubaCr
public class Main {
    public static void main(String[] args){
        // Mendefinisikan Scanner
        Scanner userInput = new Scanner(System.in);

        // Membuat pilihan untuk user
        System.out.println("Hai, Mungkin kamu udah tau nama aku karena kita udah kenal lama");
        System.out.print("Kamu udah tau keadaan ku dan mungkin juga udah tau gimana kondisi ku \n\t Yes / No? ");
        String masukan1 = userInput.next();

        // Membuat Control Flow
        for(int i = 0;i <= 5;i++){
            if (masukan1.equals("Yes")) {
                System.out.println("Cewek:'Jadi aku mau mengungkapkan perasaan ku kepada kamu'");
                System.out.println("Cewek:'Maukah kamu jadi pacar ku?!?'");
                String masukan2 = userInput.next();

                if (masukan2.equals("Iya")){
                    System.out.println("Cewek:'Wah, SERIUS?!?'");
                    System.out.print("(\t Ya Atau Tidak?) ");
                }
            } else if (masukan1.equals("No")){
                System.out.println("Cewek:'Eh...kok gak mau...\nApa aku kurang cantik ya? '");
                System.out.println("Pilihan:\n\t1.Gak kok, kamu cantik kok.\n2.Iya!!! Emg nya kenapa HAH?!?! \n...");
                System.out.print("Masukan pilihan sesuai nomor yang ada: ");
                int pilihan1 = userInput.nextInt();
                if (pilihan1 == 1){
                    System.out.println("Cewek:'Lah terus kok kamu nolak aku sih? Jelasin dong!?'");
                }
            }
        }
    }
}
