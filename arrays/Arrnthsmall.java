package com.java1.basic.javaprogm.arrays;public class Arrnthsmall {
	public static void main(String[] args) {
		int ar[]={34,56,78,43,23,46,12};
                 
		int small=nthsmall(ar,4);
		System.out.println("4th smallest element:"+ small);
	}

	 static int nthsmall(int  ar[], int n) {
	for(int i=0;i<ar.length;i++)
	{
		int sc=0;
		for (int j = 0;  j < ar.length; j++)
		{
			if(ar[j]<ar[i])
			{
				sc++;
			}
		}
	
	
		if(sc==n-1)
	
			return ar[i];
}
return 0;
	
	
	
	
}

}
