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
		
		// Defining 3 variable
		boolean kondisi = true;
		int x = 0;
		char Confirm1;

		while(kondisi){
			switch(i){
				case "yes":
					System.out.println("Jadi aku mau mengungkapkan perasaan ku ke kamu lewat program ini.");
					System.out.print("Next? (y / n) ");
					Confirm1 = inputUser.next().charAt(0);
					if(Confirm1 == 'y'){
						System.out.println("Jadi karena aku sangat menyukaimu, Maukah kamu berpacaran denganku?!? ");
							System.out.println("(Jika kamu menjawab 'iya' maka program ini otomatis di hentikan dan jawaban kamu langsung masuk ke Hp / Komputer si doi. Dan sebaliknya jika kamu menjawab 'tidak' maka otomatis jawaban kamu langsung terkirim dan memberikan sebuah kata - kata / suprise jika kamu menjawab 'ya')");
							System.out.print("(Jawaban kamu apa ya atau tidak)? ");
					}
					break;
				case "no":
					System.out.println("Ok, karena kamu menjawab 'no' maka program dihentikan");
					kondisi = false;
					break;	
				default:
					x++;
					System.out.println("Maaf pilihan yang kamu masukan salah, silahkan coba lagi \nMengulang program ke-" + x);
			}
		}	
	}
}
