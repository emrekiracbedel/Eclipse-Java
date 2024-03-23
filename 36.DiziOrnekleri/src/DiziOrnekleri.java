import java.util.Iterator;
import java.util.Scanner;

public class DiziOrnekleri {

	public static void main(String[] args) {

		System.out.println("Asal Sayı Bulma Uygulaması\n");
		
		int asalToplam=0;
		int asalOlmayanToplam=0;
		
		String asalSayilar="";
		String asalOlmayanSayilar="";
		
		boolean asalMi=false;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dizinin Eleman Sayısını Giriniz: ");
		int diziUzunluk = scanner.nextInt();
		scanner.nextLine();
		
		int[] sayilar = new int[diziUzunluk];
		
		for (int i = 0; i < sayilar.length; i++) 
		{
			System.out.print("Dizinini "+i+". index değerini giriniz: " );
			sayilar[i] = scanner.nextInt();
			scanner.nextLine();
		}
		
		for (int sayi : sayilar) 
		{
		for (int j = 2; j < sayi; j++) 
		{
			if (sayi%j==0) 
			{
				asalOlmayanToplam+=1;
				asalOlmayanSayilar+= String.valueOf(sayi)+" ";
				break;
			}	else {
				asalMi=true;
		}	
			
			
		}
		if (asalMi) 
		{
		asalToplam+=1;
		asalSayilar+= String.valueOf(sayi)+" ";
		asalMi=false;
		
		}
		}
		System.out.println("Asal Bilgileri");
		System.out.println("Asal Toplam = "+ asalToplam + " Asal Sayılar=  "+ asalSayilar );
		System.out.println("***********************");
		
		System.out.println("Asal Olmayan Bilgileri");
		System.out.println("Asal Olmayan Toplam= " + asalOlmayanToplam+ " Asal Olmayan Sayılar= "+ asalOlmayanSayilar);
		
		
	}

}
