package Zadanie_Car;

public abstract class car{
			//protected String marka;
			protected String kolor;
			protected double Liczba_drzwi;
			protected int rocznik;
			protected int Liczba_miejsc;
			protected double przebieg;
			protected double pojemnosc;
			public abstract void pokaz_parametry();
			{
				//System.out.print(marka);
				//System.out.print(kolor);
				//System.out.print(Liczba_drzwi);
				//System.out.print(rocznik);
				//System.out.print(Liczba_miejsc);
				//System.out.print(przebieg);
				//System.out.print(pojemnosc);
				
			}
			
				
			
		
			
			public car(String kolor, double Liczba_drzwi, int rocznik, int Liczba_miejsc, double przebieg, double pojemnosc)
				{
				//this.marka = marka;
				this.kolor = kolor;
				this.Liczba_drzwi = Liczba_drzwi;
				this.rocznik = rocznik;
				this.Liczba_miejsc = Liczba_miejsc;
				this.przebieg = przebieg;
				this.pojemnosc = pojemnosc;
	
			
				}
			
			
			
			}
