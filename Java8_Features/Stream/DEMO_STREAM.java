package j8;

import java.util.*;
import java.util.stream.Stream;

public class DEMO_STREAM {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(45);
		al.add(56);
		al.add(77);
		al.add(32);
		al.add(54);
		al.add(45);
		
//		al.stream().filter(n->n%2==0).map(n->n-1).forEach(n->System.out.println(n));
		
		
		Stream<Integer> ss=al.stream();
		ss.sorted((n1,n2)->n2-n1).distinct().forEach(n->System.out.println(n));
		
		String[] s= {"sandhya","aruna","aparna","santhi","shyamala"};
		
		Arrays.stream(s).filter(n->n.charAt(0)=='s').map(n->n.replace('s', 'S')).forEach(n->System.out.print(n+" "));

	}

}
	