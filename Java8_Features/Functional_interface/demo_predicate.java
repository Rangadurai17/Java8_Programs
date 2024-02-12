package jeevi_practice;

import java.util.Scanner;
import java.util.function.*;

public class demo_predicate {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your age");
		int a=sc.nextInt();
		
		Predicate<Integer> p=n->n>=18;
		
		boolean c=p.test(a);
		if(c=true)
		{
			System.out.println("eligible");
		}
		else
		{
			System.out.println("not eligible");
		}
			
			
//		Predicate<Integer> p1=j->j==98;
		
//		System.out.println(p.test(78));
//		System.out.println(p1.and(p).test(98));
//		System.out.println(p1.or(p).test(98));
//		System.out.println(Predicate.not(p).test(98));
		
		
		
		
		
		
		BiPredicate<String,String> bp=(n,n1)->n.length()==n1.length();
		System.out.println(bp.test("hello", "world"));
		
		BiPredicate<String,String> bp1=(n,n1)->n.length()==n1.length();
		System.out.println("bipredicate "+bp.or(bp1).test("hellohf", "world"));

	}

}
