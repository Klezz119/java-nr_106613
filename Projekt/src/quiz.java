import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class quiz
{
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		int Numer = 0;
		File Plik_txt = new File("Pytania_do_quizu.txt");
		
		Scanner scan = new Scanner(System.in);
		Scanner scanner = new Scanner(Plik_txt);
		
		Numer = 1;
		
		int pkt = 0;
		System.out.println("Odpowiadaj¹c na pytania uzywaj tylko liter a,b,c,d. \nW innym wypadku nie dostaneisz punktów!!!\nPowodzenia\n\n");
			while (scanner.hasNext())
			{
				//Pobranie pytania
				System.out.println("Pytanie Nr " + Numer + " brzmi:");
				String pytanie = scanner.nextLine();
				System.out.println(pytanie);
				
				//Pobiera pierwsz¹ odpowiedz
				
				String a = scanner.nextLine();
				System.out.print("a).");
				System.out.println(a);
		
				//Pobiera druga odpowiedz
				
				String b = scanner.nextLine();
				System.out.print("b).");
				System.out.println(b);
		
				//Pobiera trzecia odpowiedz
				
				String c = scanner.nextLine();
				System.out.print("c).");
				System.out.println(c);
		
				//Pobiera czwarta odpowiedz
				
				String d = scanner.nextLine();
				System.out.print("d).");
				System.out.println(d);
				
				//Pobiera pobiera prawidlowa odpowiedz
		
				String Prawidlowa_Odp = scanner.nextLine();
				
				
				//Pobieranie odpowiwdzi od uzytkownika
				System.out.println("Tutaj wpisz odpowiedz: ");
				
		
				String odp = scan.nextLine();
		
				if (odp.equals(Prawidlowa_Odp))
				{
					System.out.println("Gratulacje ! Poda³eœ w³aœciw¹ odpowiedz\n\n");
					pkt++;
				}
				else
				{
					System.out.println("B³¹d!!! \nPrawid³owa odpowied¿ to " + Prawidlowa_Odp + "\n\n");
					
				}Numer++;
			}
			

			
			System.out.println("Koniec! \nOdpowiedzia³eœ poprawnie na " + pkt+" pytañ" );
		
	}

}
