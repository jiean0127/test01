package Homework0521;

import java.util.Scanner;

public class HWp6 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int temp;
		for(int i = 0; i < 10 ; i++)
		{						   //0  1   2  3  4  5  6  7  8  9
			num[i] = sc.nextInt(); //95 100 88 65 76 89 58 93 77 99
		
		}
		
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 9 - i; j++) {
				if (num[j] < num[j + 1]) {   // 95 < 100     / 3,4
					temp = num[j];			 // temp = 95		65
					num[j] = num[j + 1]; 	   // num[0] = 100   3= 76
					num[j + 1] = temp;       // num[1] = 95		4 = 65  4== 89 5 == 76
				}
			}									// j = 3
									
		}
		
		
		for(int i : num)
			System.out.println(i + " ");
	}
	
}