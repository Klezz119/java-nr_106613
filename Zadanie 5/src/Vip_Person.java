
public class Vip_Person implements Person
{	
	protected String Nazwisko;
	public String Name;
	protected int Age;
	Vip_Person() 
	{
		
	}
	
		
	

	public void set_Name(String Name)
	{
	this.Name=Name;
	}


	public void set_Age(int Age) 
	{
		this.Age=Age;
		
	}


	public String get_Name() 
	{
		return Name;
		
	}

	public int get_Age() 
	{
		return Age;
	}




	@Override
	public void set_Nazwisko(String Nazwisko) {
		this.Nazwisko=Nazwisko;
		// TODO Auto-generated method stub
		
	}




	@Override
	public String get_Nazisko() {
		
		// TODO Auto-generated method stub
		return Nazwisko;
	}

}
