class addsym
{
public static void main(String []arg)
{ 
int a=1;
int j=1;
		for ( j=1;j<=6;j++){
			if(j==6){
			j=0;
				System.out.print("\n");

			}

				else{
				++a;
				System.out.print(" ");
				}			
         if(j==3||a==11||a==12||a==14||a==15){
	
					System.out.print("*");
            }
		
     if (a==26){
		   break;
}
					}
}}