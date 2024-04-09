package learning.ArrayList;

import java.util.*;



public class LaunchAL 
{

	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		System.out.println("**************************");
		
		ArrayList list2=new ArrayList();
		
		list2.add(10);
		list2.add('J');
		list2.add("Java");
		list2.add(44.5);
		
		System.out.println(list2);
		
		System.out.println("**************************");
		
		List list3=new ArrayList();
		
		list3.addAll(list2);
		list3.add("list 2  + this message");
		System.out.println(list3);
		list3.add(2, "SpringBoot");
		System.out.println(list3);
		list3.add("10");
		System.out.println(list3);
		list3.addAll(6, list);
		System.out.println(list3);
		System.out.println(list3.get(4));
		String obj=(String) list3.get(2);
		System.out.println(list3.isEmpty());
		
		
		
		
		

	}

}
