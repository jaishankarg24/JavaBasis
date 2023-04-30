package com.java1.basic.javaprogm.arrays;public class Arrbig12 {
	public static void main(String[] args) {
		
	
	int ar[]={45,89,66,78,8,42};
	int fbig=ar[0],sbig=ar[1];
	for (int i = 1; i < ar.length; i++) {
		if(ar[i]>fbig)
		{
			sbig=fbig;
			fbig=ar[i];
		}
		else
			if(ar[i]>sbig&&ar[i]!=fbig)
			{
				sbig=ar[i];
			}
	}
		System.out.println(sbig);
		System.out.println(fbig);
	
	



	}
	

}