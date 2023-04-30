package com.java1.basic.javaprogm.arrays;public class Arrnthbig {
	public static void main(String[] args) {
		int ar[]={34,56,78,43,23,46,12};
                 
		int big=nthbiggest(ar,4);
		System.out.println("4th biggest element:"+big);
	}

	private static int nthbiggest(int  ar[], int n) {
	for(int i=0;i<ar.length;i++)
	{
		int bc=0;
		for (int j = 0;  j < ar.length; j++)
		{
			if(ar[j]>ar[i])
			{
				bc++;
			}
		}
	
	
		if(bc==n-1)
	
			return ar[i];
}
return 0;
	
	
	
	
}

}
