class Superthis {
Superthis()
{



}
public void display()
{
	

System.out.println("parrent class display");

} 
}
class Subexample extends Superthis
{
	Subexample()
{

}
public void display()
{
super.display();
System.out.println("child class");
}

public void show(){

System.out.println("show");
display();
}

public static void main(String [] args){

Subexample obj=new Subexample();
obj.show();
}

}
