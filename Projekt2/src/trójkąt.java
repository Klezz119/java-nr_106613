import java.util.Scanner;

public class tr�jk�t
{
	
	public static void main(String[] args)
	
	{		
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj d�ugo�ci bok�w tr�jk�ta: ");
        
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
		
        
        if (a+b>c && a+c>b && b+c>a)
        {
        	
        	System.out.println("\nJest to tr�jk�t");
        	
        	double p = a+b+c/2;
        	double pole = Math.sqrt(p*(p-a)*(p-b)*(p-c)); 
        	System.out.println("\nPole="+ pole);
        
        	
        	
        	
        	
        	if ((a*a+b*b==c*c) || b*b+c*c==a*a || c*c+a*a==b*b)
        	{
        		System.out.println("To tr�jk�t prostok�tny");
        	}
        	else
        	{
        		System.out.println("Nie. Nie jest to tr�jk�t prostok�tny.");
        	}
        	
        	
        	
        }
        else
        {
        	
        	System.out.println("Nie mo�na z�o�y� tr�jk�ta.");
        }
	}

}
