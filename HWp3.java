package Homework0521;

import java.util.Scanner;

public class HWp3 {

	public static void main(String[] args) {
		
		
		// 자연수 n을 입력받아 출력 예와 같이 공백으로 구분하여 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 3입력
		
		
		
	
		for(int i = 0; i < n; i++) //n = 3 /i =1 / i =2
		{
			int num = 1;
			
			for(int z = n-1 -i; z > 0 ; z--)  // 2 ; 2>0 ;  두 번 공백 발생 / z =1 한번 공백 / 성립x
			{
				System.out.println(" ");
			}
			
			for (int j = 0; j < i +1 ; j++) // 0; 0<1;  한번 num 출력 // 0 <  2 두번 수 출력 / j =3 3번출력 
				
				
				
			{
				System.out.println(num + " ");
				num++;
			}
			
			System.out.println();
			
		}
		
		
		
		
		
	}

}
