class Rpattern {
 
    public static void main(String[] args) {
         
         
        for(int i=1; i<=6;i++) {
			 for(int j=1;j<=4; j++) {
                 
				 if(i==1||i==3||j==1||i==2&&j==4||i==j+2){
                System.out.print("* ");
			 }
			 else{
				 
				 System.out.print("  ");
			 }
			 
			 }
             
           
             
            System.out.println();
        }
}}