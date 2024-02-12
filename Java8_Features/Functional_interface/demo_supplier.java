package jeevi_practice;

import java.util.function.Supplier;

public class demo_supplier {

	public static void main(String[] args) {
		Supplier<Integer> s=()->{
			int a=78;
			int b=2;
			return a+b;
		};
		System.out.println(s.get());

	}

}
