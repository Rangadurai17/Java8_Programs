package j8;

import java.util.Optional;

public class demo_optional123 {

	public static void main(String[] args) throws Throwable {
		Optional op=Optional.of(null);
//		System.out.println(op);
//		System.out.println(op.get());//printing without wrap
		System.out.println(op.isEmpty());
//		System.out.println(op.isPresent());
		op.ifPresent(n->System.out.println(n));
		System.out.println("present " +op.isPresent());
		if(op.isPresent())
		{
			System.out.println("present");
		}
		
//		Optional op1=Optional.of(null);//throwing null pointer exception
//		System.out.println(op);
		
		
		Optional op2=Optional.ofNullable(null);//it doesn't throw null pointer exception
		System.out.println(op2);
//		System.out.println(op2.get());
		op2.ifPresent(n->System.out.println(n));
		System.out.println(op2.isPresent());
		if(op2.isPresent())
		{
			System.out.println("jee");
		}
		else
		{
			System.out.println("not");
		}
		
//		op=Optional.empty();//used to make the obj empty
//		System.out.println(op);
		
		System.out.println(op2.orElse("hekkko"));
		System.out.println(op2.orElseGet(()->"uuuuuvvv"));
//		System.out.println(op2.orElseThrow());
		System.out.println(op2.orElseThrow(ArrayIndexOutOfBoundsException::new));//using new the predefined constructor was used and withthat our coustomized exception was throwed

	}

}
