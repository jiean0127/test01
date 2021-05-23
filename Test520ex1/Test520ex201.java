package Test520ex1;

import java.util.Scanner;

public class Test520ex201 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int a = sc.nextInt();
		 char ch = 'A';
		 int b = 0;
		 
		 for (int i = 0; i < a; i++)
		 {
			 for(int j =0; j<= a-1-i; j++) {
				 System.out.println(ch++ + " ");
			 }
			 for(int j = 0; j < i;j++)
			 {
				 System.out.println(b++ + " ");
				 
			 }
			 System.out.println();
			 
			 
		 }		
		
		
	}

}

