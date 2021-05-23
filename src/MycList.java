import java.util.*;
public class MycList {
	public static void main(String[] args) {
		LinkedList<String> ls=new LinkedList<String>();
		ls.add("sam");
		ls.add("tom");
		ls.add("elliot");
		Iterator<String> itr =ls.iterator();
		for(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
