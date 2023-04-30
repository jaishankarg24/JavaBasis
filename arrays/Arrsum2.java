package com.java1.basic.javaprogm.arrays;public class Arrsum2 {
	public static void main(String[] args) {
		int ar[]={2,3,4,5};
		int big=ar[0]+ar[1];
		int index=0;
		for (int i = 1; i < ar.length-1; i++) {
			if(ar[i]+ar[i+1]>big)
			{
				big=ar[i]+ar[i+1];
				index=i;
				
			}
		}
		System.out.println(" sum of 2 continous nos"+big);
		System.out.println(ar[index]+" "+ar[index+1]);
	}

}
