package bai1MangTrongJAVA;
import java.util.*;
public class JA2_1_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
Scanner sc=new Scanner(System.in);
do {
	System.out.println("nhap tong so phan tu cua mang");
	n=sc.nextInt();
}while(n<=0);
int [] a=new int [n];
int [] chan=new int[n];
int [] le=new int[n];
for(int i=0;i<n;i++)
{
	System.out.println("nhap phan tu thu"+i+":");
	a[i]=sc.nextInt();
}
int b=0,c=0;
for(int i=0;i<n;i++)
{
	if(a[i]%2==0)
	{
		chan[b]=a[i];
		b++;
	}else {
		le[c]=a[i];
		c++;
	}
}
System.out.println("so phan tu cua mang chan la");
for(int i=0;i<b;i++)
{
	System.out.println(chan[i]+"\t");
}
System.out.println("\nso phan tu o vi  tri le la:");
for(int i=0;i<c;i++)
{
	System.out.println(le[i]+"\t");
}
	}
}

