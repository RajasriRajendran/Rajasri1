package org.prog;

public class FindMax {
	public static void main(String[] args) {
		int a[] = {23,98,67,54,45};
		int temp=0;
		int len = a.length;
		System.out.println(len);
		for(int i =0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i =0;i<len;i++) {
			System.out.println(a[i]);
		}
			System.out.println("min:" +a[0] );
			System.out.println("2 nd max:" +a[(a.length)-2] );
			System.out.println("max:" +a[(a.length)-1] );
		}
			
	}


