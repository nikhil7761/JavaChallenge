
public class GangStar {
	
	public static void main(String [] args)
	{
		
		Bomb k=new Bomb();
		k.start();
		k.setPriority(8);
		  k.interrupt();
		
		for(int i=0;i<=4;i++)
		{
			System.out.println("main excuted");
		}
		
	}

}

class Bomb extends Thread{
	
	public void run()
	{

			try
			{
				for(int i=0;i<=7;i++)
				{
				   System.out.println("Program run sucessfully");
				   Thread.sleep(2000);
				}
			       
				
			}
			catch(InterruptedException e)
			{
				System.out.println("complier is sleep in program");
			}
			
		}
	 			
	}
	
