
public class Program3 {

	public static void main(String[] args) {
		// Program 3
		
		int n=7;
		 int m=14;
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 if(i==0&j<=n-1 || j==0&i<=n-1 || i==1&j<n-1 || i==2&j<n-2 || i==3&j<(n-1)/2+1 ||
						 i==4&j<(n-1)/2 || i==5&j<(n-3)/2)
				 {
					 System.out.print("*"); 
				 }
				 else
				 {
					 System.out.print(" "); 
			      }
			
		     }
			 
			 
			 
			 for(int j=0;j<n;j++)
			 {
				 if(i==0&j<=n-1 || i==1&j<=n-1 || i==2&j>0&j<=n-1 || i==3&j>1&j<=n-1 ||
						 i==4&j>2&j<=n-1 || i==5&j>3&j<=n-1 || i==n-1&j>(n+1)/2&j<=n-1)
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
	     
	  
		 
	    	 
	  for(int r=0;r<m;r++) 
	  {
		  for(int c=0;c<m;c++)
		  {
			  if(c==0&r<=n-1 || c==m-1&r<=n-1 || r==n-1&c<=m-1 )
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
