package Zadanie_Car;
public class Ford extends car {
	
	protected String marka;
	
	public Ford(String marka, String kolor, double Liczba_drzwi, int rocznik, int Liczba_miejsc, double przebieg,
			double pojemnosc) {
		super(kolor, Liczba_drzwi, rocznik, Liczba_miejsc, przebieg, pojemnosc);
		this.marka = "Ford";
		
	}

	public void pokaz_parametry() {
		System.out.println(this.marka);
		System.out.println(super.kolor);
		System.out.println(super.Liczba_drzwi);
		System.out.println(super.rocznik);
		System.out.println(super.Liczba_miejsc);
		System.out.println(super.przebieg);
		System.out.println(super.pojemnosc);
		
	}

	
	


	
	
}
		
	