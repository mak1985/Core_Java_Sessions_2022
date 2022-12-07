package session17;

class Boy extends Thread
{
	public void run()
	{
		for (int i = 1; i<=4; i++)
		{
			System.out.println("Class Boy" + i);
		}
	}
}

class Girl extends Thread{
	
	public void run()
	{
		for (int i = 1; i<=2; i++)
		{
			System.out.println("Class Girl" + i);
		}
		
	}

}

class Parents extends Thread{
	
	public void run()
	{
		for (int i = 1; i<=3; i++)
		{
			System.out.println("Class Parents" + i);
		}
		
	}

}
public class MultithreadringExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		MultithreadringExample obj = new MultithreadringExample();
	
		Boy b1 = new Boy();
		Girl g1 = new Girl();
		Parents p1 = new Parents();
		
		//in-built method of Thread class
		b1.run();
		g1.start();
		p1.start();
		p1.stop();
	
		
	}

}
