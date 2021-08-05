package com.project.nembakpacar;

import java.util.Scanner;

// Program buat nembak pacar by @Fachri
// Referensi dari AmubaCraft
public class main {
	public static void main(String[] args) {
		// Defining a Scanner
		@SuppressWarnings("resource")
		Scanner inputUser = new Scanner(System.in);
		
		// Input User
		System.out.println("Hai, Mungkin kamu udah tau nama aku karena kita udah kenal lama");
		System.out.println("Kamu udah tau keadaan ku dan mungkin juga udah tau gimana kondisi ku ");
		System.out.print("Lanjut??? (yes / no) ");
		String i = inputUser.next();
		String j = inputUser.next();
		
		// Defining 3 variable
		// boolean kondisi = true;
		// int x = 0;
		char Confirm1;

		if(i == "yes"){
			System.out.println("Jadi aku mau mengungkapkan perasaan ku kepada kamu");
			System.out.println("Maukah kamu jadi pacar ku?!?");
			Confirm1 = inputUser.next().charAt(0);
			
			if(Confirm1 == 'y'){
				System.out.println("Cewek: " + "Wah, SERIUS?!?");
				System.out.println("\t Ya \n Atau \t Tidak?");
				j = inputUser.next();

				if(j == "Iya"){

				}
			}
		}	else{
			System.out.println("Program Berhenti!!!");
		}
	}
}
