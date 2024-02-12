package j8;

interface jee
{
	void m1(int a);
}

public class demo_constructor_methref {
	
	demo_constructor_methref(int a)
	{
		System.out.println("floute");
	}
	

	public static void main(String[] args) {
		jee jj=demo_constructor_methref::new;
		jj.m1(90);
		

	}
	
	

}
