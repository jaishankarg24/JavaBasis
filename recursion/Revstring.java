package com.java1.basic.recursion;
public class Revstring {
	public static void main(String[] args) {
		String st="chandu";
		System.out.println("the reverse string is:");
		reverse(st,0);
	}
	
	static void reverse(String st,int i)
	{
		
		if(i<st.length()-1)
			reverse(st,i+1);
		System.out.print(st.charAt(i));
	}

}
