package practice_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddAndEven {

	public static void main(String[] args) {
		List<Integer> st=List.of(2,3,4,5,6);
		
		ArrayList<Integer> al=new ArrayList();
		al.add(6);
		al.add(2);
		al.add(7);
		al.add(5);
		
		System.out.println("even number");
		st.stream().filter(n->n%2==0).forEach(n->System.out.print(n+" "));
		
		System.out.println();
		System.out.println("odd number");
		st.stream().filter(n->n%2!=0).forEach(n->System.out.print(n+" "));
		
		System.out.println();
		System.out.println("using collector");
		Map<Boolean, List<Integer>> u=st.stream().collect(Collectors.partitioningBy(n->n%2==0));
		System.out.println(u);
	}

}
