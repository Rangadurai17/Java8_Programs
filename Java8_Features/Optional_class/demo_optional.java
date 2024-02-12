package j8;

import java.util.List;
import java.util.Optional;

public class demo_optional {

	public static void main(String[] args) {
		String ss[]= new String[10];
			
		Optional str=Optional.ofNullable(ss[5]);
		
		List<Integer> l1=List.of(10,30,20,40,35);
		Optional <Integer> h1=l1.stream().findFirst();
		System.out.println(h1.get());
		
		Integer ii=l1.stream().findFirst().get();
		System.out.println(ii);
		
		int aa=l1.stream().max((a,b)->a-b).get();
		System.out.println(aa);
		
		l1.stream().sorted((a,b)->a-b).skip(1).limit(1).forEach(n->System.out.println(n));
		
		l1.stream().sorted((a,b)->b-a).skip(1).limit(1).forEach(n->System.out.println(n));
		
		

	}

}
