import java.security.PublicKey;
import java.util.Scanner;

public class AsalSAyiBulmaUygulamasi {

	public static void main(String[] args) {

		
		Scanner scanner= new Scanner(System.in);
		boolean sayiAsalMi=false;
		
		
		System.out.println("Asal Sayi Bulma Uygulamasina Hosgeldiniz");
		System.out.print("Lutfen Bir Sayi Giriniz: ");
		
		
		int sayi= scanner.nextInt();
		
		for (int i =2; i <sayi; i++) {
			
			if (sayi%i==0) {
				
				sayiAsalMi=false;
				break;
			}
			else {
				sayiAsalMi=true;
			}
			
		}
		
		if (sayiAsalMi) {
			
			System.out.println("Girdiginiz "+sayi+" Sayisi Asaldir");
			
		}
		
		else {
			System.out.println("Girdiginiz "+sayi+" Sayisi Asal Degildir");
		}
		
		
		
		
		
	}

}
