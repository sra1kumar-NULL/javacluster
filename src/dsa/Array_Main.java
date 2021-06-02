package dsa;

public class Array_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dyna_Array arr=new Dyna_Array(3);
		arr.insert(10);
		arr.insert(20);
		arr.insert(30);
		arr.insert(40);
		arr.remove(3);
		System.out.println(arr.indexOf(20));
		arr.print();
	}

}
