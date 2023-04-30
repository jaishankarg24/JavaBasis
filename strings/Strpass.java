package com.java1.basic.strings;import java.util.Scanner;

public class Strpass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr your sentence");
		String st=sc.nextLine();

		char ch[]=st.toCharArray();
		int up=0,sl=0,di=0,sp=0,space=0;
		
		
			for(int i=0;i<ch.length;i++)
			{
				if(ch.length>=8)
				{
				if(ch[i]>='A'&& ch[i]<='Z')
				{
					up++;
				}
				else  if(ch[i]>='a'&&ch[i]<='z')
               {
	           sl++;
               }
				else if(ch[i]>='0'&&ch[i]<='9')
					di++;
				else if(ch[i]==' ')
					space++;
				else
					sp++;
			}	
			}
	
			if(di==0||up==0||sl==0||sp==0||space!=0)
				System.out.println("invalid password");
			else
				System.out.println("valid password");
				}
	}		
				
		
		
		


	
