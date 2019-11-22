
public class Main //s
{
	public static void main(String[] args) 
	{	//VIP*****************************
		System.out.println("******Klasa VIP: ");
		Vip_Person VIP_1= new Vip_Person();
		VIP_1.set_Age(62);
		System.out.println("Wiek:"+VIP_1.get_Age());
		VIP_1.set_Name("Wiesiek");
		System.out.println(VIP_1.get_Name());
		VIP_1.set_Nazwisko("Bocian");
		System.out.println(VIP_1.get_Nazisko());
		//VIP*********************************
		
		//Teacher*******************************
		System.out.println("******Klasa Nauczyciel: ");
		Teacher Nauczyciel_1 = new Teacher(10762);
		Nauczyciel_1.set_Age(45);
		Nauczyciel_1.set_Name("Wojciech");
		Nauczyciel_1.set_Nazwisko("Suchodolski");
		Nauczyciel_1.set_Wynagrodzenie(5432.12);
		Nauczyciel_1.set_Tytu³("Magister");
		System.out.println("Nazwisko: "+Nauczyciel_1.get_Nazisko());
		System.out.println("Imie: "+Nauczyciel_1.get_Name());
		System.out.println("Wiek: "+Nauczyciel_1.get_Age());
		System.out.println("Tytu³: "+Nauczyciel_1.get_Tytu³());
		System.out.println("Lvl Wiedzy: "+Nauczyciel_1.LVL_Wiedzy);
		System.out.println("Wynagrodzenie: "+Nauczyciel_1.get_Wynagrodzenie());
		//Teacher*******************************
		
		//Student*******************************
		System.out.println("******Klasa Student: ");
		Student Student_1 = new Student(4562);
		Student_1.set_Age(26);
		Student_1.set_Name("Janek");
		Student_1.set_Nazwisko("Rodo");
		System.out.println("Wiek: "+ Student_1.get_Age());
		System.out.println("Nazwisko: "+ Student_1.get_Nazisko());
		System.out.println("Imie: "+Student_1.Name);
		System.out.println("Lvl Wiedzy: "+Student_1.LVL_Wiedzy);
		//Student*******************************
		
		//University_Person*********************
		System.out.println("******Klasa University Person");
		University_Person U_Person_1 = new University_Person(4567.23);
		U_Person_1.set_Age(33);
		U_Person_1.set_Name("Krzysztof");
		U_Person_1.set_Nazwisko("Boboliano");
		System.out.println("Nazwisko: "+ U_Person_1.get_Nazisko());
		System.out.println("Imie: "+ U_Person_1.get_Name());
		System.out.println("Wiek: "+ U_Person_1.get_Age());
		System.out.println("Wynagrodzenie: "+ U_Person_1.get_Wynagrodzenie());
		//University_Person**********************
		
	}
}
