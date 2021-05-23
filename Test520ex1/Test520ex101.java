package Test520ex1;

import java.util.Scanner;

public class Test520ex101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0;   
		int cnt =0;
		int y = -1;
		System.out.println("수 입력:");
		int num = sc. nextInt();
		
		while (true) {
			if(sum >= num) {
				break;
			}
			y = y+2;
			sum = sum +y;
			cnt++;

	}
			System.out.println("횟수 :"+cnt + "총합 : " + sum);
	}
}

