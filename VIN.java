//Santiago Fleiderman
//CSc 2010, Principles of Computer Science
//Spring 2014
//Assignment 7; If else statements loop
//Adding a loop to the VIN program so that it ask you for another one once it gets one.  JF1GH61618G674809
//04-1-2014

public class VIN
{             

	public static void main(String[] args) 
	{

		// Create a boolean variable to determine if we are in loop or not
		boolean inLoop = true;

		// initialize variables
		String vin = "";
		String manufacturer = "";
		String description = "";
		String checkDigit = "";
		String identification = "";
		String countryCode = "";

		// Prompt user to enter a VIN
		SimpleIO.prompt("Enter VIN: ");
		vin = SimpleIO.readLine();                          


		while (inLoop)
		{                                             
			if (vin.equals("") || vin.length() == 0)
			{
				inLoop = false;
				System.out.println("Thank you! Come see us again!");                                                 
			}
			else
			{
				// Extract the parts of the VIN                                                   
				manufacturer = vin.substring(0,3);                                                          
				description = vin.substring(3,8);
				checkDigit = vin.substring(8,9);
				identification = vin.substring(9);
				countryCode = vin.substring(0,1);


				// Determine if Manufacturer is one of the countries
				if (countryCode.equalsIgnoreCase("J"))
				{
					manufacturer = "Japan";
				}
				else if (countryCode.equals("1"))
				{
					manufacturer = "United States";
				}
				else if (countryCode.equals("2"))
				{
					manufacturer = "Canada";
				}
				else if (countryCode.equals("3"))
				{
					manufacturer = "Mexico";
				}
				else
				{
					manufacturer = manufacturer + " Unknown Manufacturer.";
				}

				// Displays the parts of the VIN
				System.out.println("World manufacturer identifier: " + manufacturer);
				System.out.println("Vehicle description section: " + description);
				System.out.println("Check Digit: " + checkDigit);
				System.out.println("Vehicle identification section: " + identification);
				System.out.println();

				// Enter another VIN
				SimpleIO.prompt("Enter another VIN: ");
				vin = SimpleIO.readLine();
			}                                                             
		}
	}
}






