class Kpattern {
 
    public static void main(String[] args) {
         
        int n = 5;
         
        for(int i=1; i<=6;i++) {
			 for(int j=1; j<=4; j++) {
                 
				 if(j==1||i==5-j||i==j+2){
                System.out.print("*");
			 }
			 else{
				 
				 System.out.print(" ");
			 }
			 
			 }
             
           
             
            System.out.println();
        }
}}