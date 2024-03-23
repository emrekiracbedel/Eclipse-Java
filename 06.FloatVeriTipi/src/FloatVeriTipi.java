
public class FloatVeriTipi {

	public static void main(String[] args) {

		//Ondalık sayı tanımlamak için kullanılır
		//Noktada sonra 7 basamağa kadar çıkabilir. 4 byte
		
		float MaxDeger=Float.MAX_VALUE;
		float MinDeger=Float.MIN_VALUE;
		
		System.out.println(MaxDeger);
		System.out.println(MinDeger);
		
		//Float veri tipi noktadan sonra eğer sayı tek basamaklıysa maksimum 7 hane aldığı için 8 i yazmamıştır
		//Sayının sonuna "f" Harfi konulmazsa Sayı Konsola Yazılmaz
		float ondalikliSayi=2.12345678f;
		
		System.out.println(ondalikliSayi);
	
		float ondalikliSayi2=11.123456f;
		
		System.out.println(ondalikliSayi2);
		
		
		
	}

}
