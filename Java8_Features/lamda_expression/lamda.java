package j8;

@FunctionalInterface
interface a
{
	void age(int a);
}

public class lamda {

	public static void main(String[] args) {
		a aa=b->{
			if(b<18)
				{
				System.out.println("not eligible for vote");
				}
			else
				{
				System.out.println("eligible for vote");
				}
				};
				
		aa.age(32);
	
	}
}
