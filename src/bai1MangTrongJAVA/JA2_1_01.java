package bai1MangTrongJAVA;
import java.util.*;
public class JA2_1_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,tong=0;
		Scanner sc=new Scanner(System.in);
		while(n<=0) {
			System.out.println("nhap trong so phan tu cua mang");
			n=sc.nextInt();
		}
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("nhap cac phan tu");
			System.out.println("a["+i+"]");
			arr[i]=sc.nextInt();
			tong+=arr[i];
		}
		System.out.println("tong so phan tu cua mang la :"+tong);
	}

}
