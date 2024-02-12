package j8;

import java.util.ArrayList;

public class demo_map {
	int id;
	String name;
	int age;
	String gender;
	
	demo_map(int id,String name,int age,String gender)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
	}

	public static void main(String[] args) {
		ArrayList<demo_map> al=new ArrayList<demo_map>();
		al.add(new demo_map(7,"jee",21,"female"));
		al.add(new demo_map(4,"prithvi",23,"male"));
		al.add(new demo_map(8,"moni",20,"female"));
		
		al.stream().map(n->n.age).sorted().forEach(n->System.out.println(n));
		al.stream().map(n->n.name).sorted().forEach(n->System.out.println(n));
		
		System.out.println("genderwise name finding");
		al.stream().filter(n->(n.gender.equals("female"))).forEach(n->System.out.println(n.name));

	}

}
