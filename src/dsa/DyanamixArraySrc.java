package dsa;

import java.util.Arrays;

public class DyanamixArraySrc<T> {
Object[] data;
int size;
	public DyanamixArraySrc(){
		// TODO Auto-generated constructor stub
		size= 0;
		data = new Object[1];
		}
		public int getSize() {
			return data.length;
		}
		public T get(int index)
		{
			return (T) data[index];
		}
		public void putElement(Object ele) {
			ensureCap(size+1);
			data[size++]=ele;
			
		}
		private void ensureCap(int minCap)
		{
			int oldCap=getSize();
			if(minCap>=oldCap) {
				int newCap = 0;
				if(newCap>minCap) {
					newCap=minCap;
				}
			    newCap=oldCap*2;
				data=Arrays.copyOf(data, newCap);
			}
		}
		
}


