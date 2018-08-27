package org.prog;

public class Ascending {
	public static void main(String[] args) {
		int a[] = new int[5];int temp=0;
		a[0]=23;
		a[1]=15;
		a[2]=53;
		a[3]=20;
		a[4]=87;
		int len = a.length;
		System.out.println(len);
		for(int i =0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(a[i]>a[j]) {//23>15
					temp=a[i]; //temp = 23
				    a[i]=a[j];//a[i] =15
				    a[j]=temp;//a[j]=23
			}
		}
		
	}
		for(int d:a){
			System.out.println(d);}
}
	}

