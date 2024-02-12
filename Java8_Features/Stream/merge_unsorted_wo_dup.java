package practice_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class merge_unsorted_wo_dup {

	public static void main(String[] args) {
		/*int[] a= {2,4,1,7,2,9};
		
		int[] b= {4,9,5,3,1,4,3};
		
		
		
		int c[]=IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().sorted().toArray();
		for(int d:c)
		{
			System.out.println(d);
		}*/
		List <Integer>r=List.of(10,20,30,40,50,60);
		
		int c=r.stream().max((a,b)->a-b).get();
		System.out.println(c);
		
		int d=r.stream().min((a,b)->a-b).get();
		System.out.println(d);
		
		
		
		
		
		
		

	}

}
