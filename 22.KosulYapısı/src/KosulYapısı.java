import java.net.SocketTimeoutException;
import java.util.Scanner;

public class KosulYapısı {

	public static void main(String[] args) {

		// if else
		
		// koşul: 5>3
		
//		if (5>3) {
//	    System.out.println("5, 3 ten Büyüktür");
//		}
//		
//		else {
//		System.out.println("5, 3 ten Büyük değildir");
//		}
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Adınızı Giriniz: ");
		String ad= scanner.nextLine();
		
		System.out.print("Soyadınız Giriniz: ");
		String soyad= scanner.nextLine();
		
		System.out.print("Dersi Giriniz: ");
		String ders_ismi= scanner.nextLine();
		
		System.out.print("Vize Notunuzu Giriniz: ");
		double vize_notu= scanner.nextDouble();
		
		System.out.print("Final Notunuzu Giriniz: ");
		double final_notu= scanner.nextDouble();
		
		double sonuc= (vize_notu*0.4)+(final_notu*0.6);
		
		
		System.out.println(ders_ismi+" Ortalamanız: "+sonuc);
		
		if (sonuc>=50) {
			System.out.println("Dersi Geçtiniz");
			
		}
		
			
			else {
				System.out.println("Dersten Kaldınız");

			}
	
		

	}
	}
