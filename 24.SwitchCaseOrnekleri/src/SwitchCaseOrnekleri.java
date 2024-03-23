import java.util.Scanner;

public class SwitchCaseOrnekleri {

	public static void main(String[] args) {

		// Emre Kıraçbedel IBAN: TR1234 1234 1234 1234 1234
		// Emre Kıraçbedel Müşteri Numarası ve Şifresi: 2002-2558

		// Arda Özdemir IBAN: TR4321 4321 4321 4321 4321
		// Arda Özdemirin Müşteri Numarası ve Şifresi 2000-0735

		/*
		 * Bakiyeyi Görüntülemek İçin --->1 Para Çekmek İçin --->2 Para Yatırmak İçin --->3 Farklı Hesaba Para
		 * Yatırmak için --->4 Uygulamadan Çıkmak İçin --->q
		 */

		String islemSecenekleri = "Bakiye Goruntuleme --->1 " + "Para Cekmek Icin --->2 "
				+ "Para Yatirmak Icin --->3 " + "Farkli Hesaba Para Yatirmak Icin --->4 " + "Cikis Yapmak Icin --->Q'Tusuna Basiniz";

		Scanner scanner = new Scanner(System.in);

		double emreBakiye = 2500;
		String emreIBAN = "TR1234 1234 1234 1234 1234";
		String emreMusteriNo = "2002";
		String emreSifre = "2558";

		double ardaBakiye = 7500;
		String ardaIBAN = "TR4321 4321 4321 4321 4321";
		String ardaMusteriNo = "2000";
		String ardaSifre = "0735";

		System.out.println("ATM'ye Hosgeldiniz");
		System.out.println("Lutfen Bilgilerinizi Giriniz");

		System.out.print("Musteri Numarasini Giriniz: ");
		String musteriNo = scanner.nextLine();

		System.out.print("Sifrenizi Giriniz: ");
		String musteriSifresi = scanner.nextLine();

		if (musteriNo.equals("2002") && musteriSifresi.equals("2558")) {
			System.out.println("Emre Kiracbedel'in Hesabina Giris Yaptiniz");
			System.out.println(islemSecenekleri);
			System.out.print("Lutfen Bir Secim Yapiniz: ");
			String secim = scanner.nextLine();

			switch (secim) {

			case "1":
				System.out.println("Bakiyeniz: " + emreBakiye);
				break;

			case "2":
				System.out.println("Kac TL Cekmek Istiyorsunuz");
				System.out.print("Cekmek Istediginiz Tutari Giriniz: ");
				int cekilecekTutar = scanner.nextInt();
				if (emreBakiye >= cekilecekTutar) {
					System.out.println("Parayi Para Bolmesinden Aliniz");
					System.out.println("Kalan Bakiye: " + (emreBakiye - cekilecekTutar));
				} else {
					System.out.println("Bakiyenizden Fazla Para Cekemssiniz");
					System.out.println("Bakiyeniz: "+emreBakiye);
				}
				break;
				
			case "3":
				System.out.println("Kac TL Yatirmak Istiyorsunuz: ");
				double tutar= scanner.nextDouble();
				System.out.println("Para Hesabiniza Yatirildi");
				System.out.println("Hesabinizin Yeni Tutari: "+(tutar+emreBakiye));
				break;

			case "4":
				System.out.println("Hangi IBAN'a Para Yatirmak Istiyorsunuz");
				System.out.print("IBAN'i Giriniz: ");
				String IBAN= scanner.nextLine();
				System.out.println("Kac TL Yatirmak Istiyorsunuz");
				int yatirilmakIstenenTutar= scanner.nextInt();
				System.out.print("Alicinin Adini ve Soyadini Giriniz: ");
				String alicininAdiSoyadi= scanner.nextLine();
				String alici= scanner.nextLine();
				if (alici.equals("Arda Ozdemir") && IBAN.equals("TR4321 4321 4321 4321 4321")) {
					
					System.out.println("Girdiginiz Bilgiler Dogrudur");
			}
				else {
					System.out.println("Girdiginiz Bilgiler Dogru Degildir");
					break;
				}
				
				
				if(yatirilmakIstenenTutar<=emreBakiye)
				{
				System.out.println("Para Girdiginiz Hesaba Basari Ile Yatirildi");
				System.out.println("Hesabinizda Kalan Yeni Tutar: "+(emreBakiye-yatirilmakIstenenTutar));
				emreBakiye-=yatirilmakIstenenTutar;
				ardaBakiye+=yatirilmakIstenenTutar;
				}
				else {System.out.println("Aktarmaya Calistiginiz Tutar Hesabinizidaki Tutardan Fazladir");
					
				}
				
				break;

			case "Q":
				System.out.println("Sistemden Cikildi");
			}

		}

		else if (musteriNo.equals("2000") && musteriSifresi.equals("0735")) {
			System.out.println("Arda Ozdemir'in Hesabina Giris Yaptiniz");
			System.out.println(islemSecenekleri);
			System.out.println("Lutfen Bir Secim Yapiniz");
			String secim = scanner.nextLine();
			
			switch (secim) {

			case "1":
				System.out.println("Bakiyeniz: " + ardaBakiye);
				break;

			case "2":
				System.out.println("Kac TL Cekmek Istiyorsunuz");
				System.out.print("Cekmek Istediginiz Tutari Giriniz: ");
				int cekilecekTutar = scanner.nextInt();
				if (ardaBakiye >= cekilecekTutar) {
					System.out.println("Parayi Para Bolmesinden Aliniz");
					System.out.println("Kalan Bakiye: " + (ardaBakiye - cekilecekTutar));
				} else {
					System.out.println("Bakiyenizden Fazla Para Cekemssiniz");
					System.out.println("Bakiyeniz: "+ardaBakiye);
				}
				break;
				
			case "3":
				System.out.println("Kac TL Yatirmak Istiyorsunuz: ");
				double tutar= scanner.nextDouble();
				System.out.println("Para Hesabiniza Yatirildi");
				System.out.println("Hesabinizin Yeni Tutari: "+(tutar+ardaBakiye));
				break;

			case "4":
				System.out.println("Hangi IBAN'a Para Yatirmak Istiyorsunuz");
				System.out.print("IBAN'i Giriniz: ");
				String IBAN= scanner.nextLine();
				System.out.println("Kac TL Yatirmak Istiyorsunuz");
				int yatirilmakIstenenTutar= scanner.nextInt();
				System.out.print("Alicinin Adini ve Soyadini Giriniz: ");
				String alicininAdiSoyadi= scanner.nextLine();
				String alici= scanner.nextLine();
				if (alici.equals("Emre Kiracbedel") && IBAN.equals("TR1234 1234 1234 1234 1234")) {
					
					System.out.println("Girdiginiz Bilgiler Dogrudur");
			}
				else {
					System.out.println("Girdiginiz Bilgiler Dogru Degildir");
					break;
				}
				
				
				if(yatirilmakIstenenTutar<=ardaBakiye)
				{
				System.out.println("Para Girdiginiz Hesaba Basari Ile Yatirildi");
				System.out.println("Hesabinizda Kalan Yeni Tutar: "+(ardaBakiye-yatirilmakIstenenTutar));
				ardaBakiye-=yatirilmakIstenenTutar;
				emreBakiye+=yatirilmakIstenenTutar;
				}
				else {System.out.println("Aktarmaya Calistiginiz Tutar Hesabinizidaki Tutardan Fazladir");
					
				}
				
				break;

			case "Q":
				System.out.println("Sistemden Cikildi");
			}

		}


		else 
		System.out.println("Kullanici Adi veya Sifre Hatali");
		
   }
}
