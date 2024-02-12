package jeevi_practice;

import java.util.function.*;

public class demo_function {

	public static void main(String[] args) {
		Function<Integer, Integer> ff=n->n+1;
//		Function<String, Integer> ff=n->n.length();
//		Integer i=ff.apply("hello");
//				System.out.println(i);
		Function<Integer, Integer> ff1=n->n*2;
		
		System.out.println(ff.compose(ff1).apply(10));//compose first going to the var in bracket after opertion  the value goes to the first reference var
		System.out.println(ff.andThen(ff1).apply(10));//compose first going to the var in without bracket after opertion  the value goes to the with bracket var
		
		BiFunction<String,Integer,String> bf=(n,n1)->n+n1;
		System.out.println(bf.apply("jee",78));
		
		BiFunction<String,Integer,String> bf1=(n,n1)->n+n1;
		System.out.println(bf.apply("hee",87));
//		v System.out.println(bf.andThen(bf1).apply(10));
		
		
		
	}

}
