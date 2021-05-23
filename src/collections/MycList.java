package collections;
import java.util.Iterator;
import java.util.LinkedList;
public class MycList {
	public static void main(String[] args) {
		LinkedList<String> ls=new LinkedList<String>();
		ls.add("sam");
		ls.add("tom");
		ls.add("elliot");
		Iterator<String> itr =ls.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
