
public class Teacher implements Person
{	
	protected double Wynagrodzenie;
	protected float LVL_Wiedzy;
	protected String Tytu�;
	protected String Name;
	protected String Nazwisko;
	protected int Age;
	
	
	public Teacher(float LVL_Wiedzy)
	{
		this.LVL_Wiedzy=LVL_Wiedzy;
		
	}
	
	public  void set_Tytu�(String Tytu�)
	{
	this.Tytu�=Tytu�;	
	}
	public String get_Tytu�()
	{
		return Tytu�;
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
	public void set_Name(String Name) 
	{
		this.Name=Name;
		
	}

	@Override
	public void set_Age(int Age) 
	{
		this.Age=Age;
	}

	@Override
	public String get_Name() 
	{
		// TODO Auto-generated method stub
		return Name;
	}

	@Override
	public int get_Age() 
	{
		// TODO Auto-generated method stub
		return Age;
	}

	@Override
	public void set_Nazwisko(String Nazwisko) 
	{
		this.Nazwisko=Nazwisko;
	}

	@Override
	public String get_Nazisko() 
	{
		// TODO Auto-generated method stub
		return Nazwisko;
	}
	

}
