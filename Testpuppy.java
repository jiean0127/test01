package test01;

import java.util.Scanner;

public class Testpuppy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		String[] name = {"������","������","�����","���ұ�","���"};
		String[] nick = {"Bear", "Gift","White","sesame","Black"};
		
		
	System.out.println("������ �̸��� �Է��Ͻÿ� :");
	String str =sc.nextLine();
	
	for(int i = 0;i <5; i++)
	{
		if(str.equals(name[i]))	{
			
			System.out.println("> "+nick[i]);
		//	br eak; 
		}
		else {
			System.out.println(" ��ϵ��� �ʾҽ��ϴ�");
		}
	
	}
		
	}

}
