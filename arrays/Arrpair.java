package com.java1.basic.javaprogm.arrays;

public class Arrpair {
	public static void main(String[] args) {
		int ar[]={34,16,5,43,23,46,12};
		int n=28;
		for (int i = 0; i < ar.length-1; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]+ar[j]==n)
				{
					System.out.println(ar[i]+" ,"+ar[j]);
				}
			}
		}
	}

}
