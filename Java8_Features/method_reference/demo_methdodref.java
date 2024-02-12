package jeevi_practice;

import java.util.function.*;

public class demo_methdodref {

	public static void main(String[] args) {
		demo_methdodref dd1=new demo_methdodref();
		Predicate<Integer> p=dd1::m1;
		System.out.println(p.test(9));
	}
	
	private boolean m1(int a)
	{
		return a>2?true:false;
	}

}
