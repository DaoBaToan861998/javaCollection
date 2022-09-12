package bai1MangTrongJAVA;
import java.util.*;
public class JA2_1_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n;
do {
	System.out.println("nhap gi tri cua n");
	n=sc.nextInt();
}while(n<0);
char[] arr=String.valueOf(n).toCharArray();
boolean b=true;
for(int i=0;i<arr.length-1;i++)
{
	if(arr[i+1] <arr[i])
	{
		b=false;
		break;
	}
}
if(b)
{
	System.out.println("so tang dan");
}else
	System.out.println("so ko hop le");
}
	}

