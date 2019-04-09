package Main;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    {
		        // A: constructor method (create and initialize land array, hasHouse variable)
		    	Scanner console = new Scanner(System.in);
		    	int rowno, columnno, menuNo;
		    	System.out.println("Enter row number of the land:");
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
		    	
		    	
		    	
		    	
		    		
		    		
		    	
		    			
		    	
		    	
		    	//create array
		    	int a[][] = new int [rowno][columnno];
		    	for(int i=0; i<rowno;i++) 
		    	{
		    		
		    		for(int j=0; j<columnno;j++) 
		    		{
		    			a[i][j] = 0;
		    			System.out.print(a[i][j] + " ");
		    		}
		    	
		    	
		    		System.out.println();
		    	}
		    
	}
}}
		    	
		    	
		    

	

	

