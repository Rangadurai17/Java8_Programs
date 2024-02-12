package j8;

public class runnable234{

	public static void main(String[] args) {
		Runnable rr=()->{
			for(int i=1;i<=5;i++)
			{
				System.out.println("hello");
			}
			
		};
		runnable234	r=new runnable234();		
		Thread tt=new Thread(rr);
		tt.start();
		for(int i=6;i<=10;i++)
		{
			System.out.println(i);
		}

	}
}
