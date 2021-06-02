package dsa;
import java.util.*;
import java.io.*;
public class Dyna_Array {
	private int[] items;
	private int  count=0;
	public Dyna_Array(int n){

	    items=new int[n];
	}

	public void print() {
	
		for(int i=0;i<count;i++) {
			System.out.println(items[i]);
		}
		
	}
	public void insert(int item) {
		if(count<0||count>items.length) {
			throw new IllegalArgumentException();
		}
		if(count==items.length) {
			int[] newarr=new int[count*2];
			for(int i=0;i<count;i++) {
				newarr[i]=items[i];
			}
			items=newarr;
		}
		items[count++]=item;
	}
	public void  remove(int index) {
		if(index>count || index <0) {
			System.out.println("Element not found");
		}
		for(int i=index;i<count;i++) {
			items[i]=items[i+1];
		}
		count--;
	}
	public int indexOf(int item) {
		for(int i=0;i<count;i++) {
			if(items[i]==item) {
				return i;
			}
		}
		return -1;
	}
}
