
public class kwadrat extends Figure implements Resetable 
{
	public kwadrat(int NumberOfSides)
	{
		super(NumberOfSides);
		
	}

	@Override
	public void resetAllAttributes() 
	{
		System.out.println("Resetowanie wartoœci");
		super._Resetable();
		
	}
	

}
