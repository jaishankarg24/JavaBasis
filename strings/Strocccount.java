package com.java1.basic.strings;
public class Strocccount {
public static void main(String[] args) {
	String st="CHANDana";
	int c[]=new int[129];
	for (int i = 0; i < st.length(); i++) 
	{
		c[st.charAt(i)]++;
		
	}
	for(int i=0;i<c.length;i++)
	{
		if(c[i]!=0)
			System.out.println((char)i+"......"+c[i]);
	}
}
}
