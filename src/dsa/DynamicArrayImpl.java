package dsa;

public class DynamicArrayImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			DyanamixArraySrc<Integer> da= new DyanamixArraySrc<Integer>();
			da.putElement(11);
			da.putElement(12);
			da.putElement(13);
			da.putElement(14);
			for(int i=0 ;i<da.getSize();i++) {
				System.out.println(da.get(i));
			}

	}
}