
public class Figure implements NumberOfSidesPrintable {
	
	private int NumberOfSides;
	Figure(int NumberOfSides)
	{
		this.NumberOfSides=NumberOfSides;
	}

	
	@Override
	public void printSidesNumber() 
	{
		System.out.println("Liczba bokow tej figury to: "+ NumberOfSides);
		// TODO Auto-generated method stub
		
	}
	public void _Resetable()
	{
		NumberOfSides=0;
	}
	
	

}
