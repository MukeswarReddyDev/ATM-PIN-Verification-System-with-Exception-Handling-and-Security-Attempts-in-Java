import java.util.Scanner;

class InvalidInputException extends Exception
{
	
}
class Atm
{
	int pin=7986;
	int pinCustomer;
	void acceptInput()
	{
	        Scanner scan=new Scanner(System.in);
	        System.out.println("Enter Pin Number");
	        pinCustomer=scan.nextInt();
	        
	}
	void verify() throws Exception
	{
		if(pin==pinCustomer)
		{
			System.out.println("Collect your Cash");
		}
		else 
		{
			InvalidInputException i=new InvalidInputException();
			System.out.println("Invalid Pin Number");
			throw i;
			
		}
		
	}
}
class SubBank
{
	void maintain()
	{
		Atm a=new Atm();
		try
		{
			a.acceptInput();
			a.verify();
		}
		catch(Exception e)
		{
			try
			{
				a.acceptInput();
				a.verify();
			}
			catch(Exception f)
			{
				try
				{
					a.acceptInput();
					a.verify();
				}
				catch(Exception g)
				{
					System.out.println("Card Bloked Contanct Your Bank");
				}
			}
		}
	}
}

public class Rbi {

	public static void main(String[] args) {
           SubBank b=new SubBank();
           b.maintain();

	}

}
