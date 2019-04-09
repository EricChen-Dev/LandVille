package Assignment1;
//import whatever packages are needed here
//Programming note: this class does NOT need to do any input
//at all. All the input should occur in LandVilleMain.java
//
//If you find yourself needing to do input here rethink your solution.


class LandVille {
	private int[][] land;
	private int i;
	private int j;
	// you will need to add the variable 'hasHouse'
	static boolean hasHouse;
	

	// Constructor...
	// Assumption - rows and columns has been validated beforehand.
	// Create the array that the land variable above will reference (using the 'new' operator)
	// Initialise the land so that each cell is set to the character '0' (hint: use one of your
	// methods!).
	// Set the value of any other variables
	public LandVille (int maxRows, int maxColumns, boolean hasHouse) 
	{
		hasHouse = this.hasHouse;
		land = new int [maxRows][maxColumns];

		for(i=0; i<maxRows;i++) 
    	{
    		
    		for(j=0; j<maxColumns;j++) 
    		{
    			land[i][j]=0;
	
    		}
    	}
	}
	
	
	// Display the land grid
	public void displayLand() {
		
		for(i=0; i<land.length;i++) 
    	{
    		
    		for(j=0; j<land[0].length;j++) 
    		{
    			System.out.print(land[i][j] + " ");	
    		}
    	
    		System.out.println("");
    	}	
	}
	
	
	// Clear out the land. This involves setting each cell to be the character '0'
	public void clearLand() {
		
		for(i=0; i<land.length;i++) 
    	{
    		
    		for(j=0; j<land[0].length;j++) 
    		{
    			land[i][j]=0;
    		}
    	}
		
		displayLand();
		System.out.println("Land Cleared");
		
		hasHouse=false;
		}
	
	
	// Build a house
	// Validate the inputs to ensure they make sense for the size of the land
	// 		- display an error message and return if they don't.
	
	// Ensure none of the other rules are violated
	//		- again display an error message and return if they are violated
	
	// If all is ok "build" the house on the land (using the character '8') surrounded
	// by a pretty little fence of '1' characters.
	// Finally update 'hasHouse' and call on displayLand().
	
	public void buildHouse(int rows, int columns) {
		
		while (rows <= (land.length-2) && rows > 0)
		{
			
			while (columns <= (land[0].length-2) && columns >0)
			{
		
				for (i=0; i<land.length;i++) 
		    	{
					for (j=0; j<land[0].length; j++)
					{
						if (i==0||i==(rows+1))
						{
							if (j>=0 && j<=(columns+1))
							{
								land[i][j] = 1;
							}
							else land [i][j]=0;
						}
						else if (i>=1 && i<=rows)
						{
							if (j>=1 && j<=columns)
							{
								land[i][j] = 8;
							}
							else if (j==0 || j==(columns+1))
							{
								land[i][j] = 1;
							}
							else land [i][j]=0;
						}
						else land[i][j]=0;
						hasHouse = true;
						
						
						System.out.print(land[i][j]+" ");
					
					}
					System.out.println("");
				}
				return;
			}
			System.out.println("Invalid input. Column of house needs to less than or equal to " + (land[0].length-2) + ". No house is built.");
			return;
		}
		
	
	System.out.println("Invalid input. Row of house needs to less than or equal to " + (land.length-2) + ". No house is built.");
	return;
	}
}
