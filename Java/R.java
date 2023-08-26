/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class R
{
	public static void main(String[] args) {
	    
	    for(int i=1;i<=6;i++){
	       
	        for(int j=1;j<=4;j++){
	       
	       if (i==1&&j==4||i==3&&j==4)
	       {
	           	                System.out.print("  ");

	       }
	  else if (j==1||i==1||i==3||i==2&&j==4||i==2+j){
	                
	                System.out.print("* ");
	                 }
	                 
	                 
	    else{
	          System.out.print("  ");

	                 }}
	                 
	                   System.out.print("\n");

	        }
	    }	}
