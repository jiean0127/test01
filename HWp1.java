package Homework0521;

import java.util.Scanner;

public class HWp1 {
	public static void main(String[] args) {
		// n(3 <= n <= 10) 입력받아 영문자 삼각형 출력
	
	 Scanner sc = new Scanner(System.in);
	 
	 int n = sc.nextInt();
	 
	 char c = 'A';
	 
	 if  (n <3  || n >10)
	 {
		 System.out.println("숫자오류");
		 return;
	 }
	 
	 for (int i = 0; i < n ;i++) // 열
	 {
		 for(int j = 0; j < n-i ; j++) //행가로
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