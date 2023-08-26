class Staticpri
{
	static int a=m1();
static
{
 m1();
System.out.println("static block1");
}

static int m1(){
System.out.println("static method"+a);
return 1;
}
public static void main(String args[])
{
m1();
System.out.println("main method"+a);
System.out.println(m1());

}



}