package com.java1.basic.javaprogm.arrays;public class Arrsmall12 {
	public static void main(String[] args) {
		
	
	int ar[]={45,89,66,78,8,42};
	int fsmall=ar[0],ssmall=ar[1];
	for (int i = 1; i < ar.length; i++) {
		if(ar[i]<fsmall)
		{
			ssmall=fsmall;
			fsmall=ar[i];
		}
		else
			if(ar[i]<ssmall&&ar[i]!=fsmall)
			{
				ssmall=ar[i];
			}
	}
		System.out.println(fsmall);
		System.out.println(ssmall);
	
	



	}
	

}