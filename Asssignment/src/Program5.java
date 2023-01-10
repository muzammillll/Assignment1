
public class Program5 {

	public static void main(String[] args) {
		
		
		// Program 5
		
		
				int n=14;
				for(int i=0;i<n;i++)
			    {
			    	for(int j=0;j<n;j++)
			    	{
			    		if(i==0 || i==n-1 || j==0 || i==1&j<=(n/2)-2 || i==2&j<=(n/2)-3 || i==3&j<=3
			    				|| i==4&j<=2 || i==(n/2)-2&j<=1  || i==n/2&j<=1 || i==(n/2)+1&j<=2 ||
			    				i==(n/2)+2&j<=3 || i==(n/2)+3&j<=(n/2)-3 || i==n-3&j<=(n/2)-2
			    				||  i==n-2&j<=(n/2)-1) 
			    		{
			    			System.out.print("*");
			    		}
			    		
			    		else
			    		{
			    			System.out.print(" ");
			    		}
			    	}
			    	
			    	System.out.println();
				
			    }

	}

}
