class Teacher{
	  static{
		
				System.out.println("Teacher's Name:Ahmad Sir");

	}
	
	static int opr=solve_question(12,4,6);
	
	static void teach(){
     System.out.println("giving knowledge");
     		
	}
	
	static int solve_question(int a ,int b,int c){
		Teacher s2=new Teacher();
		s2.take_lecture();
		int f=a+b-c;
		System.out.println("solve"+" "+f);
     return f;
	}
	void take_lecture(){
		teach();
		System.out.println("English");
				System.out.println("Hindi"+"\n"+"Physics");
	}
	
	public static void main(String arg[]){
		
		
	}
	
}