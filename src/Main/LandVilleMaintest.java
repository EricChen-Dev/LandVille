package Main;

import java.io.Console;
import java.util.Scanner;

//import whatever packages are needed here

public class LandVilleMaintest {

	public static void main(String[] args) {
		
		
		int rowno; int columnno; boolean hasHouse = false;
		
		// Create a Scanner object for input
		Scanner console = new Scanner(System.in);
		
		
		
		
		
    	System.out.println("Enter row number of the land:");
    	// Input # of rows, # of columns for the land size, check for valid input.
    	rowno = console.nextInt();
    	
    	while (rowno <= 0 || rowno > 10) {
    		System.out.println("Row should be greater than 0 and less than or equal to 10");
    		System.out.println("Enter row number of the land:");
    		rowno = console.nextInt();
    	}
    	
    	
    	
    	System.out.println("Enter column number of the land:");
    	columnno = console.nextInt();
    	
    	while (columnno <=0 || columnno > 10) {
    		System.out.println("Column should be greater than 0 and less than or equal to 10");
    		System.out.println("Enter column number of the land:");
    		columnno = console.nextInt();
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
		
        
        
        
        
        // If the either input is too small replace it with the smallest feasible size the land could be.
        
        
               
        // Create an object of class LandVille using the 'new' operator, calling on the LandVille constructor.
    	
//    	LandVille landville = new LandVille(rows, column, columnno, rowno);
    	
    	
        
        
        
       
    	
    	
    	 // Build a loop to display the menu, prompt for input and process it as per requirements.
    	int menu;
    	System.out.println("Choose from the menu: 1. Build a house, 2. Display land 3. Clear the land 4. Quit");
    	menu = console.nextInt();
    	
    	while (menu != 4) 
    	{
    		if (menu == 3)
    		{
//    			new LandVille().clearLand();
    			System.out.println("Choose from the menu: 1. Build a house, 2. Display land 3. Clear the land 4. Quit");
    			menu = console.nextInt();
    		}
    			
    		else if (menu == 1)
    		{
    			while (hasHouse == true) 
    			{
    				System.out.println("Choose from the menu: 1. Build a house, 2. Display land 3. Clear the land 4. Quit");
    			
    				menu = console.nextInt();
    				}
    				System.out.println("House already exists!");
    				System.out.println("Choose from the menu: 1. Build a house, 2. Display land 3. Clear the land 4. Quit");
        			menu = console.nextInt();
    			}
    			
    		else if (menu ==2)
    		{
    			while (hasHouse == false)
    			{
//    				LandVilleMain landville = new LandVilleMain();
//    				landville.Initialiseland(rowno, columnno);
    				
    				
    				System.out.println();
    				break;
    				
    			}
    				System.out.println("Choose from the menu: 1. Build a house, 2. Display land 3. Clear the land 4. Quit");
        			menu = console.nextInt();
    		}
    			
    		else 
    		{
    			System.out.println("Invalid Input");
    			System.out.println("Choose from the menu: 1. Build a house, 2. Display land 3. Clear the land 4. Quit");
    			menu = console.nextInt();
    		}
    			
    		System.out.println("Program Ends");
    		break;
    	}
    		
    		
    	
	
	
} 
	
    	
    		
    		
    	
    
    	
    	
    	
    	
    		
    		
    	
    
    		
    		
    	
    	
    	

	
	
    	

	
	
public class LandVille
{
		private int[][] land;
		private int rows;
		private int column;
		private int columnno;
		private int rowno;
		
		
		
		
		
	
		public void LandVille(int rows, int column, int columnno, int rowno) //constructor LandVille 
		{ 
			this.rows = rows;
			this.column = column;
			
			
		}
		
		public int[][] Initialiseland ()
		{
			
			
			for(int i=0; i<rowno;i++) 
	    	{
	    		
	    		for(int j=0; j<columnno;j++) 
	    		{
	    			land[i][j] = 0;
	    			
	    		}
	    	
	    	
	    		
	    	}
			return land;
			
		}
		
		
		
		public void buildHouse(int rowno, int columnno) 
		{

		Scanner console = new Scanner(System.in);
		System.out.println("Enter row of the house:");
		int rows = console.nextInt();
		int maxrows = rowno-2;
		int maxcolumns = columnno-2;
		while (rows <= maxrows && rows > 0)
			{
//				displayLand(rowsno, columnno);
				for (int i=0; i<=rows+1; i++)
				{
					
						System.out.println("Enter column of the house:");
						int columns = console.nextInt();
						while (columns<=maxcolumns && columns>0)
						{
							for (i=0; i<=rows+1; i++)
							{
								while (i==0||i==(rows+1))
								{
									for (int j=0; j<=columns+1; j++)
									{
										land[i][j]=1;
										System.out.print(land);
									}
								}
							}
							
							
							
						System.out.println("Invalid input. Column of house needs to less than or equal to " + maxcolumns + ". No house is built.");
						System.out.println("Enter column of the house:");
						columns = console.nextInt();
					}
				}
		System.out.println("Invalid input. Row of house needs to less than or equal to " + maxrows + ". No house is built.");
				
			}	
		}
		
		public void clearLand() 
		{
			Initialiseland();
			System.out.println("land cleared");
			System.out.println(land);
		
		}

		public int[][]displayLand(int rowno,int columnno) 
		{
			
			return land;	
		}
	
	}

}		
	
	
	






