package j8;


interface hello
{
	public int m1();
}

public class demo_ins_methref {
	
	public static void main(String[] args) {
		demo_ins_methref dd=new demo_ins_methref();
		hello hh=dd::m2;
		
		System.out.println(hh.m1());

	}
	
	private int m2()
	{
		return 56;
	}

}
