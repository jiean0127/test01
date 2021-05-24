package Homework0521;

import java.util.Scanner;

public class HWp4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] in = new int[10];
		
		while(true)
		{
			int n = sc.nextInt();
			
			if (n == 0)
				break;
			if (n < 0 || n > 100 )
				continue;
			
			in[n / 10]++;
			
		}
		
		
		
		for (int i =  0 ; i < 10 ; i++)
		{
			if (in[i] == 0)
				continue;
			
			
			System.out.println(i + " = " + in[i]);
			
			
			
			
			
		}
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
	}


