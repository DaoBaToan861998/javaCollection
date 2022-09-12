package bai2ListJAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class JA2_2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stuA
ArrayList<Integer> lst= new ArrayList<>();
Scanner sc= new Scanner(System.in);
int so;
System.out.println("nhap tong so phan tu cua mang ");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
	System.out.println("nhap phan tu thu"+i+":");
	so=sc.nextInt();
	lst.add(so);
}
int max=lst.get(0);
int min=lst.get(0);
for(int i=1;i<lst.size();i++)
{
	if(lst.get(i).compareTo(max)>0) {
		max=lst.get(i);
	}else if(lst.get(i).compareTo(min)<0)
	{
		min=lst.get(i);
	}
		
}
System.out.println("phan tu lon nhat trong mang la"+max);
System.out.println("phan tu nho nhat trong mang la"+min);
	}

}
