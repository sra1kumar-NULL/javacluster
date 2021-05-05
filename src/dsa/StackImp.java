package dsa;

import dsa.Stack;

public class StackImp {

	public static void main(String[] args)
	{
		Stack st=new Stack();
		st.push(1);
		st.push(3);
		st.display();
		st.push(4);
		System.out.print("Poped out :"+st.pop()+"\n");
		st.display();
	}
	
}
