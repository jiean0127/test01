package Homework0521;

import java.util.Scanner;

public class HWp3 {

	public static void main(String[] args) {
		
		
		// �ڿ��� n�� �Է¹޾� ��� ���� ���� �������� �����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 3�Է�
		
		
		
	
		for(int i = 0; i < n; i++) //n = 3 /i =1 / i =2
		{
			int num = 1;
			
			for(int z = n-1 -i; z > 0 ; z--)  // 2 ; 2>0 ;  �� �� ���� �߻� / z =1 �ѹ� ���� / ����x
			{
				System.out.println(" ");
			}
			
			for (int j = 0; j < i +1 ; j++) // 0; 0<1;  �ѹ� num ��� // 0 <  2 �ι� �� ��� / j =3 3����� 
				
				
				
			{
				System.out.println(num + " ");
				num++;
			}
			
			System.out.println();
			
		}
		
		
		
		
		
	}

}
