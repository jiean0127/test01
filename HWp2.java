package Homework0521;

import java.util.Scanner;

public class HWp2 {

	public static void main(String[] args) {
		// 100�� ���� ������ �迭 ���� �� ���� �Է¹���
				// 0 �ԷµǸ� 0�� �����ϰ� �� ������ �Էµ� ���� ������ ���
				Scanner sc = new Scanner(System.in);
				int len = 0;
				int[] Arr = new int[100];
				
				
				for(int i = 0; i <100 ; i++)
				{
					int n = sc.nextInt();
					
					if(n == 0)
						break;
					
					
					Arr[i] = n;
					len ++;
					
					
				}
				
		
				for(int i = len - 1; i >=  0; i--)
				{
					System.out.println(Arr[i]+" ");
				}
		
				

	}

}
