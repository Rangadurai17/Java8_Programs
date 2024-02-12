package j8;

import java.util.ArrayList;

public class task_stream {
	String name,dep;
	int id,sal,ex;
	
	task_stream(String name,String dep,int id,int sal,int ex)
	{
		this.name=name;
		this.dep=dep;
		this.id=id;
		this.sal=sal;
		this.ex=ex;
	}
	
	String getname()
	{
		return name;
	}
	
	void setname(String name)
	{
		this.name=name;
	}
	
	String getdep()
	{
		return dep;
	}
	
	void setdep(String dep)
	{
		this.dep=dep;
	}
	
	int getid()
	{
		return id;
	}
	
	void setid(int id)
	{
		this.id=id;
		
	}
	
	int getsal()
	{
		return sal;
	}
	
	void setsal(int sal)
	{
		this.sal=sal;
		
	}
	
	int getex()
	{
		return ex;
	}
	
	void setex(int ex)
	{
		this.ex=ex;
	}
	
	public String toString()
	{
		return name+" "+dep+" "+id+" "+sal+" "+ex;
	}
	
	
	public static void main(String[] args) {
		ArrayList<task_stream> al=new ArrayList();
		
		al.add(new task_stream("jeevitha","developer",24,50000,4));
		al.add(new task_stream("monica","developer",67,60000,5));
		al.add(new task_stream("preethi","tester",102,35000,2));
		al.add(new task_stream("raha","tester",74,80000,5));
		al.add(new task_stream("mahee","networking",78,20000,1));
		al.add(new task_stream("bhama","networking",29,55000,4));
		al.add(new task_stream("jothi","analyist",88,30000,2));
		al.add(new task_stream("dhana","analist",18,95000,6));
		
		al.stream()
		.sorted((n1,n2)-> n1.getdep().compareTo(n2.getdep()))
		//.filter(n->n.getdep().equals("developer"))
		//.filter(n->n.getex()>3)
	    .map(n->n.getsal()+1000+" "+n.getname()+" "+n.getdep()+" "+n.getex())
//		.map(n->n.setsal(this.sal+1500))
		.forEach(n->System.out.println(n));
		
						//.forEach(System.out::println));
		
//		al.stream().filter(n->n.getdep().equals("developer"))
//				.filter(n->n.getex()>3)
//				.map(n->n.setsal(sal+15000))
//				.sorted((n1,n2)->n1.getnamen2.getname)
//				.forEach(n->System.out.println(n));		

	}

}
