package sopan.lang;

import java.lang.CharSequence;
import java.lang.Character;
import java.lang.Comparable;
import java.lang.Math;
import java.lang.Override;
import java.lang.String;

public class MyString implements CharSequence,Comparable<MyString>{

	private char value [];
	private int hash;
	
	public MyString() {
		this.value=new char[0];
	}
	
	public MyString(String s) {
		this.value=s.toCharArray();
	}
	
	public MyString(MyString another) {
		this.value=another.value;
		this.hash=another.hash;
	}
	
	public MyString(char [] another) {
		this.value=another;
	}
	
	public int hashCode() {
		int h=this.hash;
		char []value=this.value;
		if(h==0&& this.value.length>0) {
			for(int i=0;i<value.length;i++)
			{			
				h= 31*h + value[i];			
			}
			this.hash=h;
		}
		return h;
	}
	
	public char charAt(int index) {
		if(index<0 || index>=this.value.length) {
			throw new StringOutOfBoundException(index);
		}		
		return this.value[index];
	}
	
	@Override
	public int length() {
		return this.value.length;
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		
		if(start<0 ||start>=this.value.length) {
			throw new StringOutOfBoundException(start);
		}
		if(end<0 ||end>=this.value.length) {
			throw new StringOutOfBoundException(end);		
		}
		
		char []value=this.value;
		char []n= new char[value.length]; 
		for(int i=start;i<end;i++) {
			n[i]=value[i];
		}		
		return new MyString(n);
	}
	
	public MyString subString(int start, int end) {
		if(start<0 ||start>=this.value.length) {
			throw new StringOutOfBoundException(start);
		}
		if(end<0 ||end>=this.value.length) {
			throw new StringOutOfBoundException(end);		
		}
		
		char []value=this.value;
		char []n= new char[value.length]; 
		for(int i=start;i<end;i++) {
			n[i]=value[i];
		}		
		return new MyString(n);		
	}

	@Override
	public int compareTo(MyString obj) {
	
		char []first=this.value;
		char []second=obj.value;
		int len1=first.length;
		int len2=second.length;
		int lem=Math.min(len1, len2);
		
		for(int i=0;i<lem;i++) {
			if(first[i]!=second[i]) {
				return first[i]-second[i];
			}
		}
		
		return len1-len2;		
	}
	
	public MyString toLowerCase() {
		
		char []first=this.value;
		char []second= new char[first.length];
		for(int i=0;i<first.length;i++) {
			second[i]=Character.toLowerCase(first[i]);
		}
		return new MyString(second);
	}
	
	public MyString toUpperCase() {
		char []first=this.value;
		char []second= new char[first.length];
		for(int i=0;i<first.length;i++) {
			second[i]=Character.toUpperCase(first[i]);
		}
		return new MyString(second);
	}
	
	@Override
	public String toString() {
		return new String(this.value);
	}
	
	public char[] toCharArray() {
		return this.value;
	}
	
}
