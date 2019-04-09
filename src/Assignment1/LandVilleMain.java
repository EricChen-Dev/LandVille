package Assignment1;
//import whatever packages are needed here
import java.util.Scanner;

public class LandVilleMain {

    
	public static void main(String[] args) {
		// Create a Scanner object for input
		Scanner console = new Scanner(System.in);
		
		// Input # of rows, # of columns for the land size, check for valid input.
		System.out.println("Enter row number of the land:");
		int maxRows;
		maxRows = console.nextInt();
		
		while (maxRows <= 0 || maxRows > 10) {
    		System.out.println("Row should be greater than 0 and less than or equal to 10");
    		System.out.println("Enter row number of the land:");
    		maxRows = console.nextInt();
    	}
		
		// If the either input is too small replace it with the smallest feasible size the land could be.
		if (maxRows<3)
        {
        	maxRows = 3;
        	System.out.println("Row number is too small, it has been set to the smallest feasible size.");
        }
    	
    	
    	
    	System.out.println("Enter column number of the land:");
    	int maxColumns;
    	maxColumns = console.nextInt();
    	
    	while (maxColumns <=0 || maxColumns > 10) {
    		System.out.println("Column should be greater than 0 and less than or equal to 10");
    		System.out.println("Enter column number of the land:");
    		maxColumns = console.nextInt();
    	}
        
    	// If the either input is too small replace it with the smallest feasible size the land could be.
    	if (maxColumns<3)
     	{
     		maxColumns = 3;
     		System.out.println("Column number is too small, it has been set to the smallest feasible size.");
     	}    
        
        
        
         // Create an object of class LandVille using the 'new' operator, calling on the LandVille constructor.
    	boolean hasHouse=false;
		LandVille landville = new LandVille (maxRows, maxColumns, hasHouse);
        
        
        // Build a loop to display the menu, prompt for input and process it as per requirements.
        int menu;
        System.out.println("Choose from the menu:\n1. Build a house \n2. Display land \n3. Clear the land \n4. Quit");
    	menu = console.nextInt();
    	
    	while (menu != 4)
    	{
    		while (menu == 1)
    		{ 			
    			if (hasHouse==false)
    			{
    				int rows; int columns;
    				System.out.println("Enter row of the house:");
    				rows = console.nextInt();
    				
    				System.out.println("Enter column of the house:");
    				columns = console.nextInt();
    				
    				landville.buildHouse(rows, columns);
    				hasHouse = LandVille.hasHouse;
    				
    				System.out.println("Choose from the menu:\n1. Build a house \n2. Display land \n3. Clear the land \n4. Quit");
        			menu = console.nextInt();
        			break;
    				
    			}
    			else 
    			{
    				System.out.println("House already exists!");
    				System.out.println("Choose from the menu:\n1. Build a house \n2. Display land \n3. Clear the land \n4. Quit");
    				menu = console.nextInt();
    			}
    		}
    		
    		
    		
    		while (menu == 2)
    		{
    			landville.displayLand();
    			System.out.println("Choose from the menu:\n1. Build a house \n2. Display land \n3. Clear the land \n4. Quit");
				menu = console.nextInt();
				break;
    		}
    		
    		while (menu == 3)
    		{
    			landville.clearLand();
    			hasHouse = LandVille.hasHouse;
    			System.out.println("Choose from the menu:\n1. Build a house \n2. Display land \n3. Clear the land \n4. Quit");
				menu = console.nextInt();
				break;
    		}
    		
    		while (menu == 4)
    		{
    			break;
    		}
    		
    		while (menu !=1 && menu != 2 && menu != 3 && menu != 4)
    		{
    			System.out.println("Invalid Input");
    			System.out.println("Choose from the menu:\n1. Build a house \n2. Display land \n3. Clear the land \n4. Quit");
    			menu = console.nextInt();
    			break;
    		}
    		continue;
    	}
    	System.out.println("Program Ends");
	}
}
