package Keywords;

import org.testng.annotations.Test;

public class Groups 
{
	@Test(groups= {"Testing "})  
	public void infosys()  
	{  
	System.out.println("Infosys");  
	}  
	@Test  
	public void technip()  
	{  
	System.out.println("Technip India Ltd");  
	}  
	@Test(groups= {"software company"})  
	public void wipro()  
	{  
	System.out.println("Wipro");  
	}  
}
