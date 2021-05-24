package test01;

import java.util.Scanner;

public class Testpuppy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		String[] name = {"곰돌이","복돌이","흰둥이","깨소금","까만콩"};
		String[] nick = {"Bear", "Gift","White","sesame","Black"};
		
		
	System.out.println("강아지 이름을 입력하시오 :");
	String str =sc.nextLine();
	
	for(int i = 0;i <5; i++)
	{
		if(str.equals(name[i]))	{
			
			System.out.println("> "+nick[i]);
		//	br eak; 
		}
		else {
			System.out.println(" 등록되지 않았습니다");
		}
	
	}
		
	}

}
