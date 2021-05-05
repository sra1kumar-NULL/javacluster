package dsa;

public class Stack {

	int Array[]=new int[5];
	int top=0;
	public void push(int data)
	{
		Array[top]=data;
		top++;
	}
	public int pop()
	{
		int data;
		top--;
		data=Array[top];
		Array[top]=0;
		return data;
	}
	public void display()
	{

		for(int i=0;i<=top;i++)
		{

			if(Array[i]!=0)
			{
				System.out.println(Array[i]);

			}
		}
	}


}
