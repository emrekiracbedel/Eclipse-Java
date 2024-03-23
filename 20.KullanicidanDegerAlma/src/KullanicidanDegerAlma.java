import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class KullanicidanDegerAlma {

	public static void main(String[] args) {

		// Kullanıcıdan değer alma nasıl yapılır?
		// Scanner
		// nextLine() -> String
		// nextInt() -> Integer
		// nextByte() -> Byte
		// nextFloat() -> Flaot
		// nextDouble() -> Double

		Scanner scanner = new Scanner(System.in);
		/*
		 * System.out.println("Adınızı Giriniz");
		 * 
		 * String isim = scanner.nextLine();
		 * 
		 * System.out.println("Soyadınızı Giriniz");
		 * 
		 * String soyisim = scanner.nextLine();
		 * 
		 * System.out.println("Adınız ve Soyadınız: " + isim + " " + soyisim);
		 */

		// System.out.print("Yaşınızı Giriniz: ");

		// int yas= scanner.nextInt();

		// System.out.println("Yaşınız: " + yas);

		System.out.print("Pi Sayısının Değerini Giriniz: ");
		
		double sayi= scanner.nextDouble();
		
		System.out.print("Pi Sayısının Değeri: "+sayi);
		
		

	}

}
