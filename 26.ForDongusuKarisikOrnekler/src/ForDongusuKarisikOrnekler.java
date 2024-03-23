import javax.imageio.metadata.IIOMetadataFormatImpl;

public class ForDongusuKarisikOrnekler {

	public static void main(String[] args) {

		
		// 1 den 10 a kadar olna çift sayıları yazdır
		// 1 den 10 a kadar olan tek sayıları yazdır
		// 1 den 10 a kadar olan çift sayıların toplamını yazdır
		// 1 den 10 a kadar olan tek sayıların toplamını yazdır
		
	
		
		for(int i= 1; i<=10; i++) 
		{
			
			if(i%2==0)
			{
				System.out.println(i);
			}
				
		}
		
		
		
		
		
		for(int j= 1; j<=10; j++) 
		{
			if(j%2!=0) 
			{
				System.out.println(j);
			}
		}
		
		
		
		int toplam=0;
		
		for(int j= 1; j<=10; j++) 
		{
			if(j%2==0)
			{
				toplam+=j;
			}
			
		}
		System.out.println(toplam);
		
		
		
			
         for(int i = 1; i<=10; i++)
         {
        	if (i%2==0)
        	{
        		System.out.println("Emre");
		    } 
        	else
        	{
				System.out.println(i);
			}
         }			
		
		
		
		
		
		
		
		
		
		
	}

}
