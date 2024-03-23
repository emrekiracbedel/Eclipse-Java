import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class DizininElemanlariniKullanicidanAlma {

	public static void main(String[] args) {

		
		Scanner scanner=  new Scanner(System.in);
		
		
		System.out.print("Diziniz Kac Elemanli Olacaktir: ");
		int diziUzunluk= scanner.nextInt();
		scanner.nextLine();
		
		String[] isimler= new String[diziUzunluk];
		
		
		for (int i = 0; i <diziUzunluk; i++) {
			
			System.out.print("Dizinin "+(i)+" Index Degerini Giriniz: ");
			

			isimler[i]= scanner.nextLine();
			
			
		}
		
		System.out.println("--------Dizinin Elemanlari--------");
	
		for (int i = 0; i < isimler.length; i++) {
			
			System.out.println(isimler[i]);
			
		}
		
 
		
		
	}

}
