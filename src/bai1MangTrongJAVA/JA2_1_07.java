package bai1MangTrongJAVA;
import java.util.*;
public class JA2_1_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {1,4,2,5,6,5};
int so=5;
Arrays.sort(a);
System.out.println("mang sau khi sap xep la");
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]+" ");
}
System.out.println("vi tri dau tien xuat hien cua so"+so+"la"+Arrays.binarySearch(a, 5));
	}

}
