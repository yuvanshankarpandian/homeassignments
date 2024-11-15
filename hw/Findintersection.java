package hw;

public class Findintersection {

	public static void main(String[] args) {
		int a1[]={3,2,11,4,6,7}; 
        int b1[]={1,2,8,4,9,7}; 
        
        for(int i=0;i<a1.length;i++)
        {
      	  for(int j=0;j<b1.length;j++)
      	  {
      		  if(a1[i]==b1[i])
      		  {
      			  System.out.println("Number Matches" + a1[i]);
      			  break;
      		  }
      	  }
        }
        
   }

	}


