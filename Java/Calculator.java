class Calculator{
	static int add=addition(4,5);
	static int sub=substraction(3);
	static int addition(int b,int c){
		int d=b+c;
     System.out.println("addition"+" "+d);
     return d;		
		
	}
	static int substraction(int e){
		int f=add-e;
		System.out.println("substration"+" "+f);
     return f;
	}
	static int division(int g){
		
		int h=sub/g;
		int i=sub%g;
		System.out.println("division"+" "+h);
				System.out.println("remainder"+" "+i);

     return g;
	}
	
	public static void main(String arg[]){
		
		division(2);
	}
	
}