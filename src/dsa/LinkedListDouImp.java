package dsa;

public class LinkedListDouImp {

	public static void main(String[] args) {
		LinkedListDou<String> dlnkls=new LinkedListDou<String>();
		dlnkls.add("KaliLinux");
		dlnkls.add("BackTrack");
		dlnkls.add("ParrotOs");
		dlnkls.add("RedHatEnt");
		dlnkls.displayFromBeg();
		dlnkls.del();
		dlnkls.displayFromBack();
		
		
	}

}
