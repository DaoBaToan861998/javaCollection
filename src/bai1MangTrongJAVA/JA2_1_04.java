package bai1MangTrongJAVA;
import java.util.*;
public class JA2_1_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] arr1= {{1,3,4},{2,4,3},{3,4,5}};
int [][] arr2= {{1,3,4},{2,4,3},{1,2,4}};
int [][] arr3=new int[3][3];
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
	arr3[i][j]=arr1[i][j]+arr2[i][j];	
	System.out.println(arr3[i][j]+"");
	}
}
System.out.println("");
	}
}
