package dsa.hash;

public class Entry {
Object value;
int key;
Entry next;
	public Entry(Object value,int key) {
		this.value=value;
		this.key=key;
		next=null;
		
	}
	public Entry()
	{
		next=null;
	}
	public int getKey() {
		return key;
	}
	public Object getVal()
	{
		return value;
	}
}
