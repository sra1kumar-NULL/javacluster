package collections;

import java.util.ArrayList;

public class Arrays {
	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("dev");
		arr.add("tester");
		arr.add("manager");
		arr.remove(1);
		for(String st:arr)
		System.out.println(st);
		//array clas
		ArrayList<employee> emp=new ArrayList<employee>();
		emp.add(new employee("sam",21));
		emp.add(new employee("ollie",22));
		emp.add(new employee("Tom",24));
		for(employee st:emp)
			System.out.println(st.name);
	}
	static class employee{
		String name;
		int age;
		public employee(String name , int age) {
			this.name=name;
			this.age=age;
		}
	}
}
