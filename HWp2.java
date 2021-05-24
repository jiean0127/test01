package Homework0521;

import java.util.Scanner;

public class HWp2 {

	public static void main(String[] args) {
		// 100개 정수 저장할 배열 선언 후 정수 입력받음
				// 0 입력되면 0을 제외하고 그 때까지 입력된 정수 역으로 출력
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
