
public class Student extends Teacher implements Person
{
	public float LVL_Wiedzy;
	protected String Name;
	protected String Nazwisko;
	protected int Age;
	

	public Student(float LVL_Wiedzy) 
	{
		super(LVL_Wiedzy);
		
	}

	@Override
	public void set_Name(String Name) 
	{
		this.Name=Name;
		
	}

	@Override
	public void set_Nazwisko(String Nazwisko) 
	{
		this.Nazwisko=Nazwisko;
	}

	@Override
	public void set_Age(int Age) 
	{
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
