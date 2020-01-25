public class Join extends Thread{
	
	public void run()
	{
		for(int i=1;i<20; i++ ) {
			 {
				 System.out.println(i);
			 }
		}
		
			
			
	}
	public static void main(String[]args) {
	Join t1 = new Join();
	Join t2 = new Join();
	Join t3 = new Join();
	
		try
		{
			t1.run.join();
			t2.run.join();
			t3.run.join();
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	
		
	
	

}
