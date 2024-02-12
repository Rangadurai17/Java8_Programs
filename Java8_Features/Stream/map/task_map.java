package j8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class one
{
	String pro_name;
	int pro_id;
	
	one(String name,int id)
	{
		pro_name=name;
		pro_id=id;
	}
	
	String getpro_name()
	{
		return pro_name;
	}
	
	int getpro_id()
	{
		return pro_id;
	}
}

class two
{
	String u_name;
	int u_id;
	String address;
	
	two(String name,int id,String add)
	{
		u_name=name;
		u_id=id;
		address=add;
	}
	
	String getu_name()
	{
		return u_name;
	}
	
	int getu_id()
	{
		return u_id;
	}
	
	String getaddress()
	{
		return address;
	}
	
	
	
}
public class task_map {
	public String toString()
	{
		two bb=new two("preethi",345,"namakkal");
		return bb.getu_name()+" "+bb.getaddress()+" "+bb.getu_id();
	}
	
	public static void main(String[] args) {
		one aa=new one("mobile",987);
		ArrayList al=new ArrayList();
//		al.add(new a("laptop",567));
		al.add(aa);
	
		two bb=new two("preethi",345,"namakkal");
		ArrayList al1=new ArrayList();
//		al1.add(new b("jeevi",123,"salem"));
		al1.add(bb);
		
		Iterator ii=al1.iterator();
		while(ii.hasNext())
		{	
		HashMap hm=new HashMap();
		hm.put(aa.getpro_name(),al1);
		hm.put(aa.getpro_id(),al1 );
		
		
		for(int i=1;i<hm.size();i++)
		{
				System.out.println(hm);
		}
		
		
	}

	}}
