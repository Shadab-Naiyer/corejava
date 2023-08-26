class Pattern
{
	static int i ,j;
static int m1(){

for(i=1;i<=8;i++){
for(j=1;j<=8;j++)
{
if(i==1&&j==1||i==1&&j==2||i==1&&j==3||i==2&&j==1||i==3&&j==1||i==4&&j==1||i==4&&j==2||i==4&&j==3||

i==5&&j==3||i==6&&j==3||i==7&&j==3||i==7&&j==2||i==7&&j==1){

System.out.print("Shadab");
}
else{
System.out.print("      ");
}
}
System.out.print("\n");

}
return 0;
}	
static int m2(){
       for(i=1;i<=8;i++){
       for(j=1;j<=8;j++)
  {
       if(i==1&&j==1||i==2&&j==1||i==3&&j==1||i==4&&j==1||i==5&&j==1||i==6&&j==1||i==7&&j==1||i==4&&j==2||

         i==1&&j==3||i==2&&j==3||i==3&&j==3||i==4&&j==3||i==5&&j==3||i==6&&j==3||i==7&&j==3){

        System.out.print("Shadab");
      }
    else{
      System.out.print("      ");
     }
     }
       System.out.print("\n");
     }
	 return 0;
     }	
static int m3(){
     
       for(i=1;i<=8;i++){
       for(j=1;j<=8;j++)
  {
       if(i==1&&j==1||i==2&&j==1||i==3&&j==1||i==4&&j==1||i==5&&j==1||i==6&&j==1||i==7&&j==1||
	             i==1&&j==2||i==4&&j==2||i==1&&j==3||i==2&&j==3||i==3&&j==3||i==4&&j==3||i==5&&j==3||
				 i==6&&j==3||i==7&&j==3){

        System.out.print("Shadab");
      }
    else{
      System.out.print("      ");
     }
     }
       System.out.print("\n");
     }
	 return 0;
     }
static int m4(){
    
       for(i=1;i<=8;i++){
       for(j=1;j<=8;j++)
  {
       if(i==1&&j==1||i==2&&j==1||i==3&&j==1||i==4&&j==1||i==5&&j==1||i==6&&j==1||i==7&&j==1||
	             i==1&&j==2||i==7&&j==2
				 ||i==2&&j==3||i==3&&j==3||i==4&&j==3||i==5&&j==3||i==6&&j==3)
				 {

        System.out.print("Shadab");
      }
    else{
      System.out.print("      ");
     }
     }
       System.out.print("\n");
     }
	 return 0;
     }	 
 static int m5(){
     
       for(i=1;i<=8;i++){
       for(j=1;j<=8;j++)
  {
       if(i==1&&j==1||i==2&&j==1||i==3&&j==1||i==4&&j==1||i==5&&j==1||i==6&&j==1||i==7&&j==1||
	             i==1&&j==2||i==4&&j==2 ||i==7&&j==2||
				 i==2&&j==3||i==3&&j==3||i==5&&j==3||i==6&&j==3)
				 {

        System.out.print("Shadab");
      }
    else{
      System.out.print("      ");
     }
     }
       System.out.print("\n");
     }
	 return 0;
     }	 
public static void main(String []args)

{
	
	System.out.print(m1()+""+m2()+""+m3()+""+m4()+""+m3()+""+m5());
	/*Pattern s1=new Pattern();
	s1.m1();//s
	s1.m2();//h
	s1.m3();//a
	s1.m4();//d
	s1.m3();//a
	s1.m5();//b=*/
	}}