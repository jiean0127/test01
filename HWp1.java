package Homework0521;

import java.util.Scanner;

public class HWp1 {
	public static void main(String[] args) {
		// n(3 <= n <= 10) �Է¹޾� ������ �ﰢ�� ���
	
	 Scanner sc = new Scanner(System.in);
	 
	 int n = sc.nextInt();
	 
	 char c = 'A';
	 
	 if  (n <3  || n >10)
	 {
		 System.out.println("���ڿ���");
		 return;
	 }
	 
	 for (int i = 0; i < n ;i++) // ��
	 {
		 for(int j = 0; j < n-i ; j++) //�డ��
		 {
			 if ( c == 91)
				 c = 'A';
			 System.out.println(c);
			 c++;
		 }
		 
		 System.out.println();
	 }
	
	
	
	
	}
}