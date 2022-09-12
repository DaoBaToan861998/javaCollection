package bai1MangTrongJAVA;
import java.util.*;
public class JA2_1_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,4,7,8,6,3,2,5};
System.out.println("gia tri trung binh cua mang a la:");
int tong=0;
for(int i=0;i<arr.length;i++)
{
	tong+=arr[i];
}
System.out.println(tong/9);
	}
}
