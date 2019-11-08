import java.util.Scanner;

public class trójk¹t
{
	
	public static void main(String[] args)
	
	{		
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj d³ugoœci boków trójk¹ta: ");
        
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
		
        
        if (a+b>c && a+c>b && b+c>a)
        {
        	
        	System.out.println("\nJest to trójk¹t");
        	
        	double p = a+b+c/2;
        	double pole = Math.sqrt(p*(p-a)*(p-b)*(p-c)); 
        	System.out.println("\nPole="+ pole);
        
        	
        	
        	
        	
        	if ((a*a+b*b==c*c) || b*b+c*c==a*a || c*c+a*a==b*b)
        	{
        		System.out.println("To trójk¹t prostok¹tny");
        	}
        	else
        	{
        		System.out.println("Nie. Nie jest to trójk¹t prostok¹tny.");
        	}
        	
        	
        	
        }
        else
        {
        	
        	System.out.println("Nie mo¿na z³o¿yæ trójk¹ta.");
        }
	}

}
