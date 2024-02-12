package jeevi_practice;
import java.util.function.*;
public class demo_consumer {

	public static void main(String[] args) {
		Consumer <Integer> c=a-> System.out.println(a);
		c.accept(67);
		
		BiConsumer<Integer,Integer> c1=(a,b)-> System.out.println(a+b);
		c1.accept(67,3);
		
		BiConsumer<Integer,Integer> c2=(a,b)-> System.out.println(a+b);
		c1.accept(67,3);

	}

}
