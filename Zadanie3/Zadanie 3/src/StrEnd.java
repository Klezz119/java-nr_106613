import java.util.Scanner;

public class StrEnd 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		System.out.println("Wpisuj parametry, je¿eli chcesz zakonczyæ wpisz ''end'' ");
		for(;;)
		{
			
			Scanner Skaner = new Scanner(System.in);
			System.out.println("Podaj parametr i zatwierdz enterem.");
			String Parametr = Skaner.nextLine();
			//System.out.println(Parametr);
			if(Parametr.equals("end")) 
			{
				System.out.println("Koniec.");
				return;
			}
			
		}	
		
	}
}
