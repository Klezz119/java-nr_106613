
public class University_Person implements Person
{
	protected String Name;
	protected String Nazwisko;
	protected int Age;
	protected double Wynagrodzenie;
	
	University_Person(double Wynagrodzenie)
	{
		this.Wynagrodzenie=Wynagrodzenie;
	}
	
	public void set_Wynagrodzenie(double Wynagrodzenie)
	{
		this.Wynagrodzenie=Wynagrodzenie;
	}
	public double get_Wynagrodzenie()
	{
		return Wynagrodzenie;
	}
	@Override
	public void set_Name(String Name) {
		this.Name=Name;
	}

	@Override
	public void set_Nazwisko(String Nazwisko) {
		this.Nazwisko=Nazwisko;
	}

	@Override
	public void set_Age(int Age) {
		this.Age=Age;
	}

	@Override
	public String get_Name() {
		// TODO Auto-generated method stub
		return Name;
	}

	@Override
	public String get_Nazisko() {
		// TODO Auto-generated method stub
		return Nazwisko;
	}

	@Override
	public int get_Age() {
		// TODO Auto-generated method stub
		return Age;
	}

}
