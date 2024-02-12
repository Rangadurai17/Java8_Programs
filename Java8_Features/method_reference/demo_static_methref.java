package j8;


interface yyyy
{
	public int m1();
}

public class demo_satatic_methref {
	
		public static void main(String[] args) {
			
			yyyy hh=demo_satatic_methref::m2;
			
			System.out.println(hh.m1());

		}
		
		private static int m2()
		{
			return 56;
		}

	}


