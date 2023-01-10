
public class IneuronPattern {

	public static void main(String[] args) {
		// Ineuron Pattern
		
		
		
int n=8;	
	    
	    for(int i=0;i<n;i++)
	    {
	    	for(int j=0;j<n;j++)
	    	{
	    		if(i==0&j>=0&j<=n-1 || i>=1&j==(n-1)/2 || i==n-1&j>=0&j<=n-1)
	    		{
	    			System.out.print("*");
	    		}
	    		
	    		else
	    		{
	    			System.out.print(" ");
	    		}
	    	}
	    	
	    	System.out.print("  ");
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	for(int j=0;j<n;j++)
	    	{
	    		if(j==0 || j==n-1 || j==i)
	    		{
	    			System.out.print("*");
	    		}
	    		
	    		else
	    		{
	    			System.out.print(" ");
	    		}
	    	}
	    	
	    	System.out.print("  ");
	    	
	    	for(int j=0;j<n;j++)
	    	{
	    		if(i==0 || i==n-1 || j==0 || i==n/2)
	    		{
	    			System.out.print("*");
	    		}
	    		
	    		else
	    		{
	    			System.out.print(" ");
	    		}
	    	}
	    	
	    	
	    	
	    	
	    	
	System.out.print("  ");
	    	
	    	for(int j=0;j<n;j++)
	    	{
	    		if(j==0&i>=0&i<=n-2 || i==n-1&j>0&j<=n-2 || j==n-1&i>=0&i<=n-2)
	    		{
	    			System.out.print("*");
	    		}
	    		
	    		else
	    		{
	    			System.out.print(" ");
	    		}
	    	}
	    	
	    	System.out.print("  ");
	    	
	    	
	    	
	    	for(int j=0;j<n;j++)
	    	{
	    		if(i==0 || j==0 || i==n/2 || j==n-1&i>=0&i<=n/2 || (i==n/2+1)&(j==n/2+1) || (i==n/2+2)&(j==n/2+2) || (i==n-1)&(j==n-1)) 
	    		{
	    			System.out.print("*");
	    		}
	    		
	    		else
	    		{
	    			System.out.print(" ");
	    		}
	    	}
	    	
	    	System.out.print("  ");
	    	
	    	for(int j=0;j<n;j++)
	    	{
	    		if(i==0&j>0&j<=n-2 || j==0&i>0&i<=n-2 || j==n-1&i>0&i<=n-2 || i==n-1&j>0&j<=n-2)
	    		{
	    			System.out.print("*");
	    		}
	    		
	    		else
	    		{
	    			System.out.print(" ");
	    		}
	    	}
	    	
	    	System.out.print("  ");
	    	
	    	
	    	for(int j=0;j<n;j++)
	    	{
	    		if(j==0 || j==n-1 || j==i)
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
