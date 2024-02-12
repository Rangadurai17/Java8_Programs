package j8;

import java.util.List;

public class demo_terminal {

	public static void main(String[] args) {
		List<Integer> ll=List.of(2,4,3,4,1,4,7,8);
		
//		boolean bb=ll.stream().allMatch(n->n>60);
//		System.out.println(bb);
//		
//		boolean tt=ll.stream().anyMatch(n->n>60);
//		System.out.println(tt);
//		
//		boolean oo=ll.stream().noneMatch(n->n>60);
//		System.out.println(oo);
//		
//		System.out.println("count");
//		long a=ll.stream().filter(n->n%2==0).count();
//		System.out.println(a);
//		
//		System.out.println("limit");
//		ll.stream().limit(3).forEach(n->System.out.println(n));
//		
//		System.out.println("skip");
//		ll.stream().skip(2).forEach(n->System.out.println(n));
		
		System.out.println("minimum value");
		ll.stream().sorted((aa,b)->aa-b).limit(1).forEach(n->System.out.println(n));
		
		System.out.println("maximum value");
		ll.stream().sorted((aa,b)->b-aa).limit(1).forEach(n->System.out.println(n));
		
		System.out.println("duplicate count");
		long l=ll.stream().distinct().count();
		long s=ll.size()-l;
		System.out.println(s);
		
		System.out.println("cube value");
		ll.stream().map(n->(n*n*n)).forEach(n->System.out.println(n));
	}

}
