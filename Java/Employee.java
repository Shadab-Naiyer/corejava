class Employee{
 int b=40000;
void m1()
 {
	 
	    System.out.println("m1: ");

 }
}

class Programmer extends Employee{
 int b=10000;
 void m1()
 {
	 	    System.out.println("m2: ");

 }
 public static void main(String args[]){
Employee p=new Programmer()  ;
p.m1();
   System.out.println("Programmer salary is:   "+p.b);
   System.out.println("Bonus of Programmer is:");
  
}
}