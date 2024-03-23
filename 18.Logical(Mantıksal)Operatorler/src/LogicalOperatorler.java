
public class LogicalOperatorler {

	public static void main(String[] args) {

		// && ve
		// || veya
		// ! değil
		// ?: üçlü operatör(ternary operator)

		boolean aDegeri = !true;
		
		int a=5;
		int b=3;
		
		boolean sonuc= !(a>b);
		
		boolean sonuc2= a>b && b>2;
		
		boolean sonuc3= a>b && b<2;
		
		boolean sonuc4= a>b || b>2;
		
		boolean sonuc5= a>b || b<2;
		
		boolean sonuc6= a<b || b<2;
		
		boolean sonuc7= a>b ? true : false;
	
		String sonuc8= a>b ? "Evet Büyüktür" : "Hayır Değildir";

		System.out.println(aDegeri);
		System.out.println(sonuc);
		System.out.println(sonuc2);
		System.out.println(sonuc3);
		System.out.println(sonuc4);
		System.out.println(sonuc5);
		System.out.println(sonuc6);
		System.out.println(sonuc7);
		System.out.println(sonuc8);
	}

}
