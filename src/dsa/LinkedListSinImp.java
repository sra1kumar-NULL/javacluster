package dsa;

public class LinkedListSinImp {

	public static void main(String[] args) {
		 LinkedListSin<String> slinls=new LinkedListSin<String>();
		 slinls.add("Macintosh");
		 slinls.add("Ubuntu");
		 slinls.add("Windows");
		 slinls.add("Fedora");
		 slinls.display();
		 slinls.del();
		 slinls.display();	 
	}

}
