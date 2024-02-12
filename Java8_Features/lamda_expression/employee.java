package j8;


interface c
{
	void m1(String name,String id,String dep);
	
}

interface b
{
	void m2(int salary,int exp);
	
}


public class employee {

	public static void main(String[] args) {
		c aa=(name,id,dep)->{
			System.out.println("name "+name );
			System.out.println("id "+id);
			System.out.println("dep "+dep);
		};
		b bb=(sal,exp)->{
			if(sal>45000&&exp>2)
			{
				System.out.println("eligible to increament");
				System.out.println("providing increament 10000");
				sal=55000;
				System.out.println("salary "+sal);
				
			}
			else
			{
				System.out.println("not eligible to increament");
			}
		};
			
		aa.m1("jeevi", "ab123", "developing");
		bb.m2(50000, 3);

	}

}
